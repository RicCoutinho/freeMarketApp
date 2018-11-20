/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author 01021485
 */
public class FakeUserRepository implements IUserRepository {
    
    private static FakeUserRepository instance;
    
    public static FakeUserRepository getInstance() {
        if (instance == null)
            instance = new FakeUserRepository();
        return instance;
    }

    private List<User> usuarios;
    
    private FakeUserRepository() {
        this.usuarios = new ArrayList<>();
    }
    
    @Override
    public User getUser(String username) {
        for (User user : usuarios) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        
        return null;
    }

    @Override
    public boolean createUser(String username, String password) {
        if (getUser(username) != null) {
            return false;
        }
        
        User user = new User(username, password);
        usuarios.add(user);
        return true;
    }
}
