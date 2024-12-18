package com.example.restcallhandler.Service;

import com.example.restcallhandler.Pojo.Subscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountValidationSystem extends SystemHandlers{

    public static final Logger logger = LoggerFactory.getLogger(AccountValidationSystem.class);

    @Override
    public void handlerRequest(Subscriber subscriber) {

        logger.info("Account validation system verifying the Subscribers Account Status");
        //Code calling other system and getting response
        //Assuming Status Active
        if(nextSystem != null){
            nextSystem.handlerRequest(subscriber);
        }else{
            logger.info("All checks passed subscription can be activated");
        }
    }
}
