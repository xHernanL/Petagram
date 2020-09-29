package com.example.petagram;

public class Mascota {
    private int foto;
    private String nombre;


    public Mascota(int foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;

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
}
