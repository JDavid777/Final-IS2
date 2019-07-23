/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *Gestiona los usuarios almacenados en la base de datos
 * @author David
 */
public class GestorUsuarios {

    private ConectorJdbc conector;

    public GestorUsuarios() {
        this.conector = new ConectorJdbc();
    }
    /**
     * 
     * @param conector 
     */
    public GestorUsuarios(ConectorJdbc conector) {

        this.conector = conector;
    }
    /**
     * 
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public ArrayList<Funcionario> consultarUsuarios() throws ClassNotFoundException, SQLException{
        //TODO Buscar        
          
        conector.conectarse();
        conector.crearConsulta("SELECT * FROM USUARIO;");
        ArrayList<Funcionario> usuarios = new ArrayList();

        while (conector.getResultado().next()) {
            Funcionario usu = new Funcionario(conector.getResultado().getString("username"), conector.getResultado().getString("password"),conector.getResultado().getString("nombre_completo"));
            usuarios.add(usu);
        }
        conector.desconectarse();
        return usuarios;
    }
    
}
