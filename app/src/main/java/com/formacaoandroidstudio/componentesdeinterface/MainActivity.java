package com.formacaoandroidstudio.componentesdeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado, textoProgramacao, textoSexo;

    private CheckBox checkJava, checkPhp, checkPython, checkC;

    private RadioButton sexoMasculino, sexoFeminino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Captura o id dos componentes */
        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);
        textoProgramacao = findViewById(R.id.textProgramacao);

        checkJava = findViewById(R.id.checkJava);
        checkPhp = findViewById(R.id.checkPhp);
        checkPython = findViewById(R.id.checkPython);
        checkC = findViewById(R.id.checkC);

        sexoMasculino = findViewById(R.id.radioButtonMasc);
        sexoFeminino = findViewById(R.id.radioButtonFem);
        textoSexo = findViewById(R.id.textResultadoSexo);
    }

    public void radioButton(){

        if(sexoMasculino.isChecked()){
          textoSexo.setText("Masculino");

        }else if(sexoFeminino.isChecked()){
          textoSexo.setText("Feminino");
        }
    }


    public void checkBox() {

        String texto = "";

        /* isChecked verifica se o checkBox está marcado - retorna um boolean (true - marcado) (false - desmarcado) */
        if (checkJava.isChecked()) {

            /* Vai ser capturado do attributes 'text' o valor 'JAVA'. Essa captura vai ser através do getText() */
            String valorSelecionada = checkJava.getText().toString();
            texto = valorSelecionada + " - ";

        }if (checkPhp.isChecked()) {

            String valorSelecionada = checkPhp.getText().toString();
            texto = texto + valorSelecionada + " - ";

        }if (checkPython.isChecked()) {

            String valorSelecionada = checkPython.getText().toString();
            texto = texto + valorSelecionada + " - ";

        }if (checkC.isChecked()) {

            String valorSelecionada = checkC.getText().toString();
            texto = texto + valorSelecionada;
        }

        /* Resulta o valor da programação no componente textView */
        textoProgramacao.setText(texto);
    }

    /* Método de ação do button */
    public void enviar(View view) {

        /* Chamando o método radioButton*/
        radioButton();

        /* Chamando o método checkBox */
        checkBox();

        /* Recupera o campo nome */
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        /* Resulta o nome no componente textView */
        textoResultado.setText("Nome: " + nome + " - Email: " + email);
    }

    public void limpar(View view) {

        /* Limpando os campos de textos e o textView */
        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("");

        /* Limpando os checkBox e o textView */
        checkJava.setChecked(false);
        checkPhp.setChecked(false);
        checkPython.setChecked(false);
        checkC.setChecked(false);
        textoProgramacao.setText("");

        /*Limpando o radioButton e o textView */
        sexoMasculino.setChecked(false);
        sexoFeminino.setChecked(false);
        textoSexo.setText("");
    }

}

/* Anotações:
 * Caixa de Texto (TextView e TextInputLayout)
 *
 *  Em attributes:
 *  -> hint = define um texto de orientação para que o usuária saiba o que deve ser preenchido.
 *  -> inputType = pode-se definir vários tipos de pré-configurações de input, por exemplo, date, number, etc...
 *     Por exemplo, se escolher um inputType numeric, no teclado só irá aparecer os números.
 *
 * -> TextInputLayout = esse input permite aparecer o hint mesmo depois de ter clicado na caixa de texto.
 *
 * ---------------------------------------------------------------
 * Caixa de Seleção (checkBox)
 * Pode ser marcado mais de um item.
 *
 * ---------------------------------------------------------------
 * Botão de opção (radioButton e o radioGroup)
 * Pode ser marcado apenas uma das opções.
 *
 * O radioGroup permite agrupar vários radioButton. E só é permitido marcar APENAS UMA opção.
 * Já o radioButton NÃO estando na estrutura do radioGroup é possível marcar MAIS DE UMA opção.
 *
 * ---------------------------------------------------------------
 * Detalhes sobre a Classe MainActivity.java
 * Toda vez que estiver executando o app, será executado essa classe MainActivity.
 *
 *  -> setContentView(R.layout.activity_main);
 * Ele configura a nossa interface, assim consegue acessar os componentes da interface antes que ela seja exibida
 * para o usuário.
 *
 * -> Método onCreate
 * Ele é chamado para fazer a execução da nossa interface. Dentro dele podemos fazer configurações antes da interface
 * aparecer (ser carregada) para o usuário. Portanto, onCreate é chamado sempre antes da sua interface (R.layout.activity_main)
 * ser exibida para o usuário.
 *
 * OBS. Declarando os componentes na Class MainActivity, os campos poderão ser acessados em qualquer lugar.
 *  */
