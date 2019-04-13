package com.ilatyphi95.simpleradiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tvDisplay = findViewById(R.id.tv_display);

        RadioGroup rgSelection = findViewById(R.id.rg_selection);
        rgSelection.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String showMessage = "";
                switch(checkedId) {
                    case R.id.radioButton:
                        showMessage = "You have selected the first RadioButton";
                        break;
                    case R.id.radioButton2:
                        showMessage = "You have selected the second RadioButton";
                        break;
                    case R.id.radioButton3:
                        showMessage = "You have selected the third RadioButton";
                        break;
                    case R.id.radioButton4:
                        showMessage = "You have selected the fourth RadioButton";
                        break;
                }
                tvDisplay.setText(showMessage);
            }
        });
    }
}
