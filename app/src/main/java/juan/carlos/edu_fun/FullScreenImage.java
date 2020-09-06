package juan.carlos.edu_fun;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import juan.carlos.edu_fun.Adaptadores.GaleryImageAdapter;

public class FullScreenImage extends AppCompatActivity {
ImageView imageViewDetails;
      GaleryImageAdapter galeryImageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);
        imageViewDetails=findViewById(R.id.detailsImage);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle( "Full Screen Image");

        //Recibir la id de la imagen
        Intent i = getIntent();
        int position = i.getExtras().getInt("idImage");
        galeryImageAdapter=new GaleryImageAdapter(this);
        imageViewDetails.setImageResource(galeryImageAdapter.imagenesArray[position]);


    }
}