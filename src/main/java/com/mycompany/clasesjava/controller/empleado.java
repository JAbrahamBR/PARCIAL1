/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesjava.controller;

/**
 *
 * @author ABRAHAM
 */
public class empleado extends AbstractPersona{
    
    
    private int codigo;
    private String Puesto;
    private int Salario;

    public empleado(int id, String nombre, String apellido, String direccion, int telefono, int codigo, String Puesto, int Salario) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.Puesto = Puesto;
        this.Salario = Salario;
    }

    @Override
    public void Consultarpersona() {
        System.out.println(this.getId() + " " + this.getNombre() + " " + this.getApellido() + " "
                + this.getDireccion() + " " + this.getTelefono());
    }

    public void Guardar( empleado persona) {
        this.setCodigo(persona.getCodigo());
        this.setPuesto(persona.getPuesto());
        this.setSalario(persona.getSalario());
    }

    public void ObtenerAlumno() {
        System.out.println(this.codigo + " " + this.Puesto + " " + this.Salario);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        this.Salario = salario;
    }
    
    
    
}
