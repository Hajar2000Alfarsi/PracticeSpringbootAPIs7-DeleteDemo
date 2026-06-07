package com.example.DeleteDemo.Service;

import com.example.DeleteDemo.Entites.EventRegistration;
import jakarta.annotation.PostConstruct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistrationService {
    private Map<Integer, EventRegistration> registrations = new HashMap<>();

    public RegistrationService() {
        registrations.put(101, new EventRegistration(101, "Ahmed"));
        registrations.put(102, new EventRegistration(102, "Sara"));
        registrations.put(103, new EventRegistration(103, "John"));
        registrations.put(104, new EventRegistration(104, "Ali"));
    }

    public String deleteMultipleByIds(List<Integer> ids){

    }
}
