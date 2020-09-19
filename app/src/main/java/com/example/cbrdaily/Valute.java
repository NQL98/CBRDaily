package com.example.cbrdaily;

public class Valute {

    public String name;
    public String value;

    public Valute(){

    }

    public Valute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
