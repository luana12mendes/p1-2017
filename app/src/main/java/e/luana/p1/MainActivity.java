package e.luana.p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtParamReceberActivity2;
    private TextView textView7;
    private Button btActivity2;
    private static final int REQUEST_CODE_SEGUNDA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // txtParamReceberActivity2 = (EditText) findViewById(R.id.txtParamRecebidoActivity2);

        btActivity2 = (Button) findViewById(R.id.button2);
        btActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}

      /*  @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (resultCode == RESULT_OK &&
                    requestCode == REQUEST_CODE_SEGUNDA) {
                if (data.hasExtra("retorno")) {
                    Toast.makeText(this, "O parâmetro enviado foi: " +
                                    data.getExtras().getString("retorno") ,
                            Toast.LENGTH_SHORT).show();

                }
            }
        }
        */

