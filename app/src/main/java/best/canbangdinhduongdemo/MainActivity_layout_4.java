package best.canbangdinhduongdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Admin on 13/10/2017.
 */

public class MainActivity_layout_4 extends AppCompatActivity {
    private Button btnBack;
    private Button btNext;
    private NumberPicker numberPicker;
    private TextView tvChonDoTuoi;
    private EditText edt3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_4);
        edt3= (EditText) findViewById(R.id.edt_3);
        btnBack = (Button) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               doOpenMainActivity_layout_3();
            }

            private void doOpenMainActivity_layout_3() {
                Intent myIntent = new Intent(MainActivity_layout_4.this, MainActivity_layout_3.class);
                startActivity(myIntent);
            }
        });
        btNext= (Button) findViewById(R.id.btn_next);
        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               doOpenMainActivity_layout_5();
            }

            private void doOpenMainActivity_layout_5() {
                Intent myIntent = new Intent(MainActivity_layout_4.this, MainActivity_layout_5.class);
                startActivity(myIntent);
            }
        });
        tvChonDoTuoi= (TextView) findViewById(R.id.tv_chon_do_tuoi);
        numberPicker= (NumberPicker) findViewById(R.id.number_picker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(100);
        numberPicker.setWrapSelectorWheel(true);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int oldVal, int newVal) {
                tvChonDoTuoi.setText("Tuoi cua ban la:" + newVal);

            }
        });
        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt3.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity_layout_4.this, "Nhap so hop le. Moi nhap lai", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_latout_4, menu);
        return true;
    }
}
