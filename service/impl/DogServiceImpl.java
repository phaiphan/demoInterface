package service.impl;

import service.IEatService;

public class DogServiceImpl implements IEatService {
    @Override
    public String eat() {
        return "service.impl.Dog eat";
    }
}
