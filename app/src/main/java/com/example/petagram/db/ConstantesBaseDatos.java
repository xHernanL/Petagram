package com.example.petagram.db;

public class ConstantesBaseDatos {

    public static final String DATABASE_NAME = "mascotas";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLA_MASCOTAS = "mascota";
    public static final String TABLA_MASCOTAS_ID = "id";
    public static final String TABLA_MASCOTAS_NOMBRE = "nombre";
    public static final String TABLA_MASCOTAS_FOTO = "foto";

    public static final String TABLA_LIKES_MASCOTAS = "mascota_likes";
    public static final String TABLA_LIKES_MASCOTAS_ID = "id";
    public static final String TABLA_LIKES_MASCOTAS_ID_MASCOTA = "id_mascota" ;
    public static final String TABLA_LIKES_MASCOTAS_NUMERO_LIKES = "numero_likes" ;
}
