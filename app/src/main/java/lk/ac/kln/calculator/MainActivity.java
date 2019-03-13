package lk.ac.kln.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int fno;
    int sno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstinput=findViewById(R.id.editText);
        final EditText secondinput=findViewById(R.id.editText2);


        fno=Integer.parseInt(firstinput.getText().toString());
        sno=Integer.parseInt(secondinput.getText().toString());



    }
    protected void addnumbers(View view){
        final TextView calculat=findViewById(R.id.textView2);
        int sum=fno+sno;
        calculat.setText(Integer.toString(sum));
        }
}
