package com.percy.orderelement.presentation.activities;

import android.os.Bundle;

import com.percy.orderelement.ClassSharedPreferences.PreferencesClass;
import com.percy.orderelement.R;

public class ColorActivityBlue extends PreferencesClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        guardarPreferencias(cargarPreferencias("blue"),"blue");


        if(cargarUltimoToque("ultimo_valor") ==null){
            guardarUltimoToque("blue");
        }
        else if(cargarUltimoToque("ultimo_valor").equals("blue")){
            guardarUltimoToque("blue");
        }else{
            guardarPenultimoToque(cargarUltimoToque("ultimo_valor"));
            guardarUltimoToque("blue");
        }
        setContentView(R.layout.activity_color_blue);
    }
}
