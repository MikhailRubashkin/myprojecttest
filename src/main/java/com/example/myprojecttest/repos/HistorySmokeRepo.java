package com.example.myprojecttest.repos;

import com.example.myprojecttest.domain.HistorySmoke;
import com.example.myprojecttest.domain.Smoke;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface HistorySmokeRepo extends CrudRepository<HistorySmoke, Date> {
    List<Smoke> findByLocalDate( Date localDate);
}

