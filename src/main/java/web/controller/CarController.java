package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;
import java.util.Optional;


@Controller
public class CarController {


    private CarServiceImpl serviceCar;

    @Autowired
//    public CarController(ServiceCar carService) {
//        this.serviceCar = carService;
//    }

    public CarController(CarServiceImpl serviceCar) {
        this.serviceCar = serviceCar;
    }

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        model.addAttribute("cars", serviceCar.listCars(count.orElse(0)));
        return "cars";
    }
}
