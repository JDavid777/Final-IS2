/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *Funionario de la agencia de viajes que estara en la bse de datos
 * @author David
 */
public class Funcionario {
    private String username;
    private String password;
    private String nombre;

    public Funcionario() {
    }
    /**
     * 
     * @param username
     * @param password
     * @param nombre 
     */

    public Funcionario(String username, String password, String nombre) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
