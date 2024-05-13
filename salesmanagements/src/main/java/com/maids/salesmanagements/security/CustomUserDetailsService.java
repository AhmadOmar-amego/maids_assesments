//package com.maids.salesmanagements.security;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private final PasswordEncoder passwordEncoder;
//
//    public CustomUserDetailsService(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        // Implement your logic to load user details from your data source
//        // Return an instance of UserDetails that represents the authenticated user
//        // For simplicity, you can use the in-memory user details manager
//
//        // Example code to create a user with a hashed password
//        String encodedPassword = passwordEncoder.encode("password");
//        return User.builder()
//                .username(username)
//                .password(encodedPassword)
//                .roles("USER")
//                .build();
//    }
//}