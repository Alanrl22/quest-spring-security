package com.wildcodeschool.theshield.theshield.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeToTheShieldController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Shield";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String bases() {
        return "Biarritz\n" +
                "Bordeaux\n" +
                "La Loupe \uD83C\uDF32\n" +
                "Lille\n" +
                "Lyon\n" +
                "Marseille\n" +
                "Nantes\n" +
                "Orléans\n" +
                "Paris\n" +
                "Reims\n" +
                "Strasbourg\n" +
                "Toulouse\n" +
                "Tours\n" +
                "Amsterdam\n" +
                "Barcelone\n" +
                "Berlin\n" +
                "Bruxelles\n" +
                "Bucarest\n" +
                "Budapest\n" +
                "Dublin\n" +
                "Lisbonne\n" +
                "Londres\n" +
                "Madrid\n" +
                "Milan";
    }

}
