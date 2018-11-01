package com.nexign.didemo.controllers;

import com.nexign.didemo.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
