package com.hdit.wldemo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.utils.GlobalInfo;
import com.hdit.wldemo.utils.ImageLoaderUtils;
import com.hdit.wldemo.utils.UIUtils;

import java.util.List;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/17.
 */

public class HomeBottomAdapter extends BaseRecyclerViewAdapter<HomeBean.ResultBean.DataBean.NewsBean> {

    private static final int TYPE_F = 1001;
    private static final int TYPE_S = 1002;
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
    public int getItemViewType(int position) {
        if (position%2==0){
            return TYPE_F;
        }
        return TYPE_S;
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        if (viewType==TYPE_F) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_adapter, null, false));
        }else {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_adapter_second, null, false));
        }
    }
    class ViewHolder extends BaseRecyclerViewHolder{
        @Bind(R.id.home_image)
        ImageView homeImage;
        @Bind(R.id.home_bottom_title)
        TextView homeBottomTitle;
        @Bind(R.id.home_bottom_content)
        TextView homeBottomContent;

        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull HomeBean.ResultBean.DataBean.NewsBean data) {
            super.setData(data);
            homeBottomTitle.setText(data.getTitle());
            homeBottomContent.setText(GlobalInfo.delHTMLTag(data.getContent()));
            ImageLoaderUtils.display(UIUtils.getActivity(), homeImage, data.getImageUrl());
        }
    }

}
