package com.example.restcallhandler.Service;

import com.example.restcallhandler.Pojo.Subscriber;

public class ClientVerification {

    public void changeSubscription(Subscriber subscriber) {

        SystemHandlers duesVerifier = new DuesVerificationSystem();
        SystemHandlers accountVerifier =  new AccountValidationSystem();
        SystemHandlers accountActivation =  new AccountActivation();

        duesVerifier.setNextHandler(accountVerifier);
        accountVerifier.setNextHandler(accountActivation);

        duesVerifier.handlerRequest(subscriber);
    }
}
