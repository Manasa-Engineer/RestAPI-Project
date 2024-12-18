package com.example.restcallhandler.Dao;

import com.example.restcallhandler.Pojo.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Subscriber, Integer> {
}
