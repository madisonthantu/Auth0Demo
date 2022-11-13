package com.example.maven_auth0_demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Default request handler.
 */
@RestController
public class BaseController {

  @RequestMapping("/")
  public String home() {
    return "I'm a software engineer";
  }

}
