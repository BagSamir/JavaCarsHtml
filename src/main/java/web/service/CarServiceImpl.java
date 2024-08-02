package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Cars;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao;


    @Override
    public List<Cars> listCar(int count) {
        return carDao.getRequiredCars(count);
    }
}
