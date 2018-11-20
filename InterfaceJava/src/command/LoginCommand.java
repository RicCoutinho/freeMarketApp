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
import repository.TxtUserRepository;
import view.MainScreen;

/**
 *
 * @author 01021485
 */
public class LoginCommand extends Command {
    
    private String username;
    private String password;
    private JFrame loginFrame;
    
    public LoginCommand(String username, String password, JFrame loginFrame) {
        this.username = username;
        this.password = password;
        this.loginFrame = loginFrame;
    }
    
    @Override
    public void execute() {
        IUserRepository userRepository = TxtUserRepository.getInstance();
        User user = userRepository.getUser(this.username);
        
        if (user == null) {
            JOptionPane.showMessageDialog(null, "Username is not registered yet.");
        } else {
            String pass = new String(this.password);
            if (user.getPassword().equals(pass)) {
                new MainScreen().setVisible(true);
                loginFrame.setVisible(false);
                loginFrame.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password!");
            }
        }
    }
    
}
