package com.nico.Springshit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TimeController {

    @GetMapping("/time")
    public Date time() {
        return new Date(System.currentTimeMillis());
    }
}
