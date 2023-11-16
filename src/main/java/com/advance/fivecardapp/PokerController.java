package com.advance.fivecardapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokerController {
    private final PlayPocker playPocker;
    @Autowired
    public PokerController(PlayPocker playPocker) {
        this.playPocker = playPocker;
    }

    @GetMapping("/evaluatePokerHand")
    public ResponseEntity evaluatePokerHand() {
        return  ResponseEntity.ok(playPocker.play());
    }
}
