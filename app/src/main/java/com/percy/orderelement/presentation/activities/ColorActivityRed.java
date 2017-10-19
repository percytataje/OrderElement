package com.percy.orderelement.presentation.activities;


import android.os.Bundle;

import com.percy.orderelement.ClassSharedPreferences.PreferencesClass;
import com.percy.orderelement.R;

public class ColorActivityRed extends PreferencesClass {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       guardarPreferencias(cargarPreferencias("red"),"red");
        if(cargarUltimoToque("ultimo_valor") ==null){
            guardarUltimoToque("red");
        }else if(cargarUltimoToque("ultimo_valor").equals("red")){
            guardarUltimoToque("red");
        }else{
            guardarPenultimoToque(cargarUltimoToque("ultimo_valor"));
            guardarUltimoToque("red");
        }

        setContentView(R.layout.activity_color_red);
    }


}
