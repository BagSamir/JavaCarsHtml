package web.service;

import web.model.Cars;

import java.util.List;

public interface CarService {
    List<Cars> listCar(int count);
}
