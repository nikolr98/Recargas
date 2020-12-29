package com.nr.prueba1;

public class Recarga {
    int Id;
    String Numero,Valor,Operador;


    public Recarga() {
    }

    public Recarga(String numero, String valor,String operador) {
        Numero = numero;
        Valor = valor;
        Operador=operador;
    }


    public boolean isNull(){
        if (Numero.equals(" ") || Valor.equals(" ")){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Recarga{" +
                "Id=" + Id +
                "Numero=" + Numero + '\'' +
                ", Valor='" + Valor + '\'' +
                ", Operador='" + Operador + '\'' +

                '}';
    }



    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getOperador() {
        return Operador;
    }

    public void setOperador(String operador) {
        Operador = operador;
    }

}
