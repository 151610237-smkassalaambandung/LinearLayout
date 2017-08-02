package linear.com.linearlayout;

import java.io.IOException;
import android.support.v7.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

public class playingAudio extends AppCompatActivity {

    ImageButton mainkan;
    private Button btnPause;
    private Button btnStop;
    TextView keterangan;
    MediaPlayer mp;
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_audio);

        keterangan=(TextView)findViewById(R.id.ket);
        keterangan.setText("Silakan klik tombol play");

        mainkan=(ImageButton)findViewById(R.id.putarMusik);
        btnPause = (Button) findViewById(R.id.btnPAUSE);
        btnStop = (Button) findViewById(R.id.btnSTOP);

        mainkan.setOnClickListener(new OnClickListener(){
            public void onClick(View arg0){
                mainkan.setEnabled(false);
                btnPause.setEnabled(true);
                btnStop.setEnabled(true);
                keterangan.setText("Tombol play tidak aktif");
                go();
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });
    }
    public void go(){
        mp=MediaPlayer.create(playingAudio.this, R.raw.faded);
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mp.start();
        mp.setOnCompletionListener(new OnCompletionListener(){
            public void onCompletion(MediaPlayer arg0){
                mainkan.setEnabled(true);
                keterangan.setText("Silakan klik tombol play");
            }
        });
    }
    public void pause(){
        if(mp.isPlaying()){
            if(mp!=null){
                mp.pause();

            }
        } else {
            if(mp!=null){
                mp.start();

            }
        }
    }

    /** Dijalankan Oleh Tombol Stop */
    public void stop(){
        mp.stop();

        try{
            mp.prepare();
            mp.seekTo(0);
        }catch (Throwable t) {
            t.printStackTrace();
        }

    }
}
