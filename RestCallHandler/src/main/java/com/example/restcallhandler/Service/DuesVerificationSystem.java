package com.example.restcallhandler.Service;

import com.example.restcallhandler.Pojo.Subscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DuesVerificationSystem extends SystemHandlers {

    public static final Logger logger = LoggerFactory.getLogger(DuesVerificationSystem.class);

    String result;
    @Override
    public void handlerRequest(Subscriber subscriber){
        // Make a call to external system to verify the Dues
        logger.info("DuesVerificationSystem verifying if there are any dues");
        result = "No Dues";
        if (nextSystem != null) {
            nextSystem.handlerRequest(subscriber);
        }

    }
}
