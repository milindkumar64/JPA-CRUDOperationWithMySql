package com.bridgelabz.JPACrudOperation.service;

import com.bridgelabz.JPACrudOperation.doa.UserRepository;
import com.bridgelabz.JPACrudOperation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    final AtomicLong counter = new AtomicLong();
    public User addUser(User user){
        user.setId(counter.incrementAndGet());
        user.setName("Milind Kumar");
        user.setCity("Rewa");
        user.setStatus("I am java Developer !");
        return userRepository.save(user);
    }
    public List<User> addUsers(List<User> usersList){
//               usersList = new ArrayList<User>();
//               usersList.add(new User(counter.incrementAndGet(),"Om","Rewa","I am java Developer !"));
//               usersList.add(new User(counter.incrementAndGet(),"Mk","BPL","not ye updated"));
//               usersList.add(new User(counter.incrementAndGet(),"Ram","Ayodhaya","i am a devotee of Lord Rama "));
        List <User> result = userRepository.saveAll(usersList);
        result.stream().forEach(user -> System.out.println(user));
        //return userRepository.saveAll(usersList);
        return result;
    }
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User updateUser(long id,String name,String city,String status){
        Optional<User> optional  =userRepository.findById(id);
        if(optional.isPresent()){
            User oldUser = optional.get();
            oldUser.setName(name);
            oldUser.setCity(city);
            oldUser.setStatus(status);
            return userRepository.save(oldUser);
        }else {
            return  new User();
        }
    }

    public String deleteUser(long id){
     Optional<User> optional = userRepository.findById(id);
     User oldUser = optional.get();
     userRepository.deleteById(id);
     return oldUser.toString();
    }
}
