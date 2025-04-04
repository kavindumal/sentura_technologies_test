package lk.ijse.sentura_test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final WeavyClient weavyClient;

    public UserController(WeavyClient weavyClient) {
        this.weavyClient = weavyClient;
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody String userJson) {
        try {
            String response = weavyClient.createUser(userJson);
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping
    public ResponseEntity<String> listUsers() {
        try {
            String response = weavyClient.listUsers();
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}