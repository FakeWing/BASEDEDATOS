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
public class TestModificar {

    public TestModificar() {
    }

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Dato dato = new Dato("Dato1", new Object());
        BaseDeDatos instance = new BaseDeDatos();
        instance.agregar(dato);
        boolean esperado = true;
        dato = new Dato("Dato2", new Object());
        boolean obtenido = instance.modificar(dato);
        Assert.assertEquals(esperado, obtenido);
    }
}
