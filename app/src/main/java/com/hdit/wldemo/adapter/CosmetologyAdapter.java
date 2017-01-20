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
 * Created by joker on 2016/11/24.
 */

public class CosmetologyAdapter extends BaseRecyclerViewAdapter<HomeBean.ResultBean.DataBean.NewsBean> {

    public CosmetologyAdapter(List<HomeBean.ResultBean.DataBean.NewsBean> datas) {
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
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cosmetology_adapter,null,false));
    }

    class ViewHolder extends BaseRecyclerViewHolder{
        @Bind(R.id.cosmetology_visit)
        TextView cosmetologyVisit;
        @Bind(R.id.cosmetology_img)
        ImageView cosmetologyImg;
        @Bind(R.id.cosmetology_content)
        TextView cosmetologyContent;


        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull HomeBean.ResultBean.DataBean.NewsBean data) {
            super.setData(data);
            cosmetologyContent.setText(GlobalInfo.delHTMLTag(data.getContent()));
            ImageLoaderUtils.display(UIUtils.getContext(),cosmetologyImg, data.getImageUrl());
        }
    }
}
