/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.User;
import repository.FakeUserRepository;
import repository.IUserRepository;
import view.MainScreen;



public class SignUpCommand extends Command {
    
    private String username;
    private String password;
    private JFrame loginFrame;
    

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}