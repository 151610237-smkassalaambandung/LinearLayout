package linear.com.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView view = (WebView)findViewById(R.id.view);
        view.loadUrl("http://www.ngulikode.com/2017/05/membuat-senter-dengan-penggunaan-flash.html");
    }
}
