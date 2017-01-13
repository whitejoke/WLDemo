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
 * Created by joker on 2017/1/10.
 */

public class ProjectMedicalAdapter extends BaseRecyclerViewAdapter<OrderDetail.RowsBean.ProjectsBean> {
    private int position;
    public ProjectMedicalAdapter(List<OrderDetail.RowsBean.ProjectsBean> datas) {
        super(datas);
    }

    @Override
    protected void onBind(RecyclerView.ViewHolder holder, int position, OrderDetail.RowsBean.ProjectsBean data) {
        this.position=position;
        if (holder instanceof ViewHolder) {
            ((ProjectMedicalAdapter.ViewHolder) holder).setData(data);
        }
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        return new ProjectMedicalAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project_medical_adapter, null, false));
    }
    class ViewHolder extends BaseRecyclerViewHolder{
        @Bind(R.id.project_comment)
        TextView projectComment;
        @Bind(R.id.project_status)
        TextView projectStatus;
        private String[] status={"项目待确认","项目确认","完成"};
        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull OrderDetail.RowsBean.ProjectsBean data) {
            super.setData(data);
            projectComment.setText((position+1)+"."+data.getKqProject().getProName());
            projectStatus.setText(status[data.getProStatus()]);
        }
    }
}
