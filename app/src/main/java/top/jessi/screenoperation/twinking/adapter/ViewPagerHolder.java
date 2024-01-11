package top.jessi.screenoperation.twinking.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import top.jessi.screenoperation.R;
import top.jessi.screenoperation.twinking.adapter.base.CommonHolder;
import top.jessi.screenoperation.twinking.beans.Card;

public class ViewPagerHolder extends CommonHolder<Void> {
    private LoopViewPagerAdapter viewPagerAdapter;
    private List<Card> cards = new ArrayList<>();

    // @Bind(R.id.viewPager)
    ViewPager viewPager;

    // @Bind(R.id.indicators)
    LinearLayout indicators;

    public ViewPagerHolder(Context context, ViewGroup root) {
        super(context, root, R.layout.layout_viewpager);

//        cards.add(new Card("二次元专题", "啊喂，别总想去四维空间啦",R.drawable.card_cover6));
//        cards.add(new Card("Music Player", "闻其名，余音绕梁",R.drawable.card_cover7));
//        cards.add(new Card("el", "剪纸人の唯美旅程",R.drawable.card_cover8));
//        cards.add(new Card("God of Light", "点亮世界之光",R.drawable.card_cover1));
//        cards.add(new Card("BlackLight", "做最纯粹的微博客户端",R.drawable.card_cover3));
    }

    @Override
    public void bindData(Void aVoid) {

    }

    @Override
    public void bindHeadData() {
        if(viewPager.getAdapter() == null){
            viewPagerAdapter = new LoopViewPagerAdapter(viewPager, indicators);
            viewPager.setAdapter(viewPagerAdapter);
            viewPager.addOnPageChangeListener(viewPagerAdapter);
            viewPagerAdapter.setList(cards);
        }/*else{
            viewPagerAdapter.setList(pics);
        }*/
    }
}