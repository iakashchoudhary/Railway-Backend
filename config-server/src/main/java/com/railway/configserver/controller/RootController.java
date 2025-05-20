package com.railway.configserver.controller;

import com.railway.configserver.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class RootController {

    @GetMapping
    public ResponseEntity<ResponseDTO<String>> getRootStatus() {
        log.info("Received request at root endpoint '/'");
        ResponseDTO<String> response = new ResponseDTO<>(
                LocalDateTime.now(),
                true,
                "Welcome to the Railway Microservices Platform",
                "Config Server is up and running. You can check system status at /actuator/health or application info at /actuator/info."
        );
        log.info("Responding to root endpoint request with status message");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
