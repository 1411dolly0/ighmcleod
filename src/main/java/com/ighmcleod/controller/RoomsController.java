package com.ighmcleod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoomsController {

    @GetMapping("/rooms")
    public String rooms() {
        return "rooms";
    }

}