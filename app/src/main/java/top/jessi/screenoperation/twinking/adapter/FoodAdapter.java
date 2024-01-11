package top.jessi.screenoperation.twinking.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import top.jessi.screenoperation.R;
import top.jessi.screenoperation.twinking.adapter.base.BaseRecyclerAdapter;
import top.jessi.screenoperation.twinking.adapter.base.CommonHolder;
import top.jessi.screenoperation.twinking.beans.Food;
import top.jessi.screenoperation.twinking.utils.ToastUtil;
import top.jessi.screenoperation.twinking.views.CircleImageView;


/**
 * Created by lcodecore on 2016/12/6.
 */

public class FoodAdapter extends BaseRecyclerAdapter<Food> {
    @Override
    public CommonHolder<Food> setViewHolder(ViewGroup parent) {
        return new CardHolder(parent.getContext(), parent);
    }

    class CardHolder extends CommonHolder<Food> {

        // @Bind(R.id.avatar)
        CircleImageView avatar;

        // @Bind(R.id.tv_food)
        TextView tv_food;

        // @Bind(R.id.tv_info)
        TextView tv_info;

        // @Bind(R.id.iv_food)
        ImageView iv_food;

        public CardHolder(Context context, ViewGroup root) {
            super(context, root, R.layout.item_food);
        }

        @Override
        public void bindData(Food food) {
            if (avatar != null) {
                avatar.setImageResource(food.avatar_id);
            }
            if (iv_food != null){
                iv_food.setImageResource(food.imageSrc);
                tv_food.setText(food.title);
            }
            if (tv_info != null){
                tv_info.setText(food.info);
            }

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ToastUtil.show(getContext(),"item clicked!");
                }
            });
        }
    }
}
