/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author 01021187
 */
public class TxtUserRepository implements IUserRepository {
    
    private static TxtUserRepository instance;
    
    public static TxtUserRepository getInstance() {
        if (instance == null) {
            try {
                    instance = new TxtUserRepository();
            } catch (IOException ex) {
                instance = null;
            }
        }
        
        return instance;
    }
    
    
    private static final String caminhoTxt = "E:\\ARROMBADO\\dados.txt";
    private final File file;    
    
    private TxtUserRepository() throws IOException {
        file = new File(caminhoTxt);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public User getUser(String username) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linha;
            while((linha = bufferedReader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length > 1 && dados[0].equals(username)) {
                    return new User(dados[0].trim(), dados[1].trim());
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                Logger.getLogger(TxtUserRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return null;
    }

    @Override
    public boolean createUser(String username, String password) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append(String.format("%s, %s\n", username, password));
            fileWriter.flush();
            fileWriter.close();
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    
}
