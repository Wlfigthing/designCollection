package com.example.designspringboot.Design.Visitor;

public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
