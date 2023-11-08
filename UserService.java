package com.home.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.home.entity.UserInfo;
import com.home.repositories.UserRepository;

@Service
public class UserService {
	 
    @Autowired
    private UserRepository userRepository;

   // You'll need to configure a password encoder bean
    @Transactional
    public void register(UserInfo user) 
    {
        
      userRepository.save(user);
    }
    @Transactional
    public boolean authenticate(UserInfo user) {
    	   UserInfo storedUser = userRepository.findByUsername(user.getUsername());

    	    // Check if the user exists
    	    if (storedUser == null) {
    	        return false;
    	    }

    	    return true;
    }
    public UserInfo getUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
}
}