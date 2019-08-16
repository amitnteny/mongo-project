package com.practice.mongoProject.service;

import com.practice.mongoProject.domain.Data;
import com.practice.mongoProject.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    private DataRepository repository;

    @Autowired
    public DataService(DataRepository repository) {
        this.repository = repository;
    }

    public List<Data> getAllData() {
        return repository.findAll();
    }

    public Data getData(String dataId) {
        return repository.findOne(dataId);
    }

    public void saveData(Data data) {
        repository.save(data);
    }

}
