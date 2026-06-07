package com.example.DeleteDemo.Controller;

import com.example.DeleteDemo.Service.RegistrationService;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @DeleteMapping("/registrations")
    public String deleteMultiple(@RequestParam String ids) {
        List<Integer> isList = new ArrayList<>();

        for (String id : ids.split(",")){
            isList.add(Integer.parseInt(id));

        }
        return registrationService.deleteMultipleByIds(isList);

    }

}
