package com.vaibhavmojidra.puredependencyinjectionusingconstrutorjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SmartPhone smartPhone=new SmartPhone(
                new Battery(),
                new SimCard(new ServiceProvider())
                ,new MemoryCard()); //Injecting Dependency via Constructor
        smartPhone.startCallRecording();
    }
}