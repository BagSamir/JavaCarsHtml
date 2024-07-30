package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Cars;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    @Override
    public List<Cars> listCar(int count) {
        return carDao.getAllCars(count);
    }
}
