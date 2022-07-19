package com.ust.util.users.service;

import com.ust.util.users.dao.UsersDao;
import com.ust.util.users.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    private final UsersDao usersDao;

    @Autowired
    public UsersService(@Qualifier("UsersRepository") UsersDao usersDao) {this.usersDao=usersDao;}

    public int insertUsers(int id, Users users) {
    return usersDao.insertUsers(id, users);
}
    public int insertUsers(Users users) {
        return usersDao.insertUsers(users);
    }
    public int updateUsers(int id, Users users) {
        return usersDao.updateUsers(id, users);
    }
    public int deleteUsers(int id) {
        return usersDao.deleteUsers(id);
    }
    public List<Users> queryUsers() {
        return usersDao.queryUsers();
    }
public Users validateLogin(String uname, String pw){
        return usersDao.validateLogin(uname, pw);
}
    public Optional<Users> queryUsers(int id) {
        return usersDao.queryUsers( id);
    }
}

