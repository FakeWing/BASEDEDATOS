/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Fake Wings
 */
public class BaseDeDatos {

    private ArrayList<Dato> datos;

    public BaseDeDatos() {
        this.datos = new ArrayList<>();
    }

    public boolean agregar(Dato d) {
        return this.datos.add(d);

    }

    public boolean eliminar(String id) {
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {
                datos.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Dato> listar() {
        return this.datos;

    }

    public boolean modificar(Dato d) {
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(d.getId())) {
                datos.get(i).setData(d.getData());
                return true;
            }
        }
        return false;
    }

    public boolean Modificar(Dato d) {
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(d.getId())) {
                datos.get(i).setData(d.getData());
                return true;
            }
        }
        return false;
    }

}
