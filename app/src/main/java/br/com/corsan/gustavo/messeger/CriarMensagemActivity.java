package br.com.corsan.gustavo.messeger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CriarMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_mensagem);
    }

    public void onEnviarMensagem(View view){
        EditText messageView = (EditText)findViewById(R.id.txtEnviar);

        String messageText = messageView.getText().toString();

        //Intent intent = new Intent(this, RecebeMensagemActivity.class);
        //intent.putExtra("message", messageText);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        String tituloSelecionado = getString(R.string.enviar);
        Intent chosenIntent = Intent.createChooser(intent, tituloSelecionado);
        startActivity(chosenIntent);
        //startActivity(intent);
    }
}
