package com.mwtestconsultancy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.Random;

public class InfoModel {

    @JsonProperty
    private String status;
    @JsonProperty
    private Timestamp timestamp;
    @JsonProperty
    private String loggedInUser;

    public InfoModel() {
        this.status = "UP";
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.loggedInUser = selectRandomUser();
    }

    private String selectRandomUser(){
        String[] wordlist = {"Leonardo", "Donatello", "Raphael", "Michaelangelo"};

        return wordlist[new Random().nextInt(wordlist.length)];
    }
}
