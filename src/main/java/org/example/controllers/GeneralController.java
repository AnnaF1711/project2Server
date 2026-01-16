package org.example.controllers;
import org.example.DataBase.DBManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GeneralController {

    @Autowired
    private DBManager dbManager;


    @RequestMapping("/sign-in")
    public String signIn(){
        return "Server is alive!";
    }
}
