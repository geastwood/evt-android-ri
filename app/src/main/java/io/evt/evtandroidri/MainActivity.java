package io.evt.evtandroidri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hwangjr.rxbus.RxBus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        RxBus.get().register(this);

        setContentView(R.layout.activity_main);


        Button btn = findViewById(R.id.create_wallet_button);

        final ProgressWebView mWebView = new ProgressWebView(this);
        mWebView.loadUrl("file:///android_asset/dist/index.html");

        btn.setOnClickListener(v -> {
                mWebView.evaluateJavascript("javascript:createEVTWallet('fei');", s -> {
//                    TextView text = findViewById(R.id.create_wallet_output);
//                    text.setText(s);
                });
        });

    }
}
