package com.home.repositories;

import org.springframework.data.repository.CrudRepository;

import com.home.entity.UserInfo;

public interface UserRepository extends CrudRepository<UserInfo, Integer> {
       UserInfo findByUsername(String username);
}
