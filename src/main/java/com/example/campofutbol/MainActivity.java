package com.example.campofutbol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{
    private int corx, cory, corx2, cory2, corx3, cory3, corx4, cory4, corx5, cory5, corx6, cory6, corx7, cory7, corx8, cory8, corx9, cory9, corx10, cory10, corx11, cory11, corx12,cory12, corx13, cory13, corx14, cory14;
    private Lienzo fondo;
    boolean pelota1 ,pelota2  , pelota3 , pelota4 , pelota5 , pelota6 , pelota7 , pelota8 , pelota9 , pelota10 , pelota11 , pelota12 , pelota13 , pelota14 ;

    private int radius= 45;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        corx = 780;
        cory = 325;

        corx2 = 310;
        cory2 = 325;

        corx3 = 530;
        cory3 = 100;

        corx4 = 180;
        cory4 = 530;

        corx5 = 550;
        cory5 = 530;

        corx6 = 900;
        cory6 = 530;

        corx7 = 550;
        cory7 = 710;

        corx8 = 550;
        cory8 = 1210;

        corx9 = 900;
        cory9 = 1210;

        corx10 = 180;
        cory10 = 1210;

        corx11 = 780;
        cory11 = 1410;

        corx12 = 310;
        cory12 = 1410;

        corx13 = 550;
        cory13 = 1650;

        corx14 = 550;
        cory14 = 1035;

        ConstraintLayout miFondo = findViewById(R.id.Cesped);
        fondo = new Lienzo(this);
        fondo.setOnTouchListener(this);
        miFondo.addView(fondo);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void pelotaCorrecta(int num) {
        pelota1 = pelota2 = pelota3 = pelota4 = pelota5 = pelota6 = pelota7 = pelota8 = pelota9 = pelota10 = pelota11 = pelota12 = pelota13 = pelota14 = false;
        switch (num) {
            case 1:
                pelota1 = true;
                break;
            case 2:
                pelota2 = true;
                break;
            case 3:
                pelota3 = true;
                break;
            case 4:
                pelota4 = true;
                break;
            case 5:
                pelota5 = true;
                break;
            case 6:
                pelota6 = true;
                break;
            case 7:
                pelota7 = true;
                break;
            case 8:
                pelota8 = true;
                break;
            case 9:
                pelota9 = true;
                break;
            case 10:
                pelota10 = true;
                break;
            case 11:
                pelota11 = true;
                break;
            case 12:
                pelota12 = true;
                break;
            case 13:
                pelota13 = true;
                break;
            case 14:
                pelota14 = true;
                break;
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(corx <=(int) motionEvent.getX()+10 && corx >= (int)motionEvent.getX()-10 && cory <=(int) motionEvent.getY()+10 && cory >= (int)motionEvent.getY()-10){
                pelotaCorrecta(1);
        }
        if(corx2 <=(int) motionEvent.getX()+10 && corx2 >= (int)motionEvent.getX()-10 && cory2 <=(int) motionEvent.getY()+10 && cory2 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(2);
        }
        if(corx3 <=(int) motionEvent.getX()+10 && corx3 >= (int)motionEvent.getX()-10 && cory3 <=(int) motionEvent.getY()+10 && cory3 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(3);
        }
        if(corx4 <=(int) motionEvent.getX()+10 && corx4 >= (int)motionEvent.getX()-10 && cory4 <=(int) motionEvent.getY()+10 && cory4 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(4);
        }
        if(corx5 <=(int) motionEvent.getX()+10 && corx5 >= (int)motionEvent.getX()-10 && cory5 <=(int) motionEvent.getY()+10 && cory5 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(5);
        }
        if(corx6 <=(int) motionEvent.getX()+10 && corx6 >= (int)motionEvent.getX()-10 && cory6 <=(int) motionEvent.getY()+10 && cory6 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(6);
        }
        if(corx7 <=(int) motionEvent.getX()+10 && corx7 >= (int)motionEvent.getX()-10 && cory7 <=(int) motionEvent.getY()+10 && cory7 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(7);
        }
        if(corx8 <=(int) motionEvent.getX()+10 && corx8 >= (int)motionEvent.getX()-10 && cory8 <=(int) motionEvent.getY()+10 && cory8 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(8);
        }
        if(corx9 <=(int) motionEvent.getX()+10 && corx9 >= (int)motionEvent.getX()-10 && cory9 <=(int) motionEvent.getY()+10 && cory9 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(9);
        }
        if(corx10 <=(int) motionEvent.getX()+10 && corx10 >= (int)motionEvent.getX()-10 && cory10 <=(int) motionEvent.getY()+10 && cory10 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(10);
        }
        if(corx11 <=(int) motionEvent.getX()+10 && corx11 >= (int)motionEvent.getX()-10 && cory11 <=(int) motionEvent.getY()+10 && cory11 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(11);
        }
        if(corx12 <=(int) motionEvent.getX()+10 && corx12 >= (int)motionEvent.getX()-10 && cory12 <=(int) motionEvent.getY()+10 && cory12 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(12);
        }
        if(corx13 <=(int) motionEvent.getX()+10 && corx13 >= (int)motionEvent.getX()-10 && cory13 <=(int) motionEvent.getY()+10 && cory13 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(13);
        }
        if(corx14 <=(int) motionEvent.getX()+10 && corx14 >= (int)motionEvent.getX()-10 && cory14 <=(int) motionEvent.getY()+10 && cory14 >= (int)motionEvent.getY()-10){
            pelotaCorrecta(14);
        }
        if(pelota1){
            corx = (int) motionEvent.getX();
            cory = (int) motionEvent.getY();
        }else if(pelota2){
            corx2 = (int) motionEvent.getX();
            cory2 = (int) motionEvent.getY();
        } else if (pelota3) {
            corx3 = (int) motionEvent.getX();
            cory3 = (int) motionEvent.getY();

        } else if (pelota4) {
            corx4 = (int) motionEvent.getX();
            cory4 = (int) motionEvent.getY();

        } else if (pelota5) {
            corx5 = (int) motionEvent.getX();
            cory5 = (int) motionEvent.getY();
        } else if (pelota6) {
            corx6 = (int) motionEvent.getX();
            cory6 = (int) motionEvent.getY();

        } else if (pelota7) {
            corx7 = (int) motionEvent.getX();
            cory7 = (int) motionEvent.getY();

        } else if (pelota8) {
            corx8 = (int) motionEvent.getX();
            cory8 = (int) motionEvent.getY();

        } else if (pelota9) {
            corx9 = (int) motionEvent.getX();
            cory9 = (int) motionEvent.getY();

        } else if (pelota10) {
            corx10 = (int) motionEvent.getX();
            cory10 = (int) motionEvent.getY();

        } else if (pelota11) {
            corx11 = (int) motionEvent.getX();
            cory11 = (int) motionEvent.getY();

        } else if (pelota12) {
            corx12 = (int) motionEvent.getX();
            cory12 = (int) motionEvent.getY();

        } else if (pelota13) {
            corx13 = (int) motionEvent.getX();
            cory13 = (int) motionEvent.getY();

        } else if (pelota14) {
            corx14 = (int) motionEvent.getX();
            cory14 = (int) motionEvent.getY();
        }
        fondo.invalidate();
        return true;
    }


    class Lienzo extends View {

        public Lienzo(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {
            canvas.drawRGB(0, 255, 0);
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();

            // Dibujar el campo de futbol
            Paint pincel2 = new Paint();
            pincel2.setARGB(255, 255, 255, 255);
            pincel2.setStyle(Paint.Style.STROKE);
            pincel2.setStrokeWidth(10);
            int margen = 50;
            canvas.drawRect(margen, margen, ancho - margen, alto - 225, pincel2);
            // Dibujar linea del centro
            int rectTop = margen;
            int lineaBaja = alto - 225;
            int rectMiddleY = (rectTop + lineaBaja) / 2;
            canvas.drawLine(margen, rectMiddleY, ancho - margen, rectMiddleY, pincel2);
            // Circulo central
            float centerX = canvas.getWidth() / 2;
            //Toast.makeText(getContext(), "punto centro: " + centerX + " Alto: " + alto, Toast.LENGTH_LONG).show();
            //Toast.makeText(getContext(), "punto abajo: " + ancho , Toast.LENGTH_LONG).show();
            float centerY = (canvas.getHeight() / 2) - 87;
            float radio = 120;
            float centroCampo = 15;
            canvas.drawCircle(centerX, centerY, radio, pincel2);
            pincel2.setStyle(Paint.Style.FILL);
            canvas.drawCircle(centerX, centerY, centroCampo, pincel2);
            pincel2.setStyle(Paint.Style.STROKE);

            // Dibujar area pequeña
            int margenPequena = 400;
            int margenGrande = 250;
            //Area de abajo
            canvas.drawRect(margenPequena, lineaBaja - 100, ancho - margenPequena, lineaBaja, pincel2);
            canvas.drawRect(margenGrande, lineaBaja - 235, ancho - margenGrande, lineaBaja, pincel2);


            // Area de arriba
            int lineaAlta = margen;
            canvas.drawRect(margenPequena, lineaAlta, ancho - margenPequena, lineaAlta + 100, pincel2);
            canvas.drawRect(margenGrande, lineaAlta, ancho - margenGrande, lineaAlta + 235, pincel2);

            //Porterías
            int porteriaAncho = 100;
            int porteriaAltura = 40;
            canvas.drawRect(centerX - porteriaAncho / 2, margen - porteriaAltura, centerX + porteriaAncho / 2, margen, pincel2);
            canvas.drawRect(centerX - porteriaAncho / 2, alto - margen, centerX + porteriaAncho / 2, alto - margen + porteriaAltura, pincel2);

            canvas.drawRect(centerX - porteriaAncho / 2, lineaBaja, centerX + porteriaAncho / 2, lineaBaja + porteriaAltura, pincel2);
            canvas.drawRect(centerX - porteriaAncho / 2, alto - margen - porteriaAltura, centerX + porteriaAncho / 2, alto - margen, pincel2);

            // Puntos de penalti
            float radioPuntoPenalti = 10;
            pincel2.setStyle(Paint.Style.FILL);
            float penalYSuperior = margen + margenGrande - 85;
            float penalYInferior = alto - margen - margenGrande - 85;
            canvas.drawCircle(centerX, penalYSuperior, radioPuntoPenalti, pincel2);
            canvas.drawCircle(centerX, penalYInferior, radioPuntoPenalti, pincel2);
            pincel2.setStyle(Paint.Style.STROKE);


            // Semicírculo superior
            float arcoRadioSuperior = 100;
            canvas.drawArc(centerX - arcoRadioSuperior, margen + margenGrande - arcoRadioSuperior,
                    centerX + arcoRadioSuperior, margen + margenGrande + arcoRadioSuperior,
                    0, 180, false, pincel2);


            // Semicírculo inferior
            canvas.drawArc(centerX - arcoRadioSuperior, lineaBaja - margenGrande - arcoRadioSuperior,
                    centerX + arcoRadioSuperior, lineaBaja - margenGrande + arcoRadioSuperior,
                    180, 180, false, pincel2);

            // Corners
            float cornerRadio = 50;
            canvas.drawArc(margen - cornerRadio, margen - cornerRadio, margen + cornerRadio, margen + cornerRadio,
                    0, 90, false, pincel2);
            canvas.drawArc(ancho - margen - cornerRadio, margen - cornerRadio, ancho - margen + cornerRadio, margen + cornerRadio,
                    90, 90, false, pincel2);
            canvas.drawArc(margen - cornerRadio, alto - 225 - cornerRadio, margen + cornerRadio, alto - 225 + cornerRadio,
                    270, 90, false, pincel2);
            canvas.drawArc(ancho - margen - cornerRadio, alto - 225 - cornerRadio, ancho - margen + cornerRadio, alto - 225 + cornerRadio,
                    180, 90, false, pincel2);

            //--------------PELOTAS---------
            pincel2.setStyle(Paint.Style.STROKE);
            pincel2.setARGB(255, 255, 0, 0);
            canvas.drawCircle(corx, cory, radius, pincel2);
            canvas.drawCircle(corx2, cory2, radius, pincel2);
            canvas.drawCircle(corx3, cory3, radius, pincel2);
            canvas.drawCircle(corx4, cory4, radius, pincel2);
            canvas.drawCircle(corx5, cory5, radius, pincel2);
            canvas.drawCircle(corx6, cory6, radius, pincel2);
            canvas.drawCircle(corx7, cory7, radius, pincel2);
            pincel2.setARGB(255, 0, 0, 255);
            canvas.drawCircle(corx8, cory8, radius, pincel2);
            canvas.drawCircle(corx9, cory9, radius, pincel2);
            canvas.drawCircle(corx10, cory10, radius, pincel2);
            canvas.drawCircle(corx11, cory11, radius, pincel2);
            canvas.drawCircle(corx12, cory12, radius, pincel2);
            canvas.drawCircle(corx13, cory13, radius, pincel2);
            canvas.drawCircle(corx14, cory14, radius, pincel2);
        }
    }

}
