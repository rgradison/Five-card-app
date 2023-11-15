package com.advance.fivecardapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${numCards:5}")
    private int numCards;

    public int getNumCards() {
        return numCards;
    }
}
