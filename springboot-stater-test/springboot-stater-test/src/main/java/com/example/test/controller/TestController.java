package com.example.test.controller;

import com.zhl.stater.service.PlayService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Lazy
@RestController
@RequestMapping("/stater")
@RequiredArgsConstructor
public class TestController {

    private final PlayService playService;

    @GetMapping("/play")
    public String play() {
        return playService.zhlPlay();
    }

}
