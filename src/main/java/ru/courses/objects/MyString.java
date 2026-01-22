package ru.courses.objects;

import ru.courses.Measurable;

public class MyString implements Measurable {
    private String string;

    public MyString(String string){
        this.string = string;
    }

    @Override
    public double getLength(){
        return string.length();
    }
}