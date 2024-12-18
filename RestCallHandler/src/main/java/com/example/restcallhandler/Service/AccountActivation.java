package com.example.restcallhandler.Service;

import com.example.restcallhandler.Pojo.Subscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountActivation extends SystemHandlers{
    public static final Logger logger = LoggerFactory.getLogger(AccountValidationSystem.class);


    @Override
    public void handlerRequest(Subscriber subscriber) {

        logger.info("Subscription change request processed");
        // Call towards other system for subscription change

        if(nextSystem != null){
            nextSystem.handlerRequest(subscriber);
        }else{
            logger.info("subscription activation successful");
        }

    }
}
