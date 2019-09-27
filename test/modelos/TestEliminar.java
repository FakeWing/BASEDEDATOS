/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Fake Wings
 */
public class TestEliminar {

    public TestEliminar() {
    }

    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String id = "Dato1";
        Dato dato = new Dato("Dato1", new Object());
        BaseDeDatos instance = new BaseDeDatos();
        instance.agregar(dato);
        boolean esperado = true;
        boolean obtenido = instance.eliminar(id);
        Assert.assertEquals(esperado, obtenido);
    }
}
