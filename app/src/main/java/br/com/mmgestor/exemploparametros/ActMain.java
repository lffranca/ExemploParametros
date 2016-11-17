package br.com.mmgestor.exemploparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActMain extends AppCompatActivity implements View.OnClickListener {
    public EditText edtValor;
    public Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        edtValor = (EditText) findViewById(R.id.edtValor);
        btnOk = (Button) findViewById(R.id.btnOk);


        btnOk.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent it = new Intent(this, ActSegundaTela.class);
        it.putExtra("VALOR", edtValor.getText().toString());
        startActivity(it);
    }
}
