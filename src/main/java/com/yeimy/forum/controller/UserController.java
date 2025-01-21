package com.yeimy.forum.controller;

import com.yeimy.forum.model.User;
import com.yeimy.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }

    // @Autowired
    // private PasswordEncoder passwordEncoder;

    // @Autowired
    // private JwtUtil jwtUtil;

    // @PostMapping("/register")
    // public Map<String, String> registerUser(@RequestBody User user) {
    //     user.setPassword(passwordEncoder.encode(user.getPassword()));
    //     userService.createUser(user);

    //     Map<String, String> response = new HashMap<>();
    //     response.put("message", "User registered successfully");
    //     return response;
    // }

    // @PostMapping("/login")
    // public Map<String, String> authenticateUser(@RequestBody Map<String, String> credentials) {
    //     String email = credentials.get("email");
    //     String password = credentials.get("password");

    //     User user = userService.getUserByEmail(email);

    //     if (user != null && passwordEncoder.matches(password, user.getPassword())) {
    //         String token = jwtUtil.generateToken(user);

    //         Map<String, String> response = new HashMap<>();
    //         response.put("token", token);
    //         return response;
    //     } else {
    //         throw new RuntimeException("Invalid email or password");
    //     }
    // }
}
