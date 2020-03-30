package ua.kpi.myhospital.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kpi.myhospital.Repo.UserRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
       List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getUser(Integer idUser){
        return  userRepository.findById(idUser).get();
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(Integer userid){
        userRepository.deleteById(userid);
    }

    public void uppdateUser(User user, Integer userid){
        userRepository.save(user);
    }

    public List<User> getByName(String name){
        List<User> users = new ArrayList<>();
        userRepository.findByName(name).forEach(users::add);
        return  users;
    }



}
