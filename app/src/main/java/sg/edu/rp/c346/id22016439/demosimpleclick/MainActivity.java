package sg.edu.rp.c346.id22016439.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Step 1: Declare the field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    Button toggleButton;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2: Link the field variables to UI components in layout
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.btn);
        etInput = findViewById(R.id.editTextInput);
        toggleButton = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.Gender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                if(toggleButton.isActivated()) //check if its true
                {
                    etInput.setEnabled(true);
                }else {
                    etInput.setEnabled(false);
                }
            }
        });

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String said= "";
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonMale){
                    // Write the code when male selected
                    said="He said ";
                }
                else{
                    // Write the code when female selected
                    said="She said ";
                }
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(said + stringResponse);

                Toast.makeText(MainActivity.this,"Text changed to "+ stringResponse,Toast.LENGTH_SHORT).show();

            }
        });



    }
}