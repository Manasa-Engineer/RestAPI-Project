package com.example.restcallhandler.Service;

import com.example.restcallhandler.Dao.ClientRepo;
import com.example.restcallhandler.Pojo.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ClientService {

    @Autowired
    ClientRepo clientRepo;


    public String SaveNewSubscriberAccount(Subscriber subscriber) {

           String activationcode = generateActivationcode(subscriber.getName());
           subscriber.getAccountDetails().setActivationCode(activationcode);
           Subscriber savedAcc =save(subscriber);
           return  savedAcc.getName() + " Subscriber Account saved successfully!! " ;

    }

    public String generateActivationcode(String name) {
        return Math.random() * 1000 + name ;
    }

    public Subscriber save(Subscriber subscriber){
      return clientRepo.save(subscriber);
    }

    public Subscriber getSubscriber(int id) {
        return clientRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Subscriber not found"));
    }
    public Boolean checkSubscriberAccountExists(int id) {
        return clientRepo.existsById(id);
    }

    public List<Subscriber> getAllSubscribers(){
        return clientRepo.findAll();
    }

}


