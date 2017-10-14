package best.canbangdinhduongdemo;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity_layout_6 extends AppCompatActivity {
    private ListView Lv1;
    private ListView Lv2;
    private Button btnThoiGian;
    private Calendar Cal;
    private Date date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String arr1[]={"Thong Tin","Cai Dat","Tim Kiem"};
        Lv1= (ListView) findViewById(R.id.Lv_1);
        ArrayAdapter mArrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr1);
        Lv1.setAdapter(mArrayAdapter);

        final String arr2[]={"Bai Tap","Thuc An","Tuy Chon"};
        Lv2= (ListView) findViewById(R.id.Lv_2);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr2);
        Lv2.setAdapter(arrayAdapter);

        btnThoiGian= (Button) findViewById(R.id.btn_thoi_gian);
        btnThoiGian.setOnClickListener(showDatePicker);
        Cal=Calendar.getInstance();
        SimpleDateFormat dft = null;
        dft=new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

    }

    View.OnClickListener showDatePicker=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            DatePickerDialog.OnDateSetListener callBack= new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                    Cal.set(year,month,day);
                    date=Cal.getTime();

                }
            };
        }
        };

}

