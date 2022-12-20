package com.example.demo.Controller;

import com.example.demo.bsl.Personalbsl;
import com.example.demo.model.Personal;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonalController {
    private Personalbsl personalbsl;

    public PersonalController(Personalbsl personalbsl) {
        this.personalbsl = personalbsl;
    }
    @PostMapping(value = "/persons")
    public String addPerson(@RequestBody Personal personal){
       return personalbsl.add(personal);
    }
    @GetMapping (value = "/persons/{id}")
    public Personal getPerson(@PathVariable("id") int id){
        return  personalbsl.get(id);
    }

}
