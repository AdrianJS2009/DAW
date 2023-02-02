
package com.politecnicomalaga.cajafuerte;

public class CajaFuerte {
    
    private String password;
 
//#############################################################################
    
    public CajaFuerte(){ //Constructor
        
        password = "0000";
        
    }
    
    public boolean changePassword(String oldPassword, String newPassword){ //Cambio de contraseña
        
        if (oldPassword.equals(password) && newPassword.length() == 4){
            
            password = newPassword;
            
            return true;
            
        } else {
            
            return false;
            
        }
        
    }
    
    public boolean openBox(String userPassword) { //Abrir caja
        
        return userPassword.equals(password);
        
    }
    
}
