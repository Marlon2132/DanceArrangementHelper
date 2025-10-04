package com.github.marlon2132.dancearrangementhelper;

import javafx.scene.layout.StackPane;

public class Dancer extends StackPane {
    private int number_;
    private String name_;

    public Dancer(int number, String name) {
        setNumber(number);
        setName(name);
    }

    public void setNumber(int number) {
        this.number_ = number;
    }

    public int getNumber() {
        return number_;
    }

    public void setName(String name) {
        this.name_ = name;
    }

    public String getName() {
        return name_;
    }
}
