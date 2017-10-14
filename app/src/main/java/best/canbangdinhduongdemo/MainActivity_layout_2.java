package best.canbangdinhduongdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 13/10/2017.
 */

public class MainActivity_layout_2 extends AppCompatActivity {
    private Button btnNext;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_2);
        btnBack = (Button) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               doOpenMainActivity_layout_1();
            }

            private void doOpenMainActivity_layout_1() {
                Intent myIntent = new Intent(MainActivity_layout_2.this, MainActivity_layout_1.class);
                startActivity(myIntent);
            }
        });
        btnNext= (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               doOpenMainActivity_layout_3();
            }

            private void doOpenMainActivity_layout_3() {
                Intent myIntent = new Intent(MainActivity_layout_2.this, MainActivity_layout_3.class);
                startActivity(myIntent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_latout_2, menu);
        return true;
    }
}
