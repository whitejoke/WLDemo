package com.hdit.wldemo.adapter;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hdit.wldemo.activity.DetailActivity;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.utils.DiaLogUtils;
import com.hdit.wldemo.utils.ImageLoaderUtils;
import com.hdit.wldemo.utils.UIUtils;

import java.util.List;

/**
 * Created by joker on 2016/11/17.
 */

public class HomeHeadAdapter extends BasePagerAdapter<HomeBean.ResultBean.DataBean.AdvertBean> {


    public HomeHeadAdapter(List<HomeBean.ResultBean.DataBean.AdvertBean> datas) {
        super(datas);
    }

    @Override
    protected Object instantiate(ViewGroup container, final int position, final HomeBean.ResultBean.DataBean.AdvertBean data) {
        //container.removeAllViews();
        final ImageView imageView = new ImageView(UIUtils.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageLoaderUtils.display(UIUtils.getActivity(), imageView, data.getImageUrl());
        container.addView(imageView);
        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                DiaLogUtils.iamgeViewDialog(UIUtils.getActivity(), imageView, position);
                return true;
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                DetailActivity.startIntent(data.getId(),data.getContent());
                Intent intent=new Intent();
                intent.setClass(UIUtils.getActivity(), DetailActivity.class);
                intent.putExtra("content",data.getContent());
                intent.putExtra("id",data.getId());
                UIUtils.getActivity().startActivity(intent);
            }
        });
        return imageView;
    }
}
