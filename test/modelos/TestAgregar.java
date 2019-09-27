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
public class TestAgregar {

    public TestAgregar() {
    }

    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Dato dato = new Dato("Dato1", new Object());
        BaseDeDatos instance = new BaseDeDatos();
        boolean esperado = true;
        boolean obtenido = instance.agregar(dato);
        Assert.assertEquals(esperado, obtenido);
    }

}
