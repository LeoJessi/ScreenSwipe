package top.jessi.screenoperation.twinking.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import top.jessi.screenoperation.R;
import top.jessi.screenoperation.twinking.beans.Card;
import top.jessi.screenoperation.twinking.views.CircleImageView;

/**
 * Created by lcodecore on 2016/12/6.
 */

public class MusicAdapter extends BaseAdapter {

    private List<Card> cards = new ArrayList<>();

    @Override
    public int getCount() {
        return cards.size();
    }

    @Override
    public Card getItem(int position) {
        return cards.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(parent.getContext(), R.layout.item_music, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv_title.setText(cards.get(position).title);
        holder.tv_subTitle.setText(cards.get(position).info);
        holder.mImageView.setImageResource(cards.get(position).imageSrc);

        return convertView;
    }

    class ViewHolder {
        final CircleImageView mImageView;
        final TextView tv_title;
        final TextView tv_subTitle;

        ViewHolder(View view) {
            mImageView = (CircleImageView) view.findViewById(R.id.avatar);
            tv_title = (TextView) view.findViewById(R.id.tv_song);
            tv_subTitle = (TextView) view.findViewById(R.id.tv_singer);
        }
    }

    public void refreshCard(){
        cards.clear();
        cards.add(new Card("What Do You Mean?", "Justin Bieber", R.drawable.avatar1));
        cards.add(new Card("Secret Garden", "Song From A Secret Garden", R.drawable.avatar2));
        cards.add(new Card("Moves Like Jagger","Maroon 5",R.drawable.avatar3));
        cards.add(new Card("Work Hard, Play Hard","Wiz Khalifa",R.drawable.avatar4));
        cards.add(new Card("See You Again","Charlie Puth",R.drawable.avatar7));
        cards.add(new Card("Love The Way You Lie (Part Ii)","Rihanna",R.drawable.avatar5));
        cards.add(new Card("Call Me Maybe","Carly Rae Jepsen",R.drawable.avatar9));
        cards.add(new Card("Let It Go","Demi Lovato",R.drawable.avatar8));
        notifyDataSetChanged();
    }

    public void loadMoreCard(){
        cards.add(new Card("You Raise Me Up","Westlife",R.drawable.avatar6));
        cards.add(new Card("See You Again","Charlie Puth",R.drawable.avatar7));
        cards.add(new Card("Love Story","Taylor Swift",R.drawable.avatar0));
        cards.add(new Card("Let It Go","Demi Lovato",R.drawable.avatar8));
        cards.add(new Card("Secret Garden", "Song From A Secret Garden", R.drawable.avatar2));
        cards.add(new Card("Call Me Maybe","Carly Rae Jepsen",R.drawable.avatar9));
        notifyDataSetChanged();
    }

    public void addCard() {
        cards.add(new Card("What Do You Mean?", "Justin Bieber", R.drawable.avatar1));
        cards.add(new Card("Secret Garden", "Song From A Secret Garden", R.drawable.avatar2));
        cards.add(new Card("Moves Like Jagger","Maroon 5",R.drawable.avatar3));
        cards.add(new Card("Work Hard, Play Hard","Wiz Khalifa",R.drawable.avatar4));
        cards.add(new Card("Love The Way You Lie (Part Ii)","Rihanna",R.drawable.avatar5));
        cards.add(new Card("You Raise Me Up","Westlife",R.drawable.avatar6));
        cards.add(new Card("See You Again","Charlie Puth",R.drawable.avatar7));
        cards.add(new Card("Let It Go","Demi Lovato",R.drawable.avatar8));
        cards.add(new Card("Call Me Maybe","Carly Rae Jepsen",R.drawable.avatar9));
        //Love Story   Taylor Swift
    }
}