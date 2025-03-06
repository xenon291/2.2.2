package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements ServiceCar {

    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

//    @Autowired


    @Override
    public List<Car> listCars(int id){
        List<Car> cars = carDao.listCars(id);
        if (id <= 0 || id > cars.size()) {
            return cars;
        }
        return cars.subList(0, id);

    }


}
