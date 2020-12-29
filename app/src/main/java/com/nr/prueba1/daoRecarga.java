package com.nr.prueba1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class daoRecarga {
    Context c;
    Recarga r;
    ArrayList<Usuario> lista;
    SQLiteDatabase sql;
    String bd="BDUsuario";
    String tabla="create table if not exists recarga(id integer primary key autoincrement,numero integer,valor integer,operador text)";

    public daoRecarga(Context c) {
        this.c = c;
        sql=c.openOrCreateDatabase(bd,c.MODE_PRIVATE,null);
        sql.execSQL(tabla);
        r=new Recarga();
    }
    public boolean insertRecarga(Recarga r){
            ContentValues cv=new ContentValues();
            cv.put("numero",r.getNumero());
            cv.put("valor",r.getValor());
            cv.put("operador",r.getOperador());
            return (sql.insert("recarga",null,cv)>0);
        }
}
