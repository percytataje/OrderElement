package com.percy.orderelement.presentation.activities;

import android.os.Bundle;

import com.percy.orderelement.ClassSharedPreferences.PreferencesClass;
import com.percy.orderelement.R;

public class ColorActivityGreen extends PreferencesClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        guardarPreferencias(cargarPreferencias("green"),"green");
        if(cargarUltimoToque("ultimo_valor") ==null){
            guardarUltimoToque("green");
        }else if(cargarUltimoToque("ultimo_valor").equals("green")){
            guardarUltimoToque("green");
        }else{
            guardarPenultimoToque(cargarUltimoToque("ultimo_valor"));
            guardarUltimoToque("green");
        }

        setContentView(R.layout.activity_color_green);
    }


}
