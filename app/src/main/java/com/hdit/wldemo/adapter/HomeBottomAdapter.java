package com.hdit.wldemo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.utils.ImageLoaderUtils;
import com.hdit.wldemo.utils.LogUtils;
import com.hdit.wldemo.utils.UIUtils;

import java.util.List;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/17.
 */

public class HomeBottomAdapter extends BaseRecyclerViewAdapter<HomeBean.ResultBean.DataBean.NewsBean> {

    public HomeBottomAdapter(List<HomeBean.ResultBean.DataBean.NewsBean> datas) {
        super(datas);
    }

    @Override
    protected void onBind(RecyclerView.ViewHolder holder, int position, HomeBean.ResultBean.DataBean.NewsBean data) {
        if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).setData(data);
        }
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_adapter,parent,false));
    }
    class ViewHolder extends BaseRecyclerViewHolder{
        @Bind(R.id.home_image)
        ImageView homeImage;

        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull HomeBean.ResultBean.DataBean.NewsBean data) {
            super.setData(data);
            LogUtils.i("susu",data.getImageUrl());
            ImageLoaderUtils.display(UIUtils.getActivity(), homeImage, data.getImageUrl());
        }
    }
}
