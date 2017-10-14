package best.canbangdinhduongdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Admin on 13/10/2017.
 */

public class MainActivity_layout_3 extends AppCompatActivity {
    private Button btnBack;
    private Button btnNext;
    private EditText edt1;
    private EditText edt2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_3);
        edt1= (EditText) findViewById(R.id.edt_1);
        edt2= (EditText) findViewById(R.id.edt_2);
        btnBack = (Button) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               doOpenMainActivity_layout_2();
            }

            private void doOpenMainActivity_layout_2() {
                Intent myIntent = new Intent(MainActivity_layout_3.this, MainActivity_layout_2.class);
                startActivity(myIntent);
            }

        });
        btnNext= (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               doOpenMAinActivity_layout_4();
            }

            private void doOpenMAinActivity_layout_4() {
                Intent myIntent = new Intent(MainActivity_layout_3.this, MainActivity_layout_4.class);
                startActivity(myIntent);
            }


        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt1.getText().toString().isEmpty()||edt2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity_layout_3.this, "Nhap so hop le. Moi nhap lai", Toast.LENGTH_SHORT).show();
            }
        }


        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_latout_3, menu);
        return true;
    }

}
