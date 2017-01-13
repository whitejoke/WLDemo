package com.hdit.wldemo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.OrderDetail;

import java.text.SimpleDateFormat;
import java.util.List;

import butterknife.Bind;

/**
 * Created by joker on 2017/1/6.
 */

public class CounselorAdapter extends BaseRecyclerViewAdapter<OrderDetail.RowsBean.AdviceDetailBean.EmpAdvicesBean> {

    public CounselorAdapter(List<OrderDetail.RowsBean.AdviceDetailBean.EmpAdvicesBean> datas) {
        super(datas);
    }

    @Override
    protected void onBind(RecyclerView.ViewHolder holder, int position, OrderDetail.RowsBean.AdviceDetailBean.EmpAdvicesBean data) {
        if (holder instanceof ViewHolder) {
            ((CounselorAdapter.ViewHolder) holder).setData(data);
        }
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        return new CounselorAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_counselor_recycler, null, false));
    }
    class ViewHolder extends BaseRecyclerViewHolder{
        //咨询师
        @Bind(R.id.counselor_name)
        TextView counselorName;
        @Bind(R.id.counselor_num)
        TextView counselorNum;
        @Bind(R.id.counselor_sex)
        TextView counselorSex;
        @Bind(R.id.counselor_time)
        TextView counselorTime;

        private String[] sexArray={"女","男"};

        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull OrderDetail.RowsBean.AdviceDetailBean.EmpAdvicesBean data) {
            super.setData(data);
            counselorName.setText(data.getEmpInfo().getEmpName());
            counselorNum.setText(data.getEmpInfo().getEmpNumber());
            counselorSex.setText(sexArray[data.getEmpInfo().getSex()]);
            counselorTime.setText("服务时间"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(data.getEmpInfo().getEntryTime()));

        }
    }
}
