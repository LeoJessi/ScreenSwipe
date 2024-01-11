package top.jessi.screenoperation.twinking;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import top.jessi.screenoperation.R;
import top.jessi.screenoperation.databinding.ActivityMusicBinding;
import top.jessi.screenoperation.twinking.adapter.MusicAdapter;
import top.jessi.screenoperation.twinking.utils.ToastUtil;
import top.jessi.twinking.RefreshListenerAdapter;
import top.jessi.twinking.TwinklingRefreshLayout;
import top.jessi.twinking.header.progresslayout.ProgressLayout;

//TODO 有FixedHeader的界面fling有问题
public class MusicActivity extends AppCompatActivity {

    private MusicAdapter adapter;
    private ActivityMusicBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMusicBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setNavigationIcon(R.drawable.back);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        setupListView((ListView) findViewById(R.id.listView));
    }

    private void setupListView(ListView listView) {
        ProgressLayout headerView = new ProgressLayout(this);
        mBinding.refresh.setHeaderView(headerView);
        View exHeader = View.inflate(this, R.layout.header_music, null);
        mBinding.refresh.addFixedExHeader(exHeader);
        mBinding.refresh.setOverScrollRefreshShow(false);
//        refreshLayout.setFloatRefresh(true);
        adapter = new MusicAdapter();
        listView.setAdapter(adapter);
        adapter.refreshCard();

        exHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.show(MusicActivity.this, "fixed header clicked!");
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ToastUtil.show(MusicActivity.this, "item clicked!");
            }
        });

        mBinding.refresh.setOnRefreshListener(new RefreshListenerAdapter() {
            @Override
            public void onRefresh(final TwinklingRefreshLayout refreshLayout) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        adapter.refreshCard();
                        refreshLayout.finishRefreshing();
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore(final TwinklingRefreshLayout refreshLayout) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        adapter.loadMoreCard();
                        refreshLayout.finishLoadmore();
                    }
                }, 2000);
            }
        });
    }
}
