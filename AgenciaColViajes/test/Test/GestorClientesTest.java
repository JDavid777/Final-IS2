/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import negocio.Funcionario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victor Sotelo
 */
public class GestorClientesTest {
    
    public GestorClientesTest() {
    }
        @Test
    public void testCRUDCliente() throws Exception {
        
        
        System.out.println("CRUD cliente");
        
        // Lo elimina
        Funcionario gestor = new Funcionario();
        gestor.eliminarCliente("1234");
        
        // Lo agrega
        String id = "1234";
        String nombres = "Juan";
        String apellidos = "Perez";
        String fechaNac = "15/07/1995";
        String direccion = "Calle 5 No. 12-12 Popayan";
        String celular = "3117541247";
        String ciudad = "Popayan";
        String email = "juan@hotmail.com";
        String sexo = "Masculino";
        
        gestor.agregarClienteServicio(id, nombres, apellidos, fechaNac, direccion, celular, ciudad, email, sexo);
        
        // Lo consulta
      /*  Cliente result = gestor.buscarCliente("1234");
        assertEquals("1234", result.getId());
        assertEquals("Juan", result.getNombres());
        assertEquals("Perez", result.getApellidos());
        assertEquals("Calle 5 No. 12-12 Popayan", result.getDireccion());
        assertEquals("3117541247", result.getCelular());
        assertEquals("juan@hotmail.com", result.getEmail());
        assertEquals("Masculino", result.getSexo());
      */
        
        // Lo edita
        nombres = "Juan Andres";
        apellidos = "Perez Lopez";
        celular = "3007891245";
        
        gestor.editarCliente(id, nombres, apellidos, fechaNac, direccion, celular, ciudad, email, sexo);
        
        // Lo vuelve a consuttar
        /*
        result = gestor.buscarCliente("1234");
        assertEquals("1234", result.getId());
        assertEquals("Juan Andres", result.getNombres());
        assertEquals("Perez Lopez", result.getApellidos());
        assertEquals("3007891245", result.getCelular());
        */     
               
        
        //Lo deja eliminando
        gestor.eliminarCliente("1234");
       /* result = gestor.buscarCliente("123");
        assertEquals(null, result);
       */      
    }
}
