package juan.carlos.edu_fun;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AbecedarioClass extends AppCompatActivity implements View.OnClickListener {
    ImageButton aj, bj, cj, dj, ej, fj, gj, hj, ij, jj, kj, lj, mj, nj, nnj, oj, pj, qj, rj, sj, tj, uj, vj, wj, xj, yj, zj;
    Button exitbecedario;
    private MediaPlayer
            au_a,
            au_b,
            au_c,
            au_d,
            au_e,
            au_f,
            au_g,
            au_h,
            au_i,
            au_j,
            au_k,
            au_l,
            au_m,
            au_n,
            au_nn,
            au_o,
            au_p,
            au_q,
            au_r,
            au_s,
            au_t,
            au_u,
            au_v,
            au_w,
            au_x,
            au_y,
            au_z;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        au_a = MediaPlayer.create(AbecedarioClass.this, R.raw.a);
        au_b = MediaPlayer.create(AbecedarioClass.this, R.raw.b);
        au_c = MediaPlayer.create(AbecedarioClass.this, R.raw.c);
        au_d = MediaPlayer.create(AbecedarioClass.this, R.raw.d);
        au_e = MediaPlayer.create(AbecedarioClass.this, R.raw.e);
        au_f = MediaPlayer.create(AbecedarioClass.this, R.raw.f);
        au_g = MediaPlayer.create(AbecedarioClass.this, R.raw.g);
        au_h = MediaPlayer.create(AbecedarioClass.this, R.raw.h);
        au_i = MediaPlayer.create(AbecedarioClass.this, R.raw.i);
        au_j = MediaPlayer.create(AbecedarioClass.this, R.raw.j);
        au_k = MediaPlayer.create(AbecedarioClass.this, R.raw.k);
        au_l = MediaPlayer.create(AbecedarioClass.this, R.raw.l);
        au_m = MediaPlayer.create(AbecedarioClass.this, R.raw.m);
        au_n = MediaPlayer.create(AbecedarioClass.this, R.raw.n);
        au_nn = MediaPlayer.create(AbecedarioClass.this, R.raw.nn);
        au_o = MediaPlayer.create(AbecedarioClass.this, R.raw.o);
        au_p = MediaPlayer.create(AbecedarioClass.this, R.raw.p);
        au_q = MediaPlayer.create(AbecedarioClass.this, R.raw.q);
        au_r = MediaPlayer.create(AbecedarioClass.this, R.raw.r);
        au_s = MediaPlayer.create(AbecedarioClass.this, R.raw.s);
        au_t = MediaPlayer.create(AbecedarioClass.this, R.raw.t);
        au_u = MediaPlayer.create(AbecedarioClass.this, R.raw.u);
        au_v = MediaPlayer.create(AbecedarioClass.this, R.raw.v);
        au_w = MediaPlayer.create(AbecedarioClass.this, R.raw.w);
        au_x = MediaPlayer.create(AbecedarioClass.this, R.raw.x);
        au_y = MediaPlayer.create(AbecedarioClass.this, R.raw.y);
        au_z = MediaPlayer.create(AbecedarioClass.this, R.raw.z);

        aj = findViewById(R.id.a);
        aj.setOnClickListener(this);

        bj = findViewById(R.id.b);
        bj.setOnClickListener(this);

        cj = findViewById(R.id.c);
        cj.setOnClickListener(this);

        dj = findViewById(R.id.d);
        dj.setOnClickListener(this);

        ej = findViewById(R.id.e);
        ej.setOnClickListener(this);

        fj = findViewById(R.id.f);
        fj.setOnClickListener(this);

        gj = findViewById(R.id.g);
        gj.setOnClickListener(this);

        hj = findViewById(R.id.h);
        hj.setOnClickListener(this);

        ij= findViewById(R.id.i);
        ij.setOnClickListener(this);

        jj = findViewById(R.id.j);
        jj.setOnClickListener(this);

        kj = findViewById(R.id.k);
        kj.setOnClickListener(this);

        lj = findViewById(R.id.l);
        lj.setOnClickListener(this);

        mj = findViewById(R.id.m);
        mj.setOnClickListener(this);

        nj = findViewById(R.id.n);
        nj.setOnClickListener(this);

        nnj = findViewById(R.id.nn);
        nnj.setOnClickListener(this);

        oj = findViewById(R.id.o);
        oj.setOnClickListener(this);

        pj = findViewById(R.id.p);
        pj.setOnClickListener(this);

        qj = findViewById(R.id.q);
        qj.setOnClickListener(this);

        rj = findViewById(R.id.r);
        rj.setOnClickListener(this);

        sj = findViewById(R.id.s);
        sj.setOnClickListener(this);

        tj = findViewById(R.id.t);
        tj.setOnClickListener(this);

        uj = findViewById(R.id.u);
        uj.setOnClickListener(this);

        vj = findViewById(R.id.v);
        vj.setOnClickListener(this);

        wj = findViewById(R.id.w);
        wj.setOnClickListener(this);

        xj = findViewById(R.id.x);
        xj.setOnClickListener(this);

        yj = findViewById(R.id.y);
        yj.setOnClickListener(this);

        zj = findViewById(R.id.z);
        zj.setOnClickListener(this);

        exitbecedario =  findViewById(R.id.atras);
        exitbecedario.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.a:
                au_a.start();
                break;

            case R.id.b:
                au_b.start();
                break;

            case R.id.c:
                au_c.start();
                break;

            case R.id.d:
                au_d.start();
                break;

            case R.id.e:
                au_e.start();
                break;

            case R.id.f:
                au_f.start();
                break;

            case R.id.g:
                au_g.start();
                break;

            case R.id.h:
                au_h.start();
                break;

            case R.id.i:
                au_i.start();
                break;

            case R.id.j:
                au_j.start();
                break;

            case R.id.k:
                au_k.start();
                break;

            case R.id.l:
                au_l.start();
                break;

            case R.id.m:
                au_m.start();
                break;

            case R.id.n:
                au_n.start();
                break;

            case R.id.nn:
                au_nn.start();
                break;

            case R.id.o:
                au_o.start();
                break;

            case R.id.p:
                au_p.start();
                break;

            case R.id.q:
                au_q.start();
                break;

            case R.id.r:
                au_r.start();
                break;

            case R.id.s:
                au_s.start();
                break;

            case R.id.t:
                au_t.start();
                break;

            case R.id.u:
                au_u.start();
                break;

            case R.id.v:
                au_v.start();
                break;

            case R.id.w:
                au_w.start();
                break;

            case R.id.x:
                au_x.start();
                break;

            case R.id.y:
                au_y.start();
                break;

            case R.id.z:
                au_z.start();
                break;

            case R.id.atras: {
                System.exit(0);
                break;
            }

        }
    }
}
