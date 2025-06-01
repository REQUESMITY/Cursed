package com.example.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    // Главная страница после успешной авторизации
    @GetMapping("/home")
    public String home(@AuthenticationPrincipal OAuth2User principal, Model model) {
        if (principal != null) {
            // Добавляем данные пользователя в модель
            model.addAttribute("name", principal.getAttribute("name"));
            model.addAttribute("email", principal.getAttribute("email")); // если доступно
            model.addAttribute("picture", principal.getAttribute("picture")); // если доступно
            return "/home"; // возвращает home.html
        }
        // Если пользователь не авторизован — редирект на логин
        return "redirect:/login";
    }

    // Страница логина
    @GetMapping("/login")
    public String login() {
        return "login"; // возвращает login.html
    }
}
