package android.studio.practice.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiKotlinActivity extends AppCompatActivity {
    EditText heightField, weightField;
    TextView txtResult;
    Button btnBmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        heightField = findViewById(R.id.heightField);
        weightField = findViewById(R.id.weightField);
        txtResult = findViewById(R.id.txtResult);
        btnBmi = findViewById(R.id.btnBmi);

        btnBmi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String sheight = heightField.getText().toString();
                String sweight = heightField.getText().toString();
                double bmi = Double.parseDouble(sweight) / Math.pow(Double.parseDouble(sheight)/100., 2);
                txtResult.setText("Your BMI : " + bmi);
            }
        });
    }
}