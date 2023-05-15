package sg.edu.rp.c346.id22017424.p04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etPhone;
    EditText etSize;
    TimePicker tp;
    DatePicker dp;
    RadioGroup rgArea;
    Button btnConfirm;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.editTextName);
        etPhone = findViewById(R.id.editTextPhone);
        etSize = findViewById(R.id.editTextSize);
        tp = findViewById(R.id.timePicker);
        dp = findViewById(R.id.datePicker);
        btnReset = findViewById(R.id.buttonReset);
        btnConfirm = findViewById(R.id.buttonConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String details = "name: " + etName.toString();
                details += "Phone: " + etPhone.toString() ;
                details += "Group Size: " + etSize;
                details += "Time: " + tp.getCurrentHour().toString() + ":" + tp.getCurrentMinute().toString();
                details += "Date: " + dp.getDayOfMonth() + (dp.getMonth()+1) + dp.getYear();
                details += "Area: " + rgArea.toString();
                Toast.makeText(MainActivity.this, details, Toast.LENGTH_LONG).show();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2023, 0, 1);
            }
        });

    }
}