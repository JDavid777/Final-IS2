/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author libardo
 */
public class GestorUsuarios {
    
     private ArrayList<Usuario> usuariosRegistrados;
    public Usuario autenticacion(String login, String password){
        
        return null;
    }
    
    public void crearUsuario (String user, String password, String Nombres){
        Usuario nuevo = new Usuario (user,password,Nombres);
        usuariosRegistrados.add(nuevo);
    }
    public boolean buscarUsuario(Usuario parUsuario){   // buscar en la lista de usuarios 
        for(Usuario usuario: usuariosRegistrados){
            if ((usuario.getLogin() == parUsuario.getLogin()) & (usuario.getContrasenia() == parUsuario.getContrasenia())) {
                return true;
            }
        }
        return false;
    }
}
