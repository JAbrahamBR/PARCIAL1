/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesjava.controller;

/**
 *
 * @author ABRAHAM
 */
public class cliente extends AbstractPersona{

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    private int saldo;
   
    
    public cliente(int id, String nombre, String apellido, String direccion, int telefono, int codigo, int saldo) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.saldo = saldo;
        
    }

    @Override
    public void Consultarpersona() {
        System.out.println(this.getId()+" "+this.getNombre()+" "+this.getApellido()+" "
        +this.getDireccion()+" "+this.getTelefono());
    }
    
    public void Consultarcliente(){
        System.out.println(codigo+" "+" "+saldo+" ");
    }
    
}