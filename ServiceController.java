package com.home.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.entity.ServiceInfo;
import com.home.entity.UserInfo;
import com.home.services.HomeService;

@RestController
@RequestMapping("/services")
public class ServiceController {
    @Autowired
    private HomeService homeService;
    @PostMapping("/serve")
    public ResponseEntity<String> registerUser(@RequestBody ServiceInfo user) {
        homeService.registerService(user);
        return ResponseEntity.ok("User Service is registered successfully");
    }
    @GetMapping("/list")
    public ResponseEntity<List<ServiceInfo>> listServices() {
        List<ServiceInfo> services = homeService.getAllServices();
        return ResponseEntity.ok(services);
    }
}