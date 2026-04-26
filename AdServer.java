package com.earningbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@SpringBootApplication
@RestController
public class AdServer {

    public static void main(String[] args) {
        SpringApplication.run(AdServer.class, args);
    }

    // ✅ CORREGIDO: ahora responde en /api/ad
    @GetMapping("/api/ad")
    public ResponseEntity<String> getAd(@RequestParam("user_id") String userId) {
        String adsterraAdUrl = "http://pl26780328.profitableratecpm.com/2e/7b/58/2e7b58d34093cfaae6a3392a1b1d6043";
        return new ResponseEntity<>("{\"ad_url\": \"" + adsterraAdUrl + "\"}", HttpStatus.OK);
    }
}