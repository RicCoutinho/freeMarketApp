/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;
import model.Product;

public interface IProductRepository {
    
    //Retorna o usuario com o username passado
    Product getProduct(String product);
    //Retorna true se o usuário for salvo com sucesso, false se não for
    boolean createProduct(String product);
   
}
