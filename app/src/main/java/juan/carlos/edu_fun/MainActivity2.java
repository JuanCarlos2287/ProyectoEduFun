package juan.carlos.edu_fun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Abecedario(View view){
        Intent abecedario = new Intent(this, MainActivity3.class);
        startActivity(abecedario);
    }

    public void animal(View view){
        Intent animal = new Intent(this,GaleryActivity.class);
        startActivity(animal);
    }

    public void Num(View view){
        Intent num = new Intent(this, MainActivity5.class);
        startActivity(num);
    }

    public void regresar(View view){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }

}