package com.gy.jcartadministration.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/interview")
public class ImageController {
    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile image){
        return null;
    }
}
