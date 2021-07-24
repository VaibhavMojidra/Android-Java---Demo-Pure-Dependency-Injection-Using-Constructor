package com.vaibhavmojidra.puredependencyinjectionusingconstrutorjava;

import android.util.Log;

public class SimCard {
    private ServiceProvider serviceProvider;

    public SimCard(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
        Log.i("MyInfo","ServiceProvider initialized via constructor");
    }

    protected void getConnected(){
        serviceProvider.getServiceProvider();
        Log.i("MyInfo","Got connected to network");
    }
}
