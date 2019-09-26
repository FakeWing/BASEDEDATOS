/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fake Wings
 */
public class BaseDeDatos {
    
public Dato agregar(Dato d) {
		System.out.print("Agrega un objeto a la base de datos emulada");
		return d;
	}
	
	public Dato eliminar(Dato d) {
		System.out.print("Elimina un objeto a la base de datos emulada");
		return d;
	}
	public ArrayList<Dato> listar(Dato d) {
		ArrayList<Dato> lista = new ArrayList<>();
		System.out.print("retorna una lista de objetos de la base de datos emulada");
		return lista;
	}
	public Dato modificar(Dato d) {
		System.out.print("Modifica un objeto a la base de datos emulada");
		return d;
	}

}