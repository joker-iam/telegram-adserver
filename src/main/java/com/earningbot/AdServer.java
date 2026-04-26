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
        String adsterraAdUrl = "https://www.profitablecpmratenetwork.com/nsncw0p4iu?key=a6092a543b8f3df09a8a20878de7f297";
        return new ResponseEntity<>("{\"ad_url\": \"" + adsterraAdUrl + "\"}", HttpStatus.OK);
    }

@GetMapping("/ping")
public ResponseEntity<String> ping() {
    return ResponseEntity.ok("{\"status\":\"ok\"}");
}
}