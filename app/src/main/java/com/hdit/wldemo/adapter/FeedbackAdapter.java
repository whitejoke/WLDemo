package com.hdit.wldemo.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
 * Created by joker on 2017/1/10.
 */

public class FeedbackAdapter extends BaseRecyclerViewAdapter<OrderDetail.RowsBean.FeedbacksBean> {

    public FeedbackAdapter(List<OrderDetail.RowsBean.FeedbacksBean> datas) {
        super(datas);
    }

    @Override
    protected void onBind(RecyclerView.ViewHolder holder, int position, OrderDetail.RowsBean.FeedbacksBean data) {
        if (holder instanceof ViewHolder){
            ((FeedbackAdapter.ViewHolder) holder).setData(data);
        }
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        return new FeedbackAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_revisit, null, false));
    }
    class ViewHolder extends BaseRecyclerViewHolder{
        @Bind(R.id.feedback_type)
        TextView feedbackType;
        @Bind(R.id.feedback_time)
        TextView feedbackTime;
        @Bind(R.id.feedback_name)
        TextView feedbackName;
        @Bind(R.id.feedback_num)
        TextView feedbackNum;
        @Bind(R.id.feedback_sex)
        TextView feedbackSex;
        @Bind(R.id.feedback_content)
        TextView feedbackContent;

        @Bind(R.id.evaluate_first)
        LinearLayout evaluateFirst;
        @Bind(R.id.evaluate_second)
        LinearLayout evaluateSecond;
        @Bind(R.id.tv_evaluate)
        TextView tvEvaluate;
        @Bind(R.id.evaluate_time)
        TextView evaluateTime;
        @Bind(R.id.evaluate_start)
        RatingBarView evaluateStart;
        @Bind(R.id.evaluate_content)
        TextView evaluateContent;

        private String[] sexArray={"女","男"};
        private String[] typeArray={"咨询回访","订单回访"};
        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull final OrderDetail.RowsBean.FeedbacksBean data) {
            super.setData(data);
            feedbackType.setText(typeArray[data.getType()]);
            feedbackTime.setText(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(data.getCreateTime()));
            feedbackName.setText(data.getEmpInfo().getEmpName());
            feedbackNum.setText(data.getEmpInfo().getEmpNumber());
            feedbackSex.setText(sexArray[data.getEmpInfo().getSex()]);
            feedbackContent.setText(data.getContent());
            for (int i=0;i<mBase.size();i++){
                if (data.getEvaluId()==mBase.get(i).getId()){
                    if (mBase.get(i).getKqEvalu().getStatus()==0){
                        evaluateFirst.setVisibility(View.VISIBLE);
                        evaluateSecond.setVisibility(View.GONE);
                        tvEvaluate.setText("去评价 "+mBase.get(i).getEmployee().getEmpName());
                        tvEvaluate.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent();
                                intent.setClass(UIUtils.getActivity(), EvaluateActivity.class);
                                intent.putExtra("evaluateId",data.getEvaluId());
                                UIUtils.getActivity().startActivityForResult(intent, Constant.REQUESTCODE);
                            }
                        });
                    }else if (mBase.get(i).getKqEvalu().getStatus()==1){
                        evaluateFirst.setVisibility(View.GONE);
                        evaluateSecond.setVisibility(View.VISIBLE);
                        evaluateTime.setText(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(mBase.get(i).getKqEvalu().getCreateTime()));
                        evaluateStart.setClickable(false);
                        evaluateStart.setStar(mBase.get(i).getKqEvalu().getStar(),false);
                        evaluateContent.setText("对"+mBase.get(i).getEmployee().getEmpName()+"的评价:"+mBase.get(i).getKqEvalu().getContent());
                    }
                }
            }
        }
    }
}
