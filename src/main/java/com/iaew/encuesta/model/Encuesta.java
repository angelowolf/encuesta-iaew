/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iaew.encuesta.model;

/**
 *
 * @author ang_2
 */
public class Encuesta {

    private int id, puntajeAtencion;
    private String nombre, apellido, telefono, comentario, email;
    private boolean sastifaccion, productoEncontrado, regalo;

    public Encuesta() {
    }

    public Encuesta(int puntajeAtencion, String nombre, String apellido, String telefono, String comentario, String email, boolean sastifaccion, boolean productoEncontrado, boolean regalo) {
        this.puntajeAtencion = puntajeAtencion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.comentario = comentario;
        this.email = email;
        this.sastifaccion = sastifaccion;
        this.productoEncontrado = productoEncontrado;
        this.regalo = regalo;
    }

    @Override
    public String toString() {
        return "Encuesta{" + "id=" + id + ", puntajeAtencion=" + puntajeAtencion + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", comentario=" + comentario + ", email=" + email + ", sastifaccion=" + sastifaccion + ", productoEncontrado=" + productoEncontrado + ", regalo=" + regalo + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntajeAtencion() {
        return puntajeAtencion;
    }

    public void setPuntajeAtencion(int puntajeAtencion) {
        this.puntajeAtencion = puntajeAtencion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSastifaccion() {
        return sastifaccion;
    }

    public void setSastifaccion(boolean sastifaccion) {
        this.sastifaccion = sastifaccion;
    }

    public boolean isProductoEncontrado() {
        return productoEncontrado;
    }

    public void setProductoEncontrado(boolean productoEncontrado) {
        this.productoEncontrado = productoEncontrado;
    }

    public boolean isRegalo() {
        return regalo;
    }

    public void setRegalo(boolean regalo) {
        this.regalo = regalo;
    }

}
