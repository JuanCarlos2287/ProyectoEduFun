package juan.carlos.edu_fun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity  implements View.OnClickListener {
    Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero;
    private MediaPlayer
            au_uno,
            au_dos,
            au_tres,
            au_cuatro,
            au_cinco,
            au_seis,
            au_siete,
            au_ocho,
            au_nueve,
            au_cero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        au_uno = MediaPlayer.create(MainActivity5.this, R.raw.uno);
        au_dos = MediaPlayer.create(MainActivity5.this, R.raw.dos);
        au_tres = MediaPlayer.create(MainActivity5.this, R.raw.tres);
        au_cuatro = MediaPlayer.create(MainActivity5.this, R.raw.cuatro);
        au_cinco = MediaPlayer.create(MainActivity5.this, R.raw.cinco);
        au_seis = MediaPlayer.create(MainActivity5.this, R.raw.seis);
        au_siete = MediaPlayer.create(MainActivity5.this, R.raw.siete);
        au_ocho= MediaPlayer.create(MainActivity5.this, R.raw.ocho);
        au_nueve = MediaPlayer.create(MainActivity5.this, R.raw.nueve);
        au_cero = MediaPlayer.create(MainActivity5.this, R.raw.cero);

        uno = findViewById(R.id.uno);
        uno.setOnClickListener(this);

        dos = findViewById(R.id.dos);
        dos.setOnClickListener(this);

        tres = findViewById(R.id.tres);
        tres.setOnClickListener(this);

        cuatro = findViewById(R.id.cuatro);
        cuatro.setOnClickListener(this);

        cinco = findViewById(R.id.cinco);
        cinco.setOnClickListener(this);

        seis = findViewById(R.id.seis);
        seis.setOnClickListener(this);

        siete = findViewById(R.id.siete);
        siete.setOnClickListener(this);

        ocho = findViewById(R.id.ocho);
        ocho.setOnClickListener(this);

        nueve= findViewById(R.id.nueve);
        nueve.setOnClickListener(this);

        cero = findViewById(R.id.cero);
        cero.setOnClickListener(this);
    }

    public void ant(View view){
        Intent ant = new Intent(this, MainActivity2.class);
        startActivity(ant);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.uno:
                au_uno.start();
                break;

            case R.id.dos:
                au_dos.start();
                break;

            case R.id.tres:
                au_tres.start();
                break;

            case R.id.cuatro:
                au_cuatro.start();
                break;

            case R.id.cinco:
                au_cinco.start();
                break;

            case R.id.seis:
                au_seis.start();
                break;

            case R.id.siete:
                au_siete.start();
                break;

            case R.id.ocho:
                au_ocho.start();
                break;

            case R.id.nueve:
                au_nueve.start();
                break;

            case R.id.cero:
                au_cero.start();
                break;

            case R.id.anterior: {
                System.exit(0);
                break;
            }


        }
}
}