package e.luana.p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import e.luana.p1.R;

public class Main3Activity extends AppCompatActivity {

    private Button btnVoltar;
    private EditText txtParametroEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

       // txtParametroReceber = (EditText) findViewById(R.id.txtParametroReceberActivity1);
        // Bundle extras = getIntent().getExtras();
        //String paramRecebidoPelaActivity1 = extras.getString("PARAM_ACTIVITY1");
        //txtParametroReceber.setText(paramRecebidoPelaActivity1);

        txtParametroEnviar = (EditText) findViewById(R.id.txtParametroEnviarActivity1);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

  //  @Override
   /* public void finish() {
        Intent data = new Intent();
        Bundle bundle = new bundle();
        bundle.putString("retorno", "Estamos retornando da activity Segunda");
        bundle.putExtra(bundle);
        setResult(RESULT_OK, data);
        super.finish();
    }*/
}