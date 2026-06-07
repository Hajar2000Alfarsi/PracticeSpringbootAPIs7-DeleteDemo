package com.example.DeleteDemo.Service;

import com.example.DeleteDemo.Entites.EventRegistration;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
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
        List<Integer> deletedIds = new ArrayList<>();
        List<Integer> notFoundIds = new ArrayList<>();

        for (Integer id : ids) {
            if (registrations.containsKey(id)){
                registrations.remove(id);
                deletedIds.add(id);
            } else {
                notFoundIds.add(id);
            }
        }
        return "Bulk Deletion Completed\n" +
                "Total Requested: " + ids.size() +
                "\nDeleted Successfully: " + deletedIds.size() +
                "\nDeleted ID's: " + deletedIds +
                "\nNot found ID's : " + notFoundIds;
    }
}
