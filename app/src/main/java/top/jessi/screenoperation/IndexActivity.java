package top.jessi.screenoperation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import top.jessi.screenoperation.swipeback.SwipebackActivity;
import top.jessi.screenoperation.twinking.TwinkingActivity;
import top.jessi.swipeback.SwipeBackLayout;

public class IndexActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        Button twinking,swipeBack;
        twinking = findViewById(R.id.index_btn_twinking);
        swipeBack = findViewById(R.id.index_btn_swipeback);
        twinking.setOnClickListener(v -> {
            startActivity(new Intent(this, TwinkingActivity.class));
        });
        swipeBack.setOnClickListener(v -> {
            startActivity(new Intent(this, SwipebackActivity.class));
        });
    }
}