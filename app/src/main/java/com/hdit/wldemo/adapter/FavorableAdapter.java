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

public class FavorableAdapter extends BaseRecyclerViewAdapter<OrderDetail.RowsBean.PreferDetailsBean> {

    public FavorableAdapter(List<OrderDetail.RowsBean.PreferDetailsBean> datas) {
        super(datas);
    }

    @Override
    protected void onBind(RecyclerView.ViewHolder holder, int position, OrderDetail.RowsBean.PreferDetailsBean data) {
        if (holder instanceof ViewHolder){
            ((FavorableAdapter.ViewHolder) holder).setData(data);
        }
    }

    @Override
    protected BaseRecyclerViewHolder onCreate(ViewGroup parent, int viewType) {
        return new FavorableAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_counselor_favorable, null, false));
    }
    class ViewHolder extends BaseRecyclerViewHolder{
        //优惠
        @Bind(R.id.favorable_note)
        TextView favorableNote;
        @Bind(R.id.favorable_preferPrice)
        TextView favorablePreferPrice;
        @Bind(R.id.favorable_preferStatus)
        TextView favorablePreferStatus;

        private String[] status={"不通过","审核中","通过"};
        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void setData(@NonNull OrderDetail.RowsBean.PreferDetailsBean data) {
            super.setData(data);
            favorableNote.setText(data.getNote());
            favorablePreferPrice.setText(String.valueOf(data.getPreferPrice()));
            switch (data.getPreferStatus()){
                case -1:
                    favorablePreferStatus.setText("不通过");
                    break;
                case 0:
                    favorablePreferStatus.setText("审核中");
                    break;
                case 1:
                    favorablePreferStatus.setText("通过");
                    break;
            }
        }
    }
}
