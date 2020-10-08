package com.example.petagram.modelo;

import android.content.ContentValues;
import android.content.Context;


import com.example.petagram.R;
import com.example.petagram.db.BaseDatos;
import com.example.petagram.db.ConstantesBaseDatos;

import java.util.ArrayList;

public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;
    private ArrayList<Mascota> mascotas;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){

        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.dog1,"Gemma",10));
        mascotas.add(new Mascota(R.drawable.superdog2,"Chiquito",20));
        mascotas.add(new Mascota(R.drawable.superdog3,"Toti",10));
        mascotas.add(new Mascota(R.drawable.supercat1,"Uma",15));
        mascotas.add(new Mascota(R.drawable.supercat2,"Pipi",0));


        BaseDatos db = new BaseDatos(context);
        insertarTresMascotas(db);
        //return db.obtenerTodasMacotas();
        return mascotas;

    }

    public void insertarTresMascotas(BaseDatos db){

        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE,"Gemma");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.dog1);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();

        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE,"Gemma");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.dog1);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE,"Gemma");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.dog1);

        db.insertarMascota(contentValues);
    }

    public void darLikeMascota (Mascota mascota) {
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_LIKES_MASCOTAS_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLA_LIKES_MASCOTAS_NUMERO_LIKES, LIKE);
        db.insertarLikesMascota(contentValues);
    }

    public int obtenerLikesMascota (Mascota mascota) {
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascotas(mascota);
    }
}
