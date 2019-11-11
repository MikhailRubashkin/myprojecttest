package com.example.myprojecttest.repos;

import com.example.myprojecttest.domain.HistoryMessage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HistoryMessageRepo extends CrudRepository<HistoryMessage, Long> {
    List<HistoryMessage> findByTag( String tag);
}
