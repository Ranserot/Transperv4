package cl.ranserot.transper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seleccion extends AppCompatActivity {

    public static String user;
    Button seleccion1;
    Button seleccion2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);

        seleccion1 = (Button) findViewById(R.id.btn2);

        seleccion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent seleccion1 = new Intent(seleccion.this, mapa.class);
                startActivity(seleccion1);
            }
        });
        seleccion2 = (Button) findViewById(R.id.btn3);
        seleccion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent seleccion2 = new Intent(seleccion.this, mapac.class);
                startActivity(seleccion2);
            }

        });
    }
}
