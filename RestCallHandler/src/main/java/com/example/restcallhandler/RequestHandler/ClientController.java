package com.example.restcallhandler.RequestHandler;

import com.example.restcallhandler.Pojo.Subscriber;
import com.example.restcallhandler.Service.ClientService;
import com.example.restcallhandler.Service.ClientVerification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController("/client")
public class ClientController {

    public static final Logger logger = LoggerFactory.getLogger(ClientController.class);
    @Autowired
    ClientService clientService;
    //Non Spring Project
    ClientVerification clientVerifier = new ClientVerification();

//Repository implementation
    @GetMapping("/getSubscriber/{id}")
    public ResponseBody checkSubscriberAvailable(@PathVariable int id){
        Subscriber result;
           try {
               logger.info("checkSubscriberAvailable");
               result = clientService.getSubscriber(id);
           }catch(RuntimeException e){
               return (ResponseBody) ResponseEntity.badRequest().body(e.getMessage());
           }
           return (ResponseBody) ResponseEntity.ok().body(result);
    }

    @PostMapping("/saveSubscriber")
    public ResponseBody saveSubscriber(@RequestBody Subscriber subscriber) {

         String result = clientService.SaveNewSubscriberAccount(subscriber);
        return (ResponseBody) ResponseEntity.status(HttpStatus.ACCEPTED).body(result);
    }

    //Implementing design pattern
    @PostMapping("/changeSubscription")
    public ResponseBody changeSubscription(@RequestBody Subscriber subscriber) {

        try {
            clientVerifier.changeSubscription(subscriber);
        }catch(RuntimeException e){
            return (ResponseBody) ResponseEntity.badRequest().body(e.getMessage());
        }
        return (ResponseBody) ResponseEntity.ok();

    }

}
