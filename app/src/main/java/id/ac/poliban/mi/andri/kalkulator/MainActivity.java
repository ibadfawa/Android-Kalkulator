package id.ac.poliban.mi.andri.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etFirstNumber = findViewById(R.id.etFirstNumber);
        EditText etSecondNumber = findViewById(R.id.etSecondNumber);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btClear = findViewById(R.id.btClear);
        TextView tvHasil = findViewById(R.id.tvHasil);

        btTambah.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Integer fNumber = Integer.parseInt(etFirstNumber.getText().toString());
                Integer sNumber = Integer.parseInt(etSecondNumber.getText().toString());
                int hasil = fNumber + sNumber;
                tvHasil.setText(Integer.toString(hasil));
            }
        });

        btKurang.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Integer fNumber = Integer.parseInt(etFirstNumber.getText().toString());
                Integer sNumber = Integer.parseInt(etSecondNumber.getText().toString());
                int hasil = fNumber - sNumber;
                tvHasil.setText(Integer.toString(hasil));
            }
        });

        btKali.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Integer fNumber = Integer.parseInt(etFirstNumber.getText().toString());
                Integer sNumber = Integer.parseInt(etSecondNumber.getText().toString());
                int hasil = fNumber * sNumber;
                tvHasil.setText(Integer.toString(hasil));

            }
        });

        btBagi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Double fNumber = Double.parseDouble(etFirstNumber.getText().toString());
                Double sNumber = Double.parseDouble(etSecondNumber.getText().toString());
                double hasil = fNumber + sNumber;
                tvHasil.setText(Double.toString(hasil));
            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etFirstNumber.setText("");
                etSecondNumber.setText("");
                etFirstNumber.requestFocus();
                tvHasil.setText("0");
            }
        });


    }
}
