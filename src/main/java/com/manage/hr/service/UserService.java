package com.manage.hr.service;

import com.manage.hr.entity.User;
import com.manage.hr.util.PageSurport;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface UserService {
    int addUser(User user);
   PageSurport<User> findAllUser(User user, int pageIndex, int pageSize);

    int updateUser(User user);
    User findUserByID(  int userId);
    int login(String userCode,String password,User user);
    int delUserById( int userId);
    String findUserByCode( String userCode );
    int upd(int userId,String password);
    String  findUserByPass(String userName, int password);

}
