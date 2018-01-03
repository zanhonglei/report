package com.founder.report.service;

import com.founder.report.entity.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);


}

