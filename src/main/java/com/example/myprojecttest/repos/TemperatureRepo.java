package com.example.myprojecttest.repos;

import com.example.myprojecttest.domain.Temperature;
import com.example.myprojecttest.domain.Temperature;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TemperatureRepo extends CrudRepository<Temperature, Long> {

    List<Temperature> findByTag(String tag);

}
