package br.com.mmgestor.exemploparametros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActSegundaTela extends AppCompatActivity implements View.OnClickListener {
    public EditText edtValor;
    public Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_segunda_tela);

        edtValor = (EditText) findViewById(R.id.edtValor);
        btnFechar = (Button) findViewById(R.id.btnFechar);

        btnFechar.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();

        if (bundle.containsKey("VALOR")) {
            String valor = bundle.getString("VALOR");
            edtValor.setText(valor);
        }
    }

    public void onClick(View v) {
        finish();
    }
}
