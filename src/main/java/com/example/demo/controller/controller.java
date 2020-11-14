package com.example.demo.controller;

import com.example.demo.entities.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping(value = "/")
    public String index(Model model){
        model.addAttribute(new Person());
        return "index";
    }

    @RequestMapping(value="/getobj")
    public String getobjfromclient(@ModelAttribute Person person){
        System.out.println(" Nom : "+person.getNom()+" Prenom : "+person.getPrenom()+" Age : "+person.getAge());
        return "index";
    }


}
