package com.example.restcallhandler.Service;

import com.example.restcallhandler.Pojo.Subscriber;

public abstract class SystemHandlers {

    protected SystemHandlers nextSystem;

    public abstract void handlerRequest(Subscriber subscriber);

    public void setNextHandler(SystemHandlers nextSystem) {
        this.nextSystem = nextSystem;
    }
}
