package com.example.eureka.api.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheckController {

  @GetMapping("/healthcheck")
  public String checkState () {
    return "Service-B: inst002 정상";
  }
  
}