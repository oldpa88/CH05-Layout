package tw.oldpa.m0500g;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class M0500 extends AppCompatActivity {
    //宣告變數
    private EditText e001;
    private Button b001;
    private TextView t001;
    private TextView t002;
    private TextView t003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);
        setupViewcomponent();
    }
//
    private void setupViewcomponent() {
        //連接R.java配置檔
        e001 = (EditText) findViewById(R.id.m0500_e001); //
        b001 = (Button) findViewById(R.id.m0500_b001);    //按鈕
        t001 = (TextView) findViewById(R.id.m0500_t003);
        t002 = (TextView) findViewById(R.id.m0500_t006);
        t003 = (TextView) findViewById(R.id.m0500_t007);//
        //宣告傾聽
        b001.setOnClickListener(b001ON);

    }
    private Button.OnClickListener b001ON = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            DecimalFormat poundsFormat = new DecimalFormat("0.0000");
            String outcome = poundsFormat.format(Float.parseFloat(e001.getText().toString()) * 0.00034);
            t001.setText(outcome);
            String outcome1 = poundsFormat.format(Float.parseFloat(e001.getText().toString()) * 3.31);
            t002.setText(outcome1);
            String outcome2 = poundsFormat.format(Float.parseFloat(e001.getText().toString()) * 0.0331);
            t003.setText(outcome2);
        }
    };
}
