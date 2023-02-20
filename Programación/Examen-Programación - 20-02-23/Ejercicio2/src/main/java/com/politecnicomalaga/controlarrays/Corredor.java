package com.politecnicomalaga.controlarrays;

import java.util.ArrayList;

public class Corredor {
    private String nombre; // 
    private String apellidos;
    private String dni; 
    private String telefono; 
    private String email; 
    private ArrayList<Carrera> carreras; // Carreras en las que ha participado el corredor


    public Corredor(String nombre, String apellidos, String dni, String telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.carreras = new ArrayList<>(); 
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // Añade una carrera al corredor. Si la carrera ya existe, se actualizan sus datos. Si no, se añade.
    public boolean addCarrera(String codigo, int distancia, int tiempo, byte pendienteMedia, short dorsal) {
        if (codigo.length() != 4 || distancia <= 0 || tiempo <= 0 || pendienteMedia < 0 || pendienteMedia > 10 || dorsal < 100 || dorsal > 999) {
            return false;
        }
        Carrera carrera = new Carrera(codigo, distancia, tiempo, pendienteMedia, dorsal);
        carreras.add(carrera);
        return true;
    }
    // Devuelve un array con las carreras del corredor. Si no hay carreras, devuelve un array con un único elemento "Sin carreras todavía".
    public String[] mostrarCarreras() {
        if (carreras.isEmpty()) {
            return new String[]{"Sin carreras todavía"};
        } else {
            String[] resultado = new String[carreras.size()];
            for (int i = 0; i < carreras.size(); i++) {
                resultado[i] = carreras.get(i).toString();
            }
            return resultado;
        }
    }
    // Devuelve la carrera con el código indicado. Si no existe, devuelve null.
    public Carrera buscarCarrera(String codigo) {
        for (Carrera carrera : carreras) {
            if (carrera.getCodigo().equals(codigo)) {
                return carrera;
            }
        }
        return null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}