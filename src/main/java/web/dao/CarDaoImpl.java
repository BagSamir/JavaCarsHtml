package web.dao;

import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {
    private List<Cars> cars = new ArrayList<>();

    @Override
    public List<Cars> getAllCars(int count) {
        cars.add(new Cars("BMW", "Black", 200));
        cars.add(new Cars("Audi", "White", 100));
        cars.add(new Cars("Lada", "Silver", 300));
        cars.add(new Cars("Mercedes", "Red", 200));
        cars.add(new Cars("Volvo", "Blue", 1000));

        if (count == 0 || count >= 5) return cars;

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
