package study.vv.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i=(int)(Math.random()*(5-1)+1);
        switch (i) {
            case 2:setContentView(R.layout.activity_main2);
                break;
            case 3:setContentView(R.layout.activity_main3);
                break;
            case 4:setContentView(R.layout.activity_main4);
                break;
            case 5:setContentView(R.layout.activity_main5);
                break;
            default:setContentView(R.layout.activity_main);
                break;
        }
    }
    public void plus(View v){
        EditText num1 = (EditText)findViewById(R.id.first_number);
        EditText num2 = (EditText)findViewById(R.id.second_number);
        TextView res = (TextView)findViewById(R.id.result);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        res.setText("" + (Double.parseDouble(snum1) +Double.parseDouble(snum2)));
    }

    public void minus(View view) {
        EditText num1 = (EditText)findViewById(R.id.first_number);
        EditText num2 = (EditText)findViewById(R.id.second_number);
        TextView res = (TextView)findViewById(R.id.result);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        res.setText("" + (Double.parseDouble(snum1) - Double.parseDouble(snum2)));
    }
    public void multiple(View view){
        EditText num1 = (EditText)findViewById(R.id.first_number);
        EditText num2 = (EditText)findViewById(R.id.second_number);
        TextView res = (TextView)findViewById(R.id.result);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        res.setText("" + (Double.parseDouble(snum1) * Double.parseDouble(snum2)));
    }
    public void dis(View view){
        EditText num1 = (EditText)findViewById(R.id.first_number);
        EditText num2 = (EditText)findViewById(R.id.second_number);
        TextView res = (TextView)findViewById(R.id.result);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        res.setText("" + (Double.parseDouble(snum1) / Double.parseDouble(snum2)));
    }

}
