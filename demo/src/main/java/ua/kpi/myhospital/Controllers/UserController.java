package ua.kpi.myhospital.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class
UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping("/users/{idUser}")
    public User getUser(@PathVariable Integer idUser){
       return userService.getUser(idUser);
    }

    @RequestMapping("/user/{name}")
    public List<User> getByName(@PathVariable String name){
        return userService.getByName(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users" )
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user/{idUser}")
    public void upppdateUser(@RequestBody User user, @PathVariable Integer idUser){
        userService.uppdateUser(user, idUser);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/users/{idUser}")
    public void deleteUser(@PathVariable Integer idUser){
        userService.deleteUser(idUser);
    }




}
