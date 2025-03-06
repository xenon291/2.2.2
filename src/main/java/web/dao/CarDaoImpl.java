package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Volkswagen", "Passat", 2010));
        cars.add(new Car("BMW", "X5", 2019));
        cars.add(new Car("Shkoda", "Octavia", 2018));
        cars.add(new Car("Volkswagen", "Touareg", 2010));
        cars.add(new Car("Mercedes", "GLE", 2019));
    }


    @Override
    public List<Car> listCars(int id) {
        return new ArrayList<>(cars);

    }
}
