package com.hdit.wldemo.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.activity.ApplyDetailActivity;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.ApplyBean;
import com.hdit.wldemo.utils.UIUtils;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
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
        @Bind(R.id.apply_name)
        TextView applyName;
        @Bind(R.id.apply_creattime)
        TextView applyCreatTime;
        @Bind(R.id.apply_preferStatus)
        TextView applyPreferStatus;
        @Bind(R.id.apply_preferStatus_bottom)
        TextView getApplyPreferStatusBottom;
        @Bind(R.id.apply_order_recycle)
        RecyclerView applyOrderRecycle;

        private ApplyProjectAdapter projectAdapter;

        private String[] first={"未处理","已处理"};
        private String[] second={"申请中","通过申请","拒绝申请"};
        private String[] third={"去审批","查看详情"};
        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull final ApplyBean.RowsBean data) {
            super.setData(data);
            applyName.setText(data.getEmpInfo().getEmpName());
            applyCreatTime.setText(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(data.getApplyTime()));
            switch (data.getPreferStatus()){
                case 0:
                    applyPreferStatus.setText(first[0]);
                    getApplyPreferStatusBottom.setText(second[0]);
                    applyButton.setText(third[0]);
                    applyButton.setBackgroundResource(R.color.orange);
                    applyButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent();
                            intent.setClass(UIUtils.getActivity(), ApplyDetailActivity.class);
                            intent.putExtra("type",false);
                            intent.putExtra("id",data.getId());
                            UIUtils.getActivity().startActivityForResult(intent, Constant.REQUESTCODE);
                        }
                    });
                    break;
                case 1:
                    applyPreferStatus.setText(first[1]);
                    getApplyPreferStatusBottom.setText(second[1]);
                    applyButton.setText(third[1]);
                    applyButton.setBackgroundResource(R.color.blue);
                    applyButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent();
                            intent.setClass(UIUtils.getActivity(), ApplyDetailActivity.class);
                            intent.putExtra("type",true);
                            intent.putExtra("id",data.getId());
                            UIUtils.getActivity().startActivity(intent);

                        }
                    });
                    break;
                case -1:
                    applyPreferStatus.setText(first[1]);
                    getApplyPreferStatusBottom.setText(second[2]);
                    applyButton.setText(third[2]);
                    applyButton.setBackgroundResource(R.color.blue);
                    applyButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent();
                            intent.setClass(UIUtils.getActivity(), ApplyDetailActivity.class);
                            intent.putExtra("type",true);
                            intent.putExtra("id",data.getId());
                            UIUtils.getActivity().startActivity(intent);
                        }
                    });
                    break;
            }
            List<ApplyBean.RowsBean.ProjectDetailsBean> list=new LinkedList<>();
            projectAdapter=new ApplyProjectAdapter(list);
            projectAdapter.addAll(data.getProjectDetails());

            applyOrderRecycle.setLayoutManager(new LinearLayoutManager(UIUtils.getContext()));
            applyOrderRecycle.setAdapter(projectAdapter);
        }
    }
}
