package br.com.desafios.candidatura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController("/")
    public class MyController {

        @GetMapping
        public String getPayments() {
            return "Hello, World!";
        }


    }


