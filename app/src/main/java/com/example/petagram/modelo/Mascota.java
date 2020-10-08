package com.example.petagram.modelo;

public class Mascota {

    private int id;
    private int foto;
    private String nombre;
    private int likes;

    public Mascota(int foto, String nombre,int likes) {
        this.foto = foto;
        this.nombre = nombre;
        this.likes = likes;

    }

    public Mascota() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        foto = foto;
    }

    public int getLikes() {return likes;}

    public void setLikes(int likes) {this.likes = likes;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

}
