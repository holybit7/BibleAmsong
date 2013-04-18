package org.sdhanbit.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import roboguice.activity.RoboActivity;

public class pageB extends RoboActivity implements OnClickListener {
    //@InjectView(R.id.title)
    //TextView title;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pb);

        Button b1 = (Button) findViewById(R.id.button_B1);
        b1.setText(R.string.t_B1t);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.button_B2);
        b2.setOnClickListener(this);
        b2.setText(R.string.t_B2t);

        Button b3 = (Button) findViewById(R.id.button_B3);
        b3.setOnClickListener(this);
        b3.setText(R.string.t_B3t);
        Button b4 = (Button) findViewById(R.id.button_B4);
        b4.setOnClickListener(this);
        b4.setText(R.string.t_B4t);

        Button b5 = (Button) findViewById(R.id.button_B5);
        b5.setOnClickListener(this);
        b5.setText(R.string.t_B5t);
        Button b6 = (Button) findViewById(R.id.button_B6);
        b6.setOnClickListener(this);
        b6.setText(R.string.t_B6t);

        Button b7 = (Button) findViewById(R.id.button_B7);
        b7.setOnClickListener(this);
        b7.setText(R.string.t_B7t);
        Button b8 = (Button) findViewById(R.id.button_B8);
        b8.setOnClickListener(this);
        b8.setText(R.string.t_B8t);

        Button b9 = (Button) findViewById(R.id.button_B9);
        b9.setOnClickListener(this);
        b9.setText(R.string.t_B9t);
        Button b10 = (Button) findViewById(R.id.button_B10);
        b10.setOnClickListener(this);
        b10.setText(R.string.t_B10t);

        Button b11 = (Button) findViewById(R.id.button_B11);
        b11.setOnClickListener(this);
        b11.setText(R.string.t_B11t);
        Button b12 = (Button) findViewById(R.id.button_B12);
        b12.setOnClickListener(this);
        b12.setText(R.string.t_B12t);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_B1:
                Intent intent1 = new Intent(this,pBible.class);
                intent1.putExtra("t_bible","t_B1");
                startActivity(intent1);
                break;
            case R.id.button_B2:
                Intent intent2 = new Intent(this,pBible.class);
                intent2.putExtra("t_bible","t_B2");
                startActivity(intent2);
                break;
            case R.id.button_B3:
                Intent intent3 = new Intent(this,pBible.class);
                intent3.putExtra("t_bible","t_B3");
                startActivity(intent3);
                break;
            case R.id.button_B4:
                Intent intent4 = new Intent(this,pBible.class);
                intent4.putExtra("t_bible","t_B4");
                startActivity(intent4);
                break;
            case R.id.button_B5:
                Intent intent5 = new Intent(this,pBible.class);
                intent5.putExtra("t_bible","t_B5");
                startActivity(intent5);
                break;
            case R.id.button_B6:
                Intent intent6 = new Intent(this,pBible.class);
                intent6.putExtra("t_bible","t_B6");
                startActivity(intent6);
                break;
            case R.id.button_B7:
                Intent intent7 = new Intent(this,pBible.class);
                intent7.putExtra("t_bible","t_B7");
                startActivity(intent7);
                break;
            case R.id.button_B8:
                Intent intent8 = new Intent(this,pBible.class);
                intent8.putExtra("t_bible","t_B8");
                startActivity(intent8);
                break;
            case R.id.button_B9:
                Intent intent9 = new Intent(this,pBible.class);
                intent9.putExtra("t_bible","t_B9");
                startActivity(intent9);
                break;
            case R.id.button_B10:
                Intent intent10 = new Intent(this,pBible.class);
                intent10.putExtra("t_bible","t_B10");
                startActivity(intent10);
                break;
            case R.id.button_B11:
                Intent intent11 = new Intent(this,pBible.class);
                intent11.putExtra("t_bible","t_B11");
                startActivity(intent11);
                break;
            case R.id.button_B12:
                Intent intent12 = new Intent(this,pBible.class);
                intent12.putExtra("t_bible","t_B12");
                startActivity(intent12);
                break;
        }
    }




}
