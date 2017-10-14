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

public class MainActivity_layout_5 extends AppCompatActivity {
    private Button btnBack;
    private Button btnLetStart;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_5);
        btnBack= (Button) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               doOpenMainActivity_layout_4();
            }

            private void doOpenMainActivity_layout_4() {
                Intent myIntent = new Intent(MainActivity_layout_5.this, MainActivity_layout_4.class);
                startActivity(myIntent);
            }
        });
        btnLetStart= (Button) findViewById(R.id.btn_LT);
        btnLetStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               doOpenMainActivity_layout_6();
            }

            private void doOpenMainActivity_layout_6() {
                Intent myIntent = new Intent(MainActivity_layout_5.this, MainActivity_layout_6.class);
                startActivity(myIntent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_latout_5, menu);
        return true;
    }
}
