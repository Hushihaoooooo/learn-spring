package org.shihaohu.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ShiHaoHu
 * @date 2024/5/4 23:33
 * @description
 */
@Repository
@Scope("prototype")
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save...");
    }
    @PostConstruct
    public void init() {
        System.out.println("init...");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }
}
