package com.example.demo.bsl;

import com.example.demo.model.Personal;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Personalbsl {
    private final List<Personal> TablePersonal;

    public Personalbsl() {
        TablePersonal=new ArrayList<>();
    }

    public String  add(Personal personal) {
        for (Personal personalbs : TablePersonal) {
            if(personalbs.getId()==personal.getId()){
                return "this is arrdy in Database";
            }

        }
        TablePersonal.add(personal);
        return "success";

    }

    public Personal get(int id) {
        for (Personal personal : TablePersonal) {
            if(personal.getId()==id){
                return personal;
            }
        }
        return null;
    }
}
