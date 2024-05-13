//package com.maids.salesmanagements.users;
//
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class UserController {
//
//    private final UserService userService;
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//    @PostMapping("/register")
//    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationDTO userDTO) {
//        userService.registerUser(userDTO);
//        return ResponseEntity.ok("User registered successfully");
//    }
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody UserLoginDTO userDTO) {
//        // Perform authentication logic
//        // Return appropriate response or token
//        return ResponseEntity.ok("Login successful");
//    }
//    @PostMapping("/logout")
//    public ResponseEntity<?> logout() {
//        // Perform logout logic
//        // Invalidate token or session
//        return ResponseEntity.ok("Logout successful");
//    }
//}