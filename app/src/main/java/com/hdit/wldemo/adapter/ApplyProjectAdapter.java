package com.hdit.wldemo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.ApplyBean;

import java.util.List;

import butterknife.Bind;

/**
 * Created by joker on 2017/1/12.
 */

public class ApplyProjectAdapter extends BaseRecyclerViewAdapter<ApplyBean.RowsBean.ProjectDetailsBean>{
    private int position;
    public ApplyProjectAdapter(List<ApplyBean.RowsBean.ProjectDetailsBean> datas) {
        super(datas);
    }

    @Override
    protected void onBind(RecyclerView.ViewHolder holder, int position, ApplyBean.RowsBean.ProjectDetailsBean data) {
        this.position=position;
        if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).setData(data);
        }
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        return new ApplyProjectAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project_adapter, null, false));
    }

    class ViewHolder extends BaseRecyclerViewHolder{
        @Bind(R.id.project_comment)
        TextView projectComment;
        @Bind(R.id.project_price)
        TextView projectPrice;

        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull ApplyBean.RowsBean.ProjectDetailsBean data) {
            super.setData(data);
            projectComment.setText((position+1)+"."+data.getKqProject().getProName());
            if (data.getProPrice()==0){
                projectPrice.setText(null);
            }else {
                projectPrice.setText(String.valueOf(data.getProPrice()));
            }

        }
    }
}
