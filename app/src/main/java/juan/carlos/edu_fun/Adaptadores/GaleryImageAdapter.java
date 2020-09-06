package juan.carlos.edu_fun.Adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import juan.carlos.edu_fun.R;

public class GaleryImageAdapter extends BaseAdapter {
    private Context mContext;
    public int [] imagenesArray ={
            R.drawable.abeja,
            R.drawable.oso,
            R.drawable.camaleon,
            R.drawable.cangrejo,
            R.drawable.gato,
            R.drawable.castor,
            R.drawable.ardilla,
            R.drawable.cebra,
            R.drawable.cerdo,
            R.drawable.koala_feliz,
            R.drawable.condor,
            R.drawable.buho,
            R.drawable.delfin,
            R.drawable.conejo,
            R.drawable.vaca,
            R.drawable.koala,
            R.drawable.perro,
            R.drawable.flamenco,
            R.drawable.leon,
            R.drawable.hormiga,
            R.drawable.huron,
            R.drawable.murcielago,
            R.drawable.pajaro,
            R.drawable.pato,
            R.drawable.perezoso,
            R.drawable.pez,
            R.drawable.pinguino,
            R.drawable.pollo,
            R.drawable.ponny,
            R.drawable.pulpo,
            R.drawable.serpiente,
            R.drawable.tortuga,
            R.drawable.zorro
    };


    public GaleryImageAdapter (Context mContext){
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imagenesArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imagenesArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imagenesArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(
                new GridView.LayoutParams(
                        150,
                        170
                ));

        return imageView;
    }


}
