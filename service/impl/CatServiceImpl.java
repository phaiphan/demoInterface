package service.impl;

import service.IEatService;
import service.ISleepService;

public class CatServiceImpl implements IEatService, ISleepService {

    private String color;

    public CatServiceImpl(){
        color= "black";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String eat() {
        return "Meo Meo";
    }

    @Override
    public String sleep() {
        return "kho kho";
    }
}
