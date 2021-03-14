package com.example.secondtask.main.model;

import androidx.annotation.NonNull;

public class TetaMenza {

    private String first_name, last_name, workplace;
    private int age, OIB;

    public TetaMenza(String first_name, String last_name, String workplace, int age, int OIB) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.workplace = workplace;
        this.age = age;
        this.OIB = OIB;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getWorkplace() {
        return workplace;
    }

    public int getAge() {
        return age;
    }

    public int getOIB() {
        return OIB;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOIB(int OIB) {
        this.OIB = OIB;
    }

    @NonNull
    @Override
    public String toString() {
        return first_name+" "+last_name+" "+age+" "+OIB+" "+workplace+"\n";
    }
}
