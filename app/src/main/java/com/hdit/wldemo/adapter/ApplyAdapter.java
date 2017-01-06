package com.hdit.wldemo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.ApplyBean;

import java.text.SimpleDateFormat;
import java.util.List;

import butterknife.Bind;

/**
 * Created by joker on 2016/12/29.
 */

public class ApplyAdapter extends BaseRecyclerViewAdapter<ApplyBean.RowsBean> {

    public ApplyAdapter(List<ApplyBean.RowsBean> datas) {
        super(datas);

    }

    @Override
    protected void onBind(RecyclerView.ViewHolder holder, int position, ApplyBean.RowsBean data) {
        if (holder instanceof ApplyAdapter.ViewHolder) {
            ((ApplyAdapter.ViewHolder) holder).setData(data);
        }
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        return new ApplyAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_apply,null));
    }
    class ViewHolder extends BaseRecyclerViewHolder{

        @Bind(R.id.apply_button)
        Button applyButton;
        @Bind(R.id.apply_creattime)
        TextView applyCreatTime;
        @Bind(R.id.apply_preferStatus)
        TextView applyPreferStatus;
        @Bind(R.id.apply_preferStatus_bottom)
        TextView getApplyPreferStatusBottom;
        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull ApplyBean.RowsBean data) {
            super.setData(data);
            applyCreatTime.setText(new SimpleDateFormat("yyyy-MM-dd").format(data.getApplyTime()));
        }
    }
}
