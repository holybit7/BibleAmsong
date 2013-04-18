package org.sdhanbit.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import roboguice.activity.RoboActivity;

public class pageE extends RoboActivity implements OnClickListener {
    //@InjectView(R.id.title)
    //TextView title;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pe);

        Button b1 = (Button) findViewById(R.id.button_E1);
        b1.setText(R.string.t_E1t);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.button_E2);
        b2.setOnClickListener(this);
        b2.setText(R.string.t_E2t);

        Button b3 = (Button) findViewById(R.id.button_E3);
        b3.setOnClickListener(this);
        b3.setText(R.string.t_E3t);
        Button b4 = (Button) findViewById(R.id.button_E4);
        b4.setOnClickListener(this);
        b4.setText(R.string.t_E4t);

        Button b5 = (Button) findViewById(R.id.button_E5);
        b5.setOnClickListener(this);
        b5.setText(R.string.t_E5t);
        Button b6 = (Button) findViewById(R.id.button_E6);
        b6.setOnClickListener(this);
        b6.setText(R.string.t_E6t);

        Button b7 = (Button) findViewById(R.id.button_E7);
        b7.setOnClickListener(this);
        b7.setText(R.string.t_E7t);
        Button b8 = (Button) findViewById(R.id.button_E8);
        b8.setOnClickListener(this);
        b8.setText(R.string.t_E8t);

        Button b9 = (Button) findViewById(R.id.button_E9);
        b9.setOnClickListener(this);
        b9.setText(R.string.t_E9t);
        Button b10 = (Button) findViewById(R.id.button_E10);
        b10.setOnClickListener(this);
        b10.setText(R.string.t_E10t);

        Button b11 = (Button) findViewById(R.id.button_E11);
        b11.setOnClickListener(this);
        b11.setText(R.string.t_E11t);
        Button b12 = (Button) findViewById(R.id.button_E12);
        b12.setOnClickListener(this);
        b12.setText(R.string.t_E12t);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_E1:
                Intent intent1 = new Intent(this,pBible.class);
                intent1.putExtra("t_bible","t_E1");
                startActivity(intent1);
                break;
            case R.id.button_E2:
                Intent intent2 = new Intent(this,pBible.class);
                intent2.putExtra("t_bible","t_E2");
                startActivity(intent2);
                break;
            case R.id.button_E3:
                Intent intent3 = new Intent(this,pBible.class);
                intent3.putExtra("t_bible","t_E3");
                startActivity(intent3);
                break;
            case R.id.button_E4:
                Intent intent4 = new Intent(this,pBible.class);
                intent4.putExtra("t_bible","t_E4");
                startActivity(intent4);
                break;
            case R.id.button_E5:
                Intent intent5 = new Intent(this,pBible.class);
                intent5.putExtra("t_bible","t_E5");
                startActivity(intent5);
                break;
            case R.id.button_E6:
                Intent intent6 = new Intent(this,pBible.class);
                intent6.putExtra("t_bible","t_E6");
                startActivity(intent6);
                break;
            case R.id.button_E7:
                Intent intent7 = new Intent(this,pBible.class);
                intent7.putExtra("t_bible","t_E7");
                startActivity(intent7);
                break;
            case R.id.button_E8:
                Intent intent8 = new Intent(this,pBible.class);
                intent8.putExtra("t_bible","t_E8");
                startActivity(intent8);
                break;
            case R.id.button_E9:
                Intent intent9 = new Intent(this,pBible.class);
                intent9.putExtra("t_bible","t_E9");
                startActivity(intent9);
                break;
            case R.id.button_E10:
                Intent intent10 = new Intent(this,pBible.class);
                intent10.putExtra("t_bible","t_E10");
                startActivity(intent10);
                break;
            case R.id.button_E11:
                Intent intent11 = new Intent(this,pBible.class);
                intent11.putExtra("t_bible","t_E11");
                startActivity(intent11);
                break;
            case R.id.button_E12:
                Intent intent12 = new Intent(this,pBible.class);
                intent12.putExtra("t_bible","t_E12");
                startActivity(intent12);
                break;
        }
    }




}
