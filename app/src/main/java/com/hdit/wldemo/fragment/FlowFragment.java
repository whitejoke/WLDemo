package com.hdit.wldemo.fragment;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.OrderDetail;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.OrderDetailPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.UIUtils;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/10.
 */

public class FlowFragment extends BaseFragment implements BaseView.orderDetail {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;
    @Bind(R.id.toolbar_center)
    ImageView toolbarCenter;

    //前台接待
    @Bind(R.id.proscenium_advice)
    TextView prosceniumAdvice;
    @Bind(R.id.proscenium_createTime)
    TextView prosceniumCreatTime;
    @Bind(R.id.proscenium_name)
    TextView prosceniumName;
    @Bind(R.id.proscenium_positionId)
    TextView prosceniumPositionId;
    @Bind(R.id.proscenium_sex)
    TextView prosceniumSex;
    @Bind(R.id.proscenium_comment)
    TextView prosceniumComent;


    private BasePresenter.orderDetailPresenter orderDetailPresenter;
    @Override
    protected View initView() {
        return View.inflate(UIUtils.getActivity(), R.layout.fragment_flow,null);
    }

    @Override
    protected void initData() {
        orderDetailPresenter=new OrderDetailPresenterImpl(this);
        Map<String,String> map=new HashMap<>();
        map.put("userId","7");
        map.put("order","desc");
        map.put("sort","create_time");
        orderDetailPresenter.requestNetWork(map);

        showView();
    }

    private void showView() {
        toolbarTitle.setText("医疗订单");
        toolbar.setBackgroundResource(R.color.white);


    }

    @Override
    public void setData(OrderDetail datas) {
        showProscenium(datas.getRows().get(0).getAdviceDetail());

    }

    private void showProscenium(OrderDetail.RowsBean.AdviceDetailBean adviceDetail) {
        prosceniumName.setText(adviceDetail.getReception().getEmpName());
        //prosceniumPositionId.setText((Integer) adviceDetail.getReception().getPositionId());
        //prosceniumSex.setText(adviceDetail.getReception().getSex());
    }

    @Override
    public void netWorkError() {
        Toast("网络异常");
    }
}
