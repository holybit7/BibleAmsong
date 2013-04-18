package org.sdhanbit.android;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.content.Intent;
import android.view.View.OnClickListener;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: jinhyunc
 * Date: 2/16/13
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class page_jintest extends Activity { //implements OnClickListener {
    //int x= 500, y = 500;
    //String str;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_jintest);

        TextView tv1 = (TextView) findViewById (R.id.textView_rome_12_1);
        tv1.setText("로마서 12:1 \n\n그러므로 형제들아 내가 하나님의 모든 자비하심으로 너희를 권하노니 너희 몸을 하나님이 기뻐하시는 거룩한 산 제물로 드리라 이는 너희가 드릴 영적 예배니라\n");

        //Jin Test 02.16
        //Button b2 = (Button) findViewById(R.id.button_jin2);
        //b2.setText("GraphicTest");
        //b2.setOnClickListener(this);
    }

    /*
    public void onClick(View v) {
        //To change body of implemented methods use File | Settings | File Templates.
        switch (v.getId()) {
            case R.id.button_jin2:
                Intent intent2 = new Intent(this,page_jin_graphic_test.class);
                startActivity(intent2);
                break;
        }
    }
     */
    /*
    @Override
    protected void onDraw(Canvas canvas)
    {
        Paint paint = new Paint();
        int color;
        Random rnd = new Random();
        color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        //paint.setColor(Color.WHITE);
        paint.setColor(color);
        //ctrl+spacebar to show available declaration and press Enter to finish which you have selected
        canvas.drawRect(x,y,x+50,y+50,paint);
        canvas.drawText("action type"+ str, 0, 20, paint);
        canvas.drawText("x axis"+ x,0,40,paint);
        canvas.drawText("y axis"+ y,0,60,paint);
    }

    @Override
    public boolean  onTouchEvent(MotionEvent event)
    {
        x = (int) event.getX();
        //getX() is calling X axis value
        y = (int) event.getY();

        if (event.getAction()==MotionEvent.ACTION_DOWN)
            //when you click of touch device display that is ACTION_DOWN
            str = "ACTION_DOWN";
        if (event.getAction()==MotionEvent.ACTION_MOVE)
            //while you touch device and move around your finger this action is used to be ACTION_MOVE
            str = "ACTION_MOVE";
        if (event.getAction()==MotionEvent.ACTION_UP)
            //when you take off finger from device display or button that is ACTION_UP
            str = "ACTION_UP";
        invalidate();
        //it is nothing just ignore what ever it happens
        return true;
    }
     */
}




