package com.example.Taller.Model;

public class Book {
    private String titulo;
    private String autor;
    private int año;


    public Book (String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;

    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor){this.autor = autor;}

    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }


}

