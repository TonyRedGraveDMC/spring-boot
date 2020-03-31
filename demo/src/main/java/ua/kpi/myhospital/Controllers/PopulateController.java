package ua.kpi.myhospital.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.kpi.myhospital.Entities.User;
import ua.kpi.myhospital.Service.DiagnosService;
import ua.kpi.myhospital.Service.PrescriptionService;
import ua.kpi.myhospital.Service.UserService;

import java.util.List;

@RestController
public class PopulateController {

    @Autowired
    private DiagnosService diagnosService;
    @Autowired
    private PrescriptionService prescriptionService;
    @Autowired
    private UserService userService;

    @RequestMapping("/populate")
    public void populate() {
        List<User> users = List.of(new User(1, "Bogdan", "Surname", "doc"),
                new User(2, "Sasha", "Surname", "patient"),
                new User(3, "Vika", "Surname", "nurse"));
        users.forEach(user -> userService.saveUser(user));

    }

}
