package top.jessi.screenoperation.twinking.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import top.jessi.screenoperation.R;
import top.jessi.screenoperation.twinking.adapter.base.BaseRecyclerAdapter;
import top.jessi.screenoperation.twinking.adapter.base.CommonHolder;
import top.jessi.screenoperation.twinking.beans.Photo;
import top.jessi.screenoperation.twinking.utils.ToastUtil;


/**
 * Created by lcodecore on 2016/12/7.
 */

public class PhotoAdapter extends BaseRecyclerAdapter<Photo> {
    @Override
    public CommonHolder<Photo> setViewHolder(ViewGroup parent) {
        return new CardHolder(parent.getContext(), parent);
    }

    class CardHolder extends CommonHolder<Photo> {

        // @Bind(R.id.tv_info)
        TextView tv_info;

        // @Bind(R.id.iv_pic)
        ImageView iv_pic;

        public CardHolder(Context context, ViewGroup root) {
            super(context, root, R.layout.item_photo);
        }

        @Override
        public void bindData(Photo photo) {
            if (iv_pic != null){
                iv_pic.setImageResource(photo.imgSrc);
            }
            if (tv_info != null){
                tv_info.setText(photo.name);
            }

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ToastUtil.show(view.getContext(), "item clicked!");
                }
            });
        }
    }
}