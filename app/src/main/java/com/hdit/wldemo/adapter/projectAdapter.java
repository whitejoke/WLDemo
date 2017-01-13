package com.hdit.wldemo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.OrderDetail;

import java.util.List;

import butterknife.Bind;

/**
 * Created by joker on 2017/1/6.
 */

public class ProjectAdapter extends BaseRecyclerViewAdapter<OrderDetail.RowsBean.ProjectsBean> {
    private int position;
    public ProjectAdapter(List<OrderDetail.RowsBean.ProjectsBean> datas) {
        super(datas);
    }

    @Override
    protected void onBind(RecyclerView.ViewHolder holder, int position, OrderDetail.RowsBean.ProjectsBean data) {
        this.position=position;
        if (holder instanceof ViewHolder) {
            ((ProjectAdapter.ViewHolder) holder).setData(data);
        }
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        return new ProjectAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project_adapter, null, false));
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
        protected void setData(@NonNull OrderDetail.RowsBean.ProjectsBean data) {
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
