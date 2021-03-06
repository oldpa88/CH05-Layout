package tw.oldpa.m0503;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class M0503 extends AppCompatActivity {
    // ---------宣告變數------------
    private CheckBox chb01,chb02,chb03,chb04;
    private Button btn01;
    private TextView txt01;
    // ------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0503);
        setupViewcomponent();
    }
//
    private void setupViewcomponent() {
        chb01 = (CheckBox) findViewById(R.id.m0503_chb01);
        chb02 = (CheckBox) findViewById(R.id.m0503_chb02);
        chb03 = (CheckBox) findViewById(R.id.m0503_chb03);
        chb04 = (CheckBox) findViewById(R.id.m0503_chb04);

        btn01 = (Button) findViewById(R.id.m0503_btn01);
        txt01 = (TextView) findViewById(R.id.m0503_txt001);
        // 設定 button 按鍵的事件
        btn01.setOnClickListener(btn01OnClick);
    }
    private Button.OnClickListener btn01OnClick = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            String ans01 = getString(R.string.m0503_txt01);

            if (chb01.isChecked())     ans01 += chb01.getText().toString()+" ";
            if (chb02.isChecked())     ans01 += chb02.getText().toString()+" ";
            if (chb03.isChecked())     ans01 += chb03.getText().toString()+" ";
            if (chb04.isChecked())     ans01 += chb04.getText().toString()+" ";
            txt01.setText(ans01);
        }
    };
}
