package se.zust.edu.cn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class UserServiceImpl implements UserServiceI {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserCache userCache;
    @Autowired
    private List<User> users;

    @Override
    public boolean login(String username, String password) {
        userCache.setUserName(username);
        userCache.setLoginTime(new Date());
        logger.info("User {} logged in at {}", username, userCache.getLoginTime());
        return true;
    }

    @Override
    public boolean logout() {
        String userName = userCache.getUserName();
        Date loginTime = userCache.getLoginTime();
        userCache.setUserName(null);
        userCache.setLoginTime(null);
        long elapsedTime = System.currentTimeMillis() - loginTime.getTime();
        logger.info("User {} logged out after {} milliseconds", userName, elapsedTime);
        return true;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
        logger.info("User {} added successfully", user.getUsername());
    }

    @Override
    public void updateUser(User user) {
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername())) {
                u.setUsername(user.getUsername());
                u.setEmail(user.getEmail());
                // Update other fields as needed
                logger.info("User {} updated successfully", user.getUsername());
                break;
            }
        }
    }

    @Override
    public void deleteUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                users.remove(user);
                logger.info("User {} deleted successfully", user.getUsername());
            }
        }
    }
}
