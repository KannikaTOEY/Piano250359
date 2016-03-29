package ice_pbru.kongsud.kannika.piano;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

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

        //4.Button Controller
        buttonController();



    }//Main Method

    private void buttonController() {
        DoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer DoMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song1);
                DoMediaPlayer.start();

                DoMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        REButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer REMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song2);
                REMediaPlayer.start();

                REMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        MIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer MIMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song3);
                MIMediaPlayer.start();

                MIMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        FAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer FAMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song4);
                FAMediaPlayer.start();

                FAMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });

            }
        });
        SOLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer SOLMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song5);
                SOLMediaPlayer.start();

                SOLMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        LAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer LAMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song6);
                LAMediaPlayer.start();

                LAMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        SIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer SIMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song7);
                SIMediaPlayer.start();

                SIMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        DOButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=ViyhNf07iko"));
                startActivity(intent);
            }
        });

    }//Button Controller

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