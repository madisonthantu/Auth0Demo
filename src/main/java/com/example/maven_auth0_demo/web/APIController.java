package com.example.maven_auth0_demo.web;

import com.example.maven_auth0_demo.model.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests to "/api" endpoints.
 * @see com.auth0.example.security.SecurityConfig to see how these endpoints are protected.
 */
@RestController
@RequestMapping(path = "api", produces = MediaType.APPLICATION_JSON_VALUE)
// For simplicity of this sample, allow all origins. Real applications should configure CORS for their use case.
@CrossOrigin(origins = "*")
public class APIController {

  @GetMapping(value = "/public")
  public Message publicEndpoint() {
    return new Message("All good. You DO NOT need to be authenticated to call /api/public.");
  }

  @GetMapping(value = "/private")
  public Message privateEndpoint() {
    return new Message("All good. You can see this because you are Authenticated.");
  }

  @GetMapping(value = "/private-scoped")
  public Message privateScopedEndpoint() {
    return new Message("All good. You can see this because you are Authenticated with a Token granted the 'read:messages' scope");
  }

  @GetMapping(value = "/test-public")
  public Message testPublic() {
    return new Message("XD\nThis is a test ... let's see if it works xoxo\nXD");
  }

  @GetMapping(value = "/test-private-scoped")
  public Message testPrivateScoped() {
    return new Message("XDDDDDDDDDDDD\nThis is a PRIVATE-SCOPED test ... let's see if it works xoxo\nXD");
  }

}