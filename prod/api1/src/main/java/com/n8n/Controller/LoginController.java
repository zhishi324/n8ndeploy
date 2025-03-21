package com.n8n.Controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @RequestMapping("/login")
    // 修改返回类型为 ResponseEntity<String>
    public ResponseEntity<String> login(ModelMap map, @RequestParam String username, @RequestParam String password) {

        // 这里简单模拟一个正确的用户名和密码
        String correctUsername = "admin";
        String correctPassword = "123456";

        if (correctUsername.equals(username) && correctPassword.equals(password)) {
            map.addAttribute("message", "success");
            // 返回成功响应
            return ResponseEntity.ok("success");
        } else {
            map.addAttribute("message", "fail");
            // 返回错误响应
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("fail");
        }

    }

}
