package linear.com.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class checkBox extends AppCompatActivity implements OnCheckedChangeListener{

    CheckBox cb;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        cb=(CheckBox) findViewById(R.id.activity_check_box);
        cb.setOnCheckedChangeListener(this);
    }
    public void onCheckedChanged(CompoundButton buttonView, boolean isChacked){
        if (isChacked){
            cb.setText("checkBox ini : Dicentang");
        }else {
            cb.setText("checkbox ini : Tidak Dicentang");
        }
    }
}
