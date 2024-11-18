package com.login.registrationform.controller;

import com.login.registrationform.entity.UsersEntity;
import com.login.registrationform.repository.UsersRepository;
import com.login.registrationform.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UsersController {

    private final UsersService usersService;

    @Autowired
    private UsersRepository usersRepository;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/getAll")
    public List<UsersEntity> findAllUsers(){
        return usersService.findAllUsers();
    }

    @GetMapping("/get/{id}")
    public Optional<UsersEntity> findById(@PathVariable("id") Integer id){
        return usersService.findById(id);
    }

    @PostMapping("/register")
    public UsersEntity saveUser(@RequestBody UsersEntity usersEntity){
        return  usersService.saveUser(usersEntity);
    }

    @PutMapping("/update")
    public UsersEntity updateUser(@RequestBody UsersEntity usersEntity){
        return usersService.updateUser(usersEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        usersService.deleteUser(id);
    }

}
