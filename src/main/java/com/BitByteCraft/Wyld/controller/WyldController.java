package com.BitByteCraft.Wyld.controller;

import com.BitByteCraft.Wyld.service.WyldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController("/")
public class WyldController {

    @Autowired
    WyldService service;

    @GetMapping(path = "/test")
    public String test() {
        return "Working!!!";
    }

    @GetMapping(path = "/path")
    public ResponseEntity<String> checkIfPostIsEligible(@RequestParam String postUrl, @RequestParam String userId) throws URISyntaxException {
        service.checkIfPostIsEligible(postUrl, userId);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

}
