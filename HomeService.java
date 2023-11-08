package com.home.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.entity.ServiceInfo;
import com.home.entity.UserInfo;
import com.home.repositories.ServiceRepository;


@Service
public class HomeService {
      @Autowired
      private ServiceRepository serviceRepository;
      public List<ServiceInfo> getAllServices() {
          return (List<ServiceInfo>) serviceRepository.findAll();
      }
	public void registerService(ServiceInfo user) {
		
		serviceRepository.save(user);
	}
}
