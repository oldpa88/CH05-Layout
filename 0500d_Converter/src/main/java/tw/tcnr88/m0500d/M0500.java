package tw.tcnr88.m0500d;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class M0500 extends AppCompatActivity {

    private EditText e001;
    private Button b001;
    private TextView t003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);
        setupViewcomponent();
    }

    private void setupViewcomponent() { //
        e001 = (EditText) findViewById(R.id.m0500_e001);
        b001 = (Button) findViewById(R.id.m0500_b001);
        t003 = (TextView) findViewById(R.id.m0500_t003);
        b001.setOnClickListener(b001On);
    }

    private View.OnClickListener b001On = new View.OnClickListener() {
        //
        @Override
        public void onClick(View v) {
            DecimalFormat pondsFormat = new DecimalFormat("0.00000");
            String ans = pondsFormat.format(Float.parseFloat(e001
                    .getText().toString()) * 2.20462262);
            t003.setText(ans);
        }
    };

}