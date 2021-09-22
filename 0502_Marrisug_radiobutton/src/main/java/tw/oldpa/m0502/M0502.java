package tw.oldpa.m0502;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class M0502 extends AppCompatActivity {
    //宣告變數
    private Button b001;
    private RadioGroup rb01, rb02;
    private RadioButton rb021, rb022,  rb023;
    private TextView ans01;
    private String strSug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0502);
        setupViewComponent();
    }

    private void setupViewComponent() {
//        //取得R.java 配置碼
        b001 = (Button) findViewById(R.id.m0502_b001);
        ans01 = (TextView) findViewById(R.id.m0502_f000);  //建議
//
        rb01 = (RadioGroup) findViewById(R.id.m0502_r001); //性別
        rb02 = (RadioGroup) findViewById(R.id.m0502_r002); //年齡
        rb021 = (RadioButton) findViewById(R.id.m0502_r002a);
        rb022 = (RadioButton) findViewById(R.id.m0502_r002b);
        rb023 = (RadioButton) findViewById(R.id.m0502_r002c);
//
//        //設監聽
        rb01.setOnCheckedChangeListener(radGSexOnCheChanLis);
        b001.setOnClickListener(btnDoSugOnClick);
    }
    // =========================================================================

    private RadioGroup.OnCheckedChangeListener radGSexOnCheChanLis = new RadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.m0502_r001a: //點男
                    rb021.setText(R.string.m0502_r002aa);
                    rb022.setText(R.string.m0502_r002ab);
                    rb023.setText(R.string.m0502_r002ac);
                    break;
                case R.id.m0502_r001b: //點女
                    rb021.setText(R.string.m0502_r002ba);
                    rb022.setText(R.string.m0502_r002bb);
                    rb023.setText(R.string.m0502_r002bc);
                    break;
            }
        }
    };
//

    // =========================================================================

    private Button.OnClickListener btnDoSugOnClick = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
//            //
            strSug = getString(R.string.m0502_f000); //建議您
            int iCheckedRadBtn = rb01.getCheckedRadioButtonId();
////            ===========================
//
            switch (iCheckedRadBtn) {
                case R.id.m0502_r001a:
                    switch (rb02.getCheckedRadioButtonId()) {
                        case R.id.m0502_r002a:
                            strSug += getString(R.string.m0502_f001);
                            break;
                        case R.id.m0502_r002b:
                            strSug += getString(R.string.m0502_f002);
                            break;
                        default:
                            strSug += getString(R.string.m0502_f003);
                    }
                    break;
//                    ------------------------------------------
                case R.id.m0502_r001b:
                    switch (rb02.getCheckedRadioButtonId()) {
                        case R.id.m0502_r002a:
                            strSug += getString(R.string.m0502_f004);
                            break;
                        case R.id.m0502_r002b:
                            strSug += getString(R.string.m0502_f005);
                            break;
                        default:
                            strSug += getString(R.string.m0502_f006);
                    }
                    break;
            }
//
            ans01.setText(strSug);
        }
    };
}
