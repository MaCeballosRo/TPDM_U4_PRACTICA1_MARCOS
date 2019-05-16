package mx.edu.ittepic.marcos.tpdm_u4_practica1_marcos;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Circulo {

    int tamaño,x,y;
    int desplazamientoX,desplazamientoY;
    int color;

    public Circulo(Lienzo lienzo){

        //Coordenadas
        int ancho = lienzo.getResources().getDisplayMetrics().widthPixels;
        int alto = lienzo.getResources().getDisplayMetrics().heightPixels;
        x =  (int)(Math.random()*ancho);
        y = (int)(Math.random()*alto);

        //Radio del circulo
        tamaño = (int)(Math.random()*300)+20;

        //Desplazamiento horizontal
        if(Math.random()*10<5){
            desplazamientoX = 5;
        }else{
            desplazamientoX = -5;
        }

        //Desplazamiento Vertical
        if(Math.random()*10<5){
            desplazamientoY = 5;
        }else{
            desplazamientoY = -5;
        }

        //Color
        switch ((int) (Math.random()*5)){
            case 0:
                color = Color.YELLOW;
                break;
            case 1:
                color = Color.BLUE;
                break;
            case 2:
                color = Color.RED;
                break;
            case 3:
                color = Color.GREEN;
                break;
            case 4:
                color = Color.MAGENTA;
                break;
            case 5:
                color = Color.GRAY;
                break;
        }
    }

    public void pintar(Canvas c, Paint p){
        p.setColor(color);
        c.drawCircle(x,y,tamaño,p);
    }

    public void movimiento(int anchoP, int altoP){
        if(x<=0){
            desplazamientoX = desplazamientoX * -1;
        }
        if(x>=anchoP){
            desplazamientoX = desplazamientoX * -1;
        }
        if(y<=0){
            desplazamientoY = desplazamientoY * -1;
        }
        if(y>=altoP){
            desplazamientoY = desplazamientoY * -1;
        }

        x = x+desplazamientoX;
        y = y+desplazamientoY;
    }
}
