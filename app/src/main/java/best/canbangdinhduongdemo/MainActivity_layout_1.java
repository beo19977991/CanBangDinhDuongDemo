package best.canbangdinhduongdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 13/10/2017.
 */

public class MainActivity_layout_1 extends AppCompatActivity {
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_1);
        btnStart = (Button) findViewById(R.id.btn_Start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenMainActivity_layout_2();

            }

            private void doOpenMainActivity_layout_2() {
                Intent myIntent = new Intent(MainActivity_layout_1.this, MainActivity_layout_2.class);
                startActivity(myIntent);
            }
        });
    }

    }

