package br.com.minicurso.activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edt_valor);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        Log.d("OnCreate", "Iniciando a Activity");
        return true;
    }
    
    public void bt_passa_valor(View v) {
    	//Declara��o do Bundle
    	Bundle b = new Bundle();
    	
    	//Atribuindo uma chave (valor) para o Bundle
    	//Passando o valor do EdtText para o Bundle
    	b.putString("valor", editText.getText().toString());

    	//Declarando e informando quan tela vai chamar.
    	Intent it = new Intent(this, Tela2.class);
    	
    	//Passando o Bundle via putExtra para a Intent
    	it.putExtras(b);
    	
    	//Chamando a Activity
    	startActivity(it);
		
	}
    
}
