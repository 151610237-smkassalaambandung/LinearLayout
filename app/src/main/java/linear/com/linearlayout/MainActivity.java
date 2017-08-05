package linear.com.linearlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linear = (Button) findViewById(R.id.Button1);
        linear.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), LinearLayoutSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button relative = (Button) findViewById(R.id.Button2);
        relative.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), RelativeLayoutSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button talay = (Button) findViewById(R.id.Button3);
        talay.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), LayouTabel.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button gambar = (Button) findViewById(R.id.Button4);
        gambar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), TampilanGambar.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button teks = (Button) findViewById(R.id.Button5);
        teks.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), AutocompleteSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button kotak_dialog = (Button) findViewById(R.id.Button6);
        kotak_dialog.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), KotakDialog.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button picker = (Button) findViewById(R.id.Button7);
        picker.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), picker.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button list = (Button) findViewById(R.id.Button8);
        list.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), seleksi.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button call = (Button) findViewById(R.id.Button9);
        call.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), CallActivty.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button check = (Button) findViewById(R.id.Button10);
        check.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), checkBox.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Radio = (Button) findViewById(R.id.Button11);
        Radio.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), RadioButton.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button play = (Button) findViewById(R.id.Button12);
        play.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), playingAudio.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button audio = (Button) findViewById(R.id.Button13);
        audio.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), audio.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button calcu = (Button) findViewById(R.id.Button14);
        calcu.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), CalculatorBeratBadan.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button web = (Button) findViewById(R.id.Button15);
        web.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), webview.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button sen = (Button) findViewById(R.id.Button16);
        sen.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), flashcamera.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
