package com.practice.mongoProject.controller;

import com.practice.mongoProject.domain.*;
import com.practice.mongoProject.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/mongo")
public class MainController {

    private DataService dataService;
    private String propertyValue;

    @Autowired
    public MainController(DataService dataService, @Value("${property.value}") String propertyValue) {
        this.dataService = dataService;
        this.propertyValue = propertyValue;
    }


    @GetMapping("/getAll")
    @ResponseBody
    public List<Data> getAllData() {
        return dataService.getAllData();
    }

    @GetMapping("/getData")
    @ResponseBody
    public Data getData(@RequestParam String dataId) {
        return dataService.getData(dataId);
    }

    @PostMapping("/saveData")
    public void saveData(@RequestBody Data data) {
        dataService.saveData(data);
    }

    @PostMapping("/getAnimal")
    public String getAnimal(@RequestBody AnimalRequestObject requestObject) {
        return requestObject.getAnimalType().getValue();
    }


    @GetMapping("/getVertebrae")
    public List<Vertebrae> getVertebrae() {
        Vertebrae vertebrae = new Vertebrae();
        Vertebrae vertebrae1 = new Vertebrae();
        vertebrae.setId(1);
        vertebrae1.setId(2);
        Animal dog = new Dog("Mutt", 10);
        Animal cat = new Cat("Goose", 10, true);
        vertebrae.setAnimal(cat);
        vertebrae1.setAnimals(Arrays.asList(dog, cat));
        List<Vertebrae> list = new ArrayList<>();
        list.add(vertebrae);
        list.add(vertebrae1);
        return list;
    }
}
