package com.mapper;

import com.cy.User;

import java.util.List;

public interface Usermapper {
    public List<User> select();
    public int add(User user);
    public int del(int i);
}
