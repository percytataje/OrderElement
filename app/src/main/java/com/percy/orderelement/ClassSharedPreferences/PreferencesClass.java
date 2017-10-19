package com.percy.orderelement.ClassSharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


/**
 * Created by percysoft on 13/10/17.
 */

public class PreferencesClass extends AppCompatActivity {
     private SharedPreferences preferences;

    public void guardarPreferencias(int cont, String color){
         preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        cont = cont + 1;
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(color, cont);

        editor.commit();

        String text =String.valueOf(cont);;
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public  Integer  cargarPreferencias(String color){
        preferences = getSharedPreferences("credenciales",Context.MODE_PRIVATE);
        int number = preferences.getInt(color,0);
        return number;
    }
    public void reiniciarPreferences(){
         preferences = getSharedPreferences("credenciales",Context.MODE_PRIVATE);
        preferences.edit().clear().commit();
    }
    public void guardarUltimoToque(String ultimo){
        preferences = getSharedPreferences("credenciales",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("ultimo_valor", ultimo);
        editor.commit();


        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "ultimotoque  "+ ultimo, duration);
        toast.show();
    }
    public void guardarPenultimoToque(String penultimo){
        preferences = getSharedPreferences("credenciales",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("penultimo_valor", penultimo);
        editor.commit();


        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "penultimotoque  "+penultimo, duration);
        toast.show();
    }
    public String cargarUltimoToque(String ultimo){
        String ultimo_valor = preferences.getString(ultimo,null);
        return ultimo_valor;
    }
}
