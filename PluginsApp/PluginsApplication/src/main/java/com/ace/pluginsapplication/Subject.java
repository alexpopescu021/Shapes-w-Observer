/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;

import com.ace.pluginsapplication.interfaces.IShape;
import java.util.*;

/**
 *
 * @author Alex
 */ 
public  class Subject {
    private List<Observer> observers = new ArrayList<>();
    private IShape shape;

    public void add(Observer o) {
        observers.add(o);
    }

    public IShape getState() {
        return shape;
    }
    

    public void setState(IShape shape) {
        this.shape = shape;
        execute();
    }

    private void execute() {
        observers.forEach((observer) -> {
            observer.update();
        });
    }
}
