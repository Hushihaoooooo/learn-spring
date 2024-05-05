package se.zust.edu.cn;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import se.zust.edu.cn.User;

import java.util.Arrays;
import java.util.List;

@Component
@Aspect
public class UserAspect {
    private static final Logger logger = LoggerFactory.getLogger(UserAspect.class);

    @Autowired
    private UserCache userCache;

    @Autowired
    private List<User> users;

    // DEBUG访问日志增强
    @After("execution(* se.zust.edu.cn.UserServiceImpl.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.warn("Method {} called with arguments: {}", methodName, Arrays.toString(args));
    }

    // 权限控制增强
    @Around("execution(* se.zust.edu.cn.UserServiceImpl.addUser(..)) || execution(* se.zust.edu.cn.UserServiceImpl.deleteUser(..))")
    public Object accessControl(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        String userName = userCache.getUserName();
        if (!"admin".equals(userName)) {
            logger.warn("Access denied for user {}", userName);
            return false;
        }
        logger.warn("Access granted for admin user {}", userName);
        return joinPoint.proceed();
    }
}
