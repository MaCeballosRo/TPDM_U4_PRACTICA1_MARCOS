package mx.edu.ittepic.marcos.tpdm_u4_practica1_marcos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Lienzo extends View {
    Circulo obj1,obj2,obj3,obj4,obj5;
    Timer timer;
    int ancho = this.getResources().getDisplayMetrics().widthPixels;
    int alto = this.getResources().getDisplayMetrics().heightPixels;


    public Lienzo(Context context){
        super(context);
        obj1 = new Circulo(this);
        obj2 = new Circulo(this);
        obj3 = new Circulo(this);
        obj4 = new Circulo(this);
        obj5 = new Circulo(this);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                obj1.movimiento(ancho,alto);
                obj2.movimiento(ancho,alto);
                obj3.movimiento(ancho,alto);
                obj4.movimiento(ancho,alto);
                obj5.movimiento(ancho,alto);
            }
        },0,30);
    }

    protected  void onDraw(Canvas c){
        Paint p = new Paint();
        obj1.pintar(c,p);
        obj2.pintar(c,p);
        obj3.pintar(c,p);
        obj4.pintar(c,p);
        obj5.pintar(c,p);
        invalidate();
    }
}
