package com.hdit.wldemo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.OrderDetail;
import com.hdit.wldemo.utils.UIUtils;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by joker on 2017/1/19.
 */

public class PostOrderAdapter extends BaseRecyclerViewAdapter<OrderDetail.RowsBean> {

    public PostOrderAdapter(List<OrderDetail.RowsBean> datas) {
        super(datas);
    }

    @Override
    protected void onBind(RecyclerView.ViewHolder holder, int position, OrderDetail.RowsBean data) {
        if (holder instanceof ViewHolder){
            ((ViewHolder) holder).setData(data);
        }
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        return new PostOrderAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post_order_adapter, null, false));
    }
    class ViewHolder extends BaseRecyclerViewHolder{
        @Bind(R.id.post_orderId)
        TextView postOrderId;
        @Bind(R.id.post_orderTime)
        TextView postOrderTime;
        @Bind(R.id.post_orderRecycler)
        RecyclerView postOrderRecycle;
        @Bind(R.id.post_order_first)
        TextView postOrderFirst;
        @Bind(R.id.post_order_second)
        TextView postOrderSecond;
        @Bind(R.id.post_order_third)
        TextView postOrderThird;
        @Bind(R.id.post_order_forth)
        TextView postOrderForth;

        private ProjectAdapter projectAdapter;

        private String[] type={"未完成","完成"};

        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull OrderDetail.RowsBean data) {
            super.setData(data);
            postOrderId.setText(data.getKqOrder().getOrderNum());
            postOrderTime.setText(new SimpleDateFormat("yyyy-mm-dd").format(data.getKqOrder().getCreateTime()));

            List<OrderDetail.RowsBean.ProjectsBean> list=new LinkedList<>();
            projectAdapter=new ProjectAdapter(list);
            projectAdapter.addAll(data.getProjects());

            postOrderRecycle.setLayoutManager(new LinearLayoutManager(UIUtils.getContext()));
            postOrderRecycle.setAdapter(projectAdapter);
        }
    }
}
