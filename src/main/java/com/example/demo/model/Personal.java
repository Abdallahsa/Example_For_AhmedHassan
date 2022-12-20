package com.example.demo.model;

import java.util.Objects;

public class Personal {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Personal(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
