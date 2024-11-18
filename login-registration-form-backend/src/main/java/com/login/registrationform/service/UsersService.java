package com.login.registrationform.service;

import com.login.registrationform.entity.UsersEntity;
import com.login.registrationform.repository.UsersRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<UsersEntity> findAllUsers(){
        return usersRepository.findAll();
    }

    public Optional<UsersEntity> findById(Integer id){
        return usersRepository.findById(id);
    }

    public UsersEntity saveUser(UsersEntity usersEntity){
        return usersRepository.save(usersEntity);
    }

    public UsersEntity updateUser(UsersEntity usersEntity){
        return usersRepository.save(usersEntity);
    }

    public void deleteUser(Integer id){
        usersRepository.deleteById(id);
    }

}
