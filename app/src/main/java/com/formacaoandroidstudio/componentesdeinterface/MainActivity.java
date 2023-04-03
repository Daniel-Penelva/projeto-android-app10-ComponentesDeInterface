package com.formacaoandroidstudio.componentesdeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Caixa de Texto
    *
    *  Em attributes:
    *  -> hint = define um texto de orientação para que o usuária saiba o que deve ser preenchido.
    *  -> inputType = pode-se definir vários tipos de pré-configurações de input, por exemplo, date, number, etc...
    *     Por exemplo, se escolher um inputType numeric, no teclado só irá aparecer os números.
    *
    * -> TextInputLayout = esse input permite aparecer o hint mesmo depois de ter clicado na caixa de texto.
    *  */
}
