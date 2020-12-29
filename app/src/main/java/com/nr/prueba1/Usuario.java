package com.nr.prueba1;

public class Usuario {
    int Id;
    String Nombre,Tipo;
    String Email;
    String Password;
    String Identificacion;



    public Usuario() {
    }
    public Usuario(String nombre, String email, String password, String identificacion,String tipo) {
        Nombre = nombre;
        Email = email;
        Password = password;
        Identificacion = identificacion;
        Tipo=tipo;

    }

    public boolean isNull(){
        if (Nombre.equals("") || Email.equals("")||Password.equals("")||Identificacion.equals("")){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Identificacion='" + Identificacion + '\'' +
                ", Tipo='" + Tipo + '\'' +
                '}';
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

}
