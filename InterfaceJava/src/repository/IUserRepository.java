/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import model.User;

/**
 *
 * @author 01021485
 */
public interface IUserRepository {
    //Retorna o usuario com o username passado
    User getUser(String username);
    //Retorna true se o usuário for salvo com sucesso, false se não for
    boolean createUser(String username, String password);
}
