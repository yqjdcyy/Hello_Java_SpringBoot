package com.yao.user.service;

import com.yao.user.entity.User;
import com.yao.user.vo.UserVo;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2018/10/19
 * For:
 * Other:
 */
public interface UserService {

    User findByUsername(String name);

    List<User> list();

    void login(String username, String password, HttpSession session);

    void logout(HttpSession session);

    void login(UserVo user, HttpSession session);
}
