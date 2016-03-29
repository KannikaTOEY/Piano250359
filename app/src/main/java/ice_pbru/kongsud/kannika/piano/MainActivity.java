package ice_pbru.kongsud.kannika.piano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //2.Explicit
    //access type name
    private Button DoButton;
    private Button REButton;
    private Button MIButton;
    private Button FAButton;
    private Button SOLButton;
    private Button LAButton;
    private Button SIButton;
    private Button DOButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3.Bind widget
        bindWidget();




    }//Main Method

    private void bindWidget() {
        DoButton = (Button) findViewById(R.id.button);
        REButton = (Button) findViewById(R.id.button2);
        MIButton = (Button) findViewById(R.id.button3);
        FAButton = (Button) findViewById(R.id.button4);
        SOLButton = (Button) findViewById(R.id.button5);
        LAButton = (Button) findViewById(R.id.button6);
        SIButton = (Button) findViewById(R.id.button7);
        DOButton = (Button) findViewById(R.id.button8);


    }//bind widget


}//Main Class

//1.หาขอบเขต
//2.Explicit
//3.Bind widget