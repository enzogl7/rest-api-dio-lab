package com.ogl.domain.service;

import com.ogl.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User user);
}
