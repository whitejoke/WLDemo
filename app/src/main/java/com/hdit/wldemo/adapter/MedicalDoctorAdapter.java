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

public class MedicalDoctorAdapter extends BaseRecyclerViewAdapter<OrderDetail.RowsBean.AdviceDetailBean.EmpAdvicesBean> {

    public MedicalDoctorAdapter(List<OrderDetail.RowsBean.AdviceDetailBean.EmpAdvicesBean> datas) {
        super(datas);
    }

    @Override
    protected void onBind(RecyclerView.ViewHolder holder, int position, OrderDetail.RowsBean.AdviceDetailBean.EmpAdvicesBean data) {
        if (holder instanceof MedicalDoctorAdapter.ViewHolder) {
            ((MedicalDoctorAdapter.ViewHolder) holder).setData(data);
        }
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        return new MedicalDoctorAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_medical_doctor, null, false));
    }
    class ViewHolder extends BaseRecyclerViewHolder{
        //医疗订单
        @Bind(R.id.medical_name)
        TextView medicalName;
        @Bind(R.id.medical_num)
        TextView medicalNum;
        @Bind(R.id.medical_sex)
        TextView medicalSex;

        private String[] sexArray={"女","男"};

        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull OrderDetail.RowsBean.AdviceDetailBean.EmpAdvicesBean data) {
            super.setData(data);
            medicalName.setText(data.getEmpInfo().getEmpName());
            medicalNum.setText(data.getEmpInfo().getEmpNumber());
            medicalSex.setText(sexArray[data.getEmpInfo().getSex()]);
        }
    }
}
