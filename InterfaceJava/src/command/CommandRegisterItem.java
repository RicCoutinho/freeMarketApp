
package command;
import javax.swing.JFrame;


abstract class CommandRegisterItem extends Command {
    
        String product;
        String title;
        String description;  
        
         
        
        
        public CommandRegisterItem(String product, String title, String description) {
        this.product = product;
        this.title = title;
        this.description = description;
        
    }



    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

  