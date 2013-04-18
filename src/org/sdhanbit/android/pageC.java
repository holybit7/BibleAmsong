package org.sdhanbit.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import roboguice.activity.RoboActivity;

public class pageC extends RoboActivity implements OnClickListener {
    //@InjectView(R.id.title)
    //TextView title;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pc);

        Button b1 = (Button) findViewById(R.id.button_C1);
        b1.setText(R.string.t_C1t);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.button_C2);
        b2.setOnClickListener(this);
        b2.setText(R.string.t_C2t);

        Button b3 = (Button) findViewById(R.id.button_C3);
        b3.setOnClickListener(this);
        b3.setText(R.string.t_C3t);
        Button b4 = (Button) findViewById(R.id.button_C4);
        b4.setOnClickListener(this);
        b4.setText(R.string.t_C4t);

        Button b5 = (Button) findViewById(R.id.button_C5);
        b5.setOnClickListener(this);
        b5.setText(R.string.t_C5t);
        Button b6 = (Button) findViewById(R.id.button_C6);
        b6.setOnClickListener(this);
        b6.setText(R.string.t_C6t);

        Button b7 = (Button) findViewById(R.id.button_C7);
        b7.setOnClickListener(this);
        b7.setText(R.string.t_C7t);
        Button b8 = (Button) findViewById(R.id.button_C8);
        b8.setOnClickListener(this);
        b8.setText(R.string.t_C8t);

        Button b9 = (Button) findViewById(R.id.button_C9);
        b9.setOnClickListener(this);
        b9.setText(R.string.t_C9t);
        Button b10 = (Button) findViewById(R.id.button_C10);
        b10.setOnClickListener(this);
        b10.setText(R.string.t_C10t);

        Button b11 = (Button) findViewById(R.id.button_C11);
        b11.setOnClickListener(this);
        b11.setText(R.string.t_C11t);
        Button b12 = (Button) findViewById(R.id.button_C12);
        b12.setOnClickListener(this);
        b12.setText(R.string.t_C12t);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_C1:
                Intent intent1 = new Intent(this,pBible.class);
                intent1.putExtra("t_bible","t_C1");
                startActivity(intent1);
                break;
            case R.id.button_C2:
                Intent intent2 = new Intent(this,pBible.class);
                intent2.putExtra("t_bible","t_C2");
                startActivity(intent2);
                break;
            case R.id.button_C3:
                Intent intent3 = new Intent(this,pBible.class);
                intent3.putExtra("t_bible","t_C3");
                startActivity(intent3);
                break;
            case R.id.button_C4:
                Intent intent4 = new Intent(this,pBible.class);
                intent4.putExtra("t_bible","t_C4");
                startActivity(intent4);
                break;
            case R.id.button_C5:
                Intent intent5 = new Intent(this,pBible.class);
                intent5.putExtra("t_bible","t_C5");
                startActivity(intent5);
                break;
            case R.id.button_C6:
                Intent intent6 = new Intent(this,pBible.class);
                intent6.putExtra("t_bible","t_C6");
                startActivity(intent6);
                break;
            case R.id.button_C7:
                Intent intent7 = new Intent(this,pBible.class);
                intent7.putExtra("t_bible","t_C7");
                startActivity(intent7);
                break;
            case R.id.button_C8:
                Intent intent8 = new Intent(this,pBible.class);
                intent8.putExtra("t_bible","t_C8");
                startActivity(intent8);
                break;
            case R.id.button_C9:
                Intent intent9 = new Intent(this,pBible.class);
                intent9.putExtra("t_bible","t_C9");
                startActivity(intent9);
                break;
            case R.id.button_C10:
                Intent intent10 = new Intent(this,pBible.class);
                intent10.putExtra("t_bible","t_C10");
                startActivity(intent10);
                break;
            case R.id.button_C11:
                Intent intent11 = new Intent(this,pBible.class);
                intent11.putExtra("t_bible","t_C11");
                startActivity(intent11);
                break;
            case R.id.button_C12:
                Intent intent12 = new Intent(this,pBible.class);
                intent12.putExtra("t_bible","t_C12");
                startActivity(intent12);
                break;
        }
    }




}
