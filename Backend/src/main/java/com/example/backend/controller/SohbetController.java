package com.example.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sohbetbotu")
public class SohbetController {

    @Autowired
    private ChatGptService chatGptService;

    @PostMapping("/sor")
    public String sor(@RequestBody String kullaniciMesaji) {
        return chatGptService.sohbetEt(kullaniciMesaji);
    }
}