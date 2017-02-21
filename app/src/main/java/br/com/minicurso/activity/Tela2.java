package br.com.minicurso.activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Tela2 extends Activity {

TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela2);
		
		textView = (TextView) findViewById(R.id.tv_valor_tela2);
		
		Intent intent = getIntent();
		Bundle b = intent.getExtras();
		
		//Recuperando valor com a chave (Valor), passando para o TextView.
		textView.setText(b.getString("valor"));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela2, menu);
		return true;
	}

}
