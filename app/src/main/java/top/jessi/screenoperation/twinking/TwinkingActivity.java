package top.jessi.screenoperation.twinking;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import top.jessi.screenoperation.R;


public class TwinkingActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public int setInflateId() {
        return R.layout.activity_twinking;
    }

    @Override
    public void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findViewById(R.id.bt_music).setOnClickListener(this);
        findViewById(R.id.bt_food).setOnClickListener(this);
        findViewById(R.id.bt_science).setOnClickListener(this);
        findViewById(R.id.bt_photo).setOnClickListener(this);
        findViewById(R.id.bt_story).setOnClickListener(this);
        findViewById(R.id.bt_enjoy).setOnClickListener(this);
        findViewById(R.id.bt_coordinate).setOnClickListener(this);
        findViewById(R.id.bt_test).setOnClickListener(this);
        findViewById(R.id.bt_normalView).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.bt_music) {
            startActivity(new Intent(TwinkingActivity.this, MusicActivity.class));
        } else if (id == R.id.bt_food) {
            startActivity(new Intent(TwinkingActivity.this, FoodActivity.class));
        } else if (id == R.id.bt_science) {
            startActivity(new Intent(TwinkingActivity.this, ScienceActivity.class));
        } else if (id == R.id.bt_photo) {
            startActivity(new Intent(TwinkingActivity.this, PhotoActivity.class));
        } else if (id == R.id.bt_story) {
            startActivity(new Intent(TwinkingActivity.this, StoryActivity.class));
        } else if (id == R.id.bt_enjoy) {
            startActivity(new Intent(TwinkingActivity.this, WebActivity.class));
        } else if (id == R.id.bt_coordinate) {
            startActivity(new Intent(TwinkingActivity.this, CoordinateActivity.class));
        } else if (id == R.id.bt_normalView) {
            startActivity(new Intent(TwinkingActivity.this, NormalViewActivity.class));
        } else if (id == R.id.bt_test) {
            startActivity(new Intent(TwinkingActivity.this, TestActivity.class));
        }
    }
}
