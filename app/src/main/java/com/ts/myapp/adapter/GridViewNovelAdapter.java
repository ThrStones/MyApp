package com.ts.myapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ts.myapp.R;
import com.ts.myapp.bean.NovelInfo;

import java.util.LinkedList;


/**
 * Created by yl on 2017/8/30.
 */

public class GridViewNovelAdapter extends BaseAdapter {

    private LinkedList<NovelInfo> novelInfoList;
    private Context mContext;

    public GridViewNovelAdapter(LinkedList<NovelInfo> novelInfoList, Context mContext) {
        this.novelInfoList = novelInfoList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return novelInfoList.size();
    }

    @Override
    public Object getItem(int position) {
        return novelInfoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.gv_novel_list_item, viewGroup, false);
            holder = new ViewHolder();
            holder.iv_novel_img = convertView.findViewById(R.id.iv_novel_img);
            holder.tv_novel_name = convertView.findViewById(R.id.tv_novel_name);
            holder.tv_novel_id = convertView.findViewById(R.id.tv_novel_id);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.iv_novel_img.setImageResource(novelInfoList.get(position).getImgId());
        holder.tv_novel_name.setText(novelInfoList.get(position).getName());
        holder.tv_novel_id.setText(novelInfoList.get(position).getNovelId()+"");
        return convertView;
    }

    static class ViewHolder {
        ImageView iv_novel_img;
        TextView tv_novel_name;
        TextView tv_novel_id;
    }
}