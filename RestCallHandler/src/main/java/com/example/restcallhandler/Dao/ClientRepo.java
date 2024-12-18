package com.example.restcallhandler.Dao;

import com.example.restcallhandler.Pojo.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ClientRepo extends JpaRepository<Subscriber, Integer> {
}
