package com.hdit.wldemo.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.activity.EvaluateActivity;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.OrderDetail;
import com.hdit.wldemo.utils.UIUtils;
import com.hdit.wldemo.widget.RatingBarView;

import java.text.SimpleDateFormat;
import java.util.List;

import butterknife.Bind;

/**
 * Created by joker on 2017/1/11.
 */

public class EvaluateAdapter extends BaseRecyclerViewAdapter<OrderDetail.RowsBean.EvaluDetailsBean> {
    private boolean isStatus;
    private List<OrderDetail.RowsBean.EvaluDetailsBean> evaluList;
    public EvaluateAdapter(List<OrderDetail.RowsBean.EvaluDetailsBean> datas) {
        super(datas);
        this.evaluList=datas;
    }

    @Override
    protected void onBind(RecyclerView.ViewHolder holder, int position, OrderDetail.RowsBean.EvaluDetailsBean data) {
        if (holder instanceof ViewHolder){
            ((ViewHolder) holder).setData(data);
        }else if (holder instanceof ViewHolderSecond){
            ((ViewHolderSecond) holder).setData(data);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        if (evaluList.get(viewType).getKqEvalu().getStatus()==0){
            isStatus=false;
        }else {
            isStatus=true;
        }
        if (isStatus){
            return new EvaluateAdapter.ViewHolderSecond(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_evaluate_done, null, false));
        }else {
            return new EvaluateAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_evaluate, null, false));
        }
    }
    class ViewHolder extends BaseRecyclerViewHolder{
        @Bind(R.id.tv_evaluate)
        TextView tvEvaluate;
        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull final OrderDetail.RowsBean.EvaluDetailsBean data) {
            super.setData(data);
            tvEvaluate.setText("去评价 "+data.getEmployee().getEmpName());
            tvEvaluate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent();
                    intent.setClass(UIUtils.getActivity(), EvaluateActivity.class);
                    intent.putExtra("evaluateId",data.getId());
                    UIUtils.getActivity().startActivityForResult(intent, Constant.REQUESTCODE);
                }
            });
        }
    }
    class ViewHolderSecond extends BaseRecyclerViewHolder{
        @Bind(R.id.evaluate_time)
        TextView evaluateTime;
        @Bind(R.id.evaluate_start)
        RatingBarView evaluateStart;
        @Bind(R.id.evaluate_content)
        TextView evaluateContent;
        public ViewHolderSecond(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull OrderDetail.RowsBean.EvaluDetailsBean data) {
            super.setData(data);
            evaluateTime.setText(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(data.getKqEvalu().getCreateTime()));
            evaluateStart.setClickable(false);
            evaluateStart.setStar(data.getKqEvalu().getStar(),false);
            evaluateContent.setText("对"+data.getEmployee().getEmpName()+"的评价:"+data.getKqEvalu().getContent());
        }
    }
}
