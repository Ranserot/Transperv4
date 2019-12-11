package cl.ranserot.transper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mapac extends AppCompatActivity {

    Button opc;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mapac);

            opc = (Button) findViewById(R.id.btn5);

            opc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent opc = new Intent(mapac.this, mpo.class);
                    startActivity(opc);
                }
            });
        }
    }


