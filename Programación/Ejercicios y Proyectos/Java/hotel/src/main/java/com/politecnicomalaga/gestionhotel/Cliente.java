/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.gestionhotel;

/**
 *
 * @author Ajimsan2009
 */
public class Cliente {

    private final String dni, name, surname, address, email, phone, birthdate, age;
    private boolean hasDiscount;

    public Cliente(String dni, String name, String surname, String address, String email, String phone, String birthdate, String age) {

        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.birthdate = birthdate;
        this.age = age;
        this.hasDiscount = false;

    }

    public String[] getClientInformation() {

        String[] elements = {this.dni, this.name, this.surname, this.address, this.email, this.phone, this.birthdate, this.age, String.valueOf(this.hasDiscount)};

        return elements;

    }

}
