package juan.carlos.edu_fun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import juan.carlos.edu_fun.Adaptadores.GaleryImageAdapter;

public class GaleryActivity extends AppCompatActivity {
GridView gridViewImagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);

        gridViewImagens =findViewById(R.id.gridViewImage);
        gridViewImagens.setAdapter(new GaleryImageAdapter(this));

        gridViewImagens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent1 = new Intent(getApplicationContext(), FullScreenImage.class);
                //Ahora lo del parametro
                intent1.putExtra("idImage",i);
                startActivity(intent1);
            }
        });

    }
}