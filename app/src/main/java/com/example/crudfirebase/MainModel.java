package com.example.crudfirebase;
public class MainModel {
    String Nombre, Apellido, Email, imgURL;

    public MainModel(){
    }

    public MainModel(String nombre, String apellido, String email, String imgURL) {
        Nombre = Nombre;
        Apellido = apellido;
        Email = email;
        this.imgURL = imgURL;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
