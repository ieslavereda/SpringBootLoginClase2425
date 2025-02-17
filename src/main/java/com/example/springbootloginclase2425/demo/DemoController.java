package com.example.springbootloginclase2425.demo;

import com.example.springbootloginclase2425.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DemoController {

    @GetMapping(value = "demo")
    public String wellcome(@AuthenticationPrincipal User user) {
        return "Wellcome "+ user.getUsername() +" from secure endpoint ";
    }
}
