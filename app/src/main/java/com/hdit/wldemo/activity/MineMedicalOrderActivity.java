package com.hdit.wldemo.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;
import com.hdit.wldemo.R;
import com.hdit.wldemo.adapter.CounselorAdapter;
import com.hdit.wldemo.adapter.EvaluateAdapter;
import com.hdit.wldemo.adapter.FavorableAdapter;
import com.hdit.wldemo.adapter.FeedbackAdapter;
import com.hdit.wldemo.adapter.MedicalDoctorAdapter;
import com.hdit.wldemo.adapter.ProjectAdapter;
import com.hdit.wldemo.adapter.ProjectMedicalAdapter;
import com.hdit.wldemo.adapter.ProsceniumAdapter;
import com.hdit.wldemo.mvp.Bean.OrderDetail;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.OrderDetailPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.DividerItemDecoration;
import com.hdit.wldemo.utils.UIUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/17.
 */

public class MineMedicalOrderActivity extends BaseNewActivity implements BaseView.orderDetail {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    @Bind(R.id.srf_layout)
    MaterialRefreshLayout refreshLayout;

    //前台接待
    @Bind(R.id.proscenium_createTime)//创建时间
            TextView prosceniumCreatTime;
    @Bind(R.id.proscenium_recycler)
    RecyclerView prosceniunRecycler;


    //咨询师
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;
    @Bind(R.id.counselor_recycler)
    RecyclerView counselorRecycler;
    @Bind(R.id.duli_recyclerView)
    RecyclerView duliRecycler;
    @Bind(R.id.favorable_recyclerView)
    RecyclerView favorableRecycler;
    @Bind(R.id.evaluate_recyclerView)
    RecyclerView evaluateRecycler;
    @Bind(R.id.counselor_project)
    TextView counselorProject;
    @Bind(R.id.counselor_project_price)
    TextView counselorProjectPrice;
    @Bind(R.id.counselor_comment)
    TextView counselorComment;
    @Bind(R.id.counselor_orderNum)
    TextView counselorOrderNum;

    //医疗订单
    @Bind(R.id.medical_doctor_recycle)
    RecyclerView medicalDoctorRecycle;
    @Bind(R.id.medical_recycler)
    RecyclerView medicalRecyclerView;
    @Bind(R.id.duli_medical_recyclerView)
    RecyclerView duliMedicalRecycle;
    @Bind(R.id.evaluate_medical_recyclerView)
    RecyclerView evaluateMedicalRecycler;
    @Bind(R.id.medical_project_name)
    TextView medicalProjectName;

    //回访
    @Bind(R.id.feedback_recycle)
    RecyclerView feedbackRecycle;

    @Bind(R.id.tv_none)
    TextView tvNone;

    private SharedPreferences sharedPreferences;
    private BasePresenter.orderDetailPresenter orderDetailPresenter;
    //前台
    private List<OrderDetail.RowsBean.AdviceDetailBean.EmpAdvicesBean> empAdvicesList=new ArrayList<>();
    private List<OrderDetail.RowsBean.AdviceDetailBean.EmpAdvicesBean> empCounselorList=new ArrayList<>();
    private List<OrderDetail.RowsBean.AdviceDetailBean.EmpAdvicesBean> empMedicalList=new ArrayList<>();
    private List<OrderDetail.RowsBean.EvaluDetailsBean> proEvaluList=new LinkedList<>();
    private ProsceniumAdapter prosceniumAdapter;
    //咨询
    private List<OrderDetail.RowsBean.ProjectsBean> projectsList=new LinkedList<>();
    private List<OrderDetail.RowsBean.ProjectsBean> duliprojectsList=new LinkedList<>();
    private List<OrderDetail.RowsBean.EvaluDetailsBean> couEvaluList=new LinkedList<>();
    private ProjectAdapter projectAdapter;
    private ProjectAdapter duliprojectAdapter;
    private CounselorAdapter counselorAdapter;
    private FavorableAdapter favorableAdapter;
    private EvaluateAdapter evaluateAdapter;
    //医疗
    private List<OrderDetail.RowsBean.ProjectsBean> projectsMedicalList=new LinkedList<>();
    private List<OrderDetail.RowsBean.ProjectsBean> duliprojectsMedicalList=new LinkedList<>();
    private List<OrderDetail.RowsBean.PreferDetailsBean> preferDetailsList=new LinkedList<>();
    private List<OrderDetail.RowsBean.EvaluDetailsBean> medicalEvaluList=new LinkedList<>();
    private MedicalDoctorAdapter medicalDoctorAdapter;
    private ProjectMedicalAdapter projectMedicalAdapter;
    private ProjectMedicalAdapter duliprojectMedicalAdapter;
    private EvaluateAdapter evaluateMedicalAdapter;
    //回访
    private List<OrderDetail.RowsBean.FeedbacksBean> feedbacksBeanList=new LinkedList<>();
    private FeedbackAdapter feedbackAdapter;


    private String telephone;
    private String name;
    private int sex;
    private String[] sexArray={"女","男"};
    private boolean isHave=false;
    private OrderDetail orderDetail=new OrderDetail();
    private Map<String, String> map=new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        toolbarTitle.setText("医疗订单");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        sharedPreferences= UIUtils.getActivity().getSharedPreferences("member",MODE_WORLD_READABLE);
        telephone=sharedPreferences.getString("phone",null);
        name=sharedPreferences.getString("name",null);
        sex=sharedPreferences.getInt("sex",0);


        //前台
        prosceniumAdapter=new ProsceniumAdapter(empAdvicesList,proEvaluList);
        prosceniumAdapter.addAll(empAdvicesList);
        prosceniunRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        prosceniunRecycler.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL_LIST));
        //咨询
        projectAdapter=new ProjectAdapter(projectsList);
        projectAdapter.addAll(projectsList);
        counselorAdapter=new CounselorAdapter(empCounselorList);
        counselorAdapter.addAll(empCounselorList);
        duliprojectAdapter=new ProjectAdapter(duliprojectsList);
        duliprojectAdapter.addAll(duliprojectsList);
        favorableAdapter=new FavorableAdapter(preferDetailsList);
        evaluateAdapter=new EvaluateAdapter(couEvaluList);
        evaluateAdapter.addAll(couEvaluList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        counselorRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        duliRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        favorableRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        evaluateRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        //医疗订单
        medicalDoctorAdapter=new MedicalDoctorAdapter(empMedicalList);
        medicalDoctorAdapter.addAll(empMedicalList);
        projectMedicalAdapter=new ProjectMedicalAdapter(projectsMedicalList);
        projectMedicalAdapter.addAll(projectsMedicalList);
        duliprojectMedicalAdapter=new ProjectMedicalAdapter(duliprojectsMedicalList);
        duliprojectMedicalAdapter.addAll(duliprojectsMedicalList);
        evaluateMedicalAdapter=new EvaluateAdapter(medicalEvaluList);
        evaluateMedicalAdapter.addAll(medicalEvaluList);
        medicalDoctorRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        medicalRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        duliMedicalRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        evaluateMedicalRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        //回访
        feedbackAdapter=new FeedbackAdapter(feedbacksBeanList);
        feedbackRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        feedbackRecycle.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL_LIST));
        //counselorRecycler.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL_LIST));
        //counselorRecycler.addItemDecoration(new RecycleViewDivider(getContext(),LinearLayoutManager.VERTICAL));

        orderDetailPresenter=new OrderDetailPresenterImpl(this);
        map=new HashMap<>();
        map.put("userId","7");
        map.put("order","desc");
        map.put("sort","create_time");
        orderDetailPresenter.requestNetWork(map);

        refreshLayout.setMaterialRefreshListener(new MaterialRefreshListener() {
            @Override
            public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
                orderDetailPresenter.requestNetWork(map);
                refreshLayout.finishRefresh();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.mine_medical_order;
    }

    @Override
    public void setData(OrderDetail datas) {
        orderDetail=datas;
        //LogUtils.i("susu",orderDetail.getRows().get(0).getKqOrder().getOrderNum());
        //LogUtils.i("susu",orderDetail.getRows().get(0).getKqOrder().getOrderNum());
        if (datas.getRows().get(0).getType()!=-1){
            tvNone.setVisibility(View.GONE);
            refreshLayout.setVisibility(View.VISIBLE);
            showProscenium(datas);
            showCounselor(datas);
            showMedicalOrder(datas);
            showFeedBack(datas);
        }else {
            tvNone.setVisibility(View.VISIBLE);
            refreshLayout.setVisibility(View.GONE);
        }
    }
    private void showFeedBack(OrderDetail datas) {
        feedbacksBeanList.clear();
        feedbackAdapter.addBase(datas.getRows().get(0).getEvaluDetails());
        feedbackAdapter.addAll(datas.getRows().get(0).getFeedbacks());
        feedbackRecycle.setAdapter(feedbackAdapter);
    }

    private void showMedicalOrder(OrderDetail datas) {
        empMedicalList.clear();
        //医生
        for (int i=0;i<datas.getRows().get(0).getAdviceDetail().getEmpAdvices().size();i++){
            if (datas.getRows().get(0).getAdviceDetail().getEmpAdvices().get(i).getEmpType()==3){
                empMedicalList.add(datas.getRows().get(0).getAdviceDetail().getEmpAdvices().get(i));
            }
        }
        medicalDoctorRecycle.setAdapter(medicalDoctorAdapter);
        //治疗详情
        projectsMedicalList.clear();
        for (int i=0;i<datas.getRows().get(0).getProjects().size();i++){
            if (datas.getRows().get(0).getProjects().get(i).getProPrice()==0){
                isHave=true;
                projectsMedicalList.add(datas.getRows().get(0).getProjects().get(i));
            }
        }
        if (isHave){
            medicalProjectName.setVisibility(View.VISIBLE);
            medicalProjectName.setText(datas.getRows().get(0).getPackageSend().getPackageName());
        }else {
            medicalProjectName.setVisibility(View.GONE);
        }
        medicalRecyclerView.setAdapter(projectMedicalAdapter);
        //独立项目
        duliprojectsMedicalList.clear();
        for (int i=0;i<datas.getRows().get(0).getProjects().size();i++){
            if (datas.getRows().get(0).getProjects().get(i).getProPrice()!=0){
                duliprojectsMedicalList.add(datas.getRows().get(0).getProjects().get(i));
            }
        }
        duliMedicalRecycle.setAdapter(duliprojectMedicalAdapter);
        //medicalTime.setText(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(datas.getRows().get(0).getAdviceDetail().getDoctor().getCreateTime()));
        //评论
        medicalEvaluList.clear();
        for (int i=0;i<empMedicalList.size();i++){
            for (int j=0;j<datas.getRows().get(0).getEvaluDetails().size();j++){
                if (datas.getRows().get(0).getEvaluDetails().get(j).getId()==Integer.valueOf(empMedicalList.get(i).getEvaluId())){
                    medicalEvaluList.add(datas.getRows().get(0).getEvaluDetails().get(j));
                    //LogUtils.i("susu", String.valueOf(couEvaluList.get(i).getId()));
                    break;
                }
            }
        }
        evaluateMedicalRecycler.setAdapter(evaluateMedicalAdapter);
    }

    private void showCounselor(OrderDetail datas) {
        //咨询订单
        projectsList.clear();
        for (int i=0;i<datas.getRows().get(0).getProjects().size();i++){
            if (datas.getRows().get(0).getProjects().get(i).getProPrice()==0){
                isHave=true;
                projectsList.add(datas.getRows().get(0).getProjects().get(i));
            }
        }
        if (isHave){
            counselorProject.setVisibility(View.VISIBLE);
            counselorProjectPrice.setVisibility(View.VISIBLE);
            counselorComment.setVisibility(View.VISIBLE);
            counselorProject.setText(datas.getRows().get(0).getPackageSend().getPackageName());
            counselorProjectPrice.setText(String.valueOf(datas.getRows().get(0).getPackageSend().getPackagePrice()));
            counselorComment.setText(datas.getRows().get(0).getPackageSend().getContent());
        }else {
            counselorProject.setVisibility(View.GONE);
            counselorProjectPrice.setVisibility(View.GONE);
            counselorComment.setVisibility(View.GONE);
        }
        recyclerView.setAdapter(projectAdapter);

        //咨询师
        empCounselorList.clear();
        for (int i=0;i<datas.getRows().get(0).getAdviceDetail().getEmpAdvices().size();i++){
            if (datas.getRows().get(0).getAdviceDetail().getEmpAdvices().get(i).getEmpType()==2){
                empCounselorList.add(datas.getRows().get(0).getAdviceDetail().getEmpAdvices().get(i));
            }
        }
        counselorRecycler.setAdapter(counselorAdapter);
        //独立项目
        duliprojectsList.clear();
        for (int i=0;i<datas.getRows().get(0).getProjects().size();i++){
            if (datas.getRows().get(0).getProjects().get(i).getProPrice()!=0){
                duliprojectsList.add(datas.getRows().get(0).getProjects().get(i));
            }
        }
        duliRecycler.setAdapter(duliprojectAdapter);
        //订单号
        counselorOrderNum.setText(datas.getRows().get(0).getKqOrder().getOrderNum());
        //优惠
        preferDetailsList.clear();
        favorableAdapter.addAll(datas.getRows().get(0).getPreferDetails());
        favorableRecycler.setAdapter(favorableAdapter);
        //评论
        couEvaluList.clear();
        for (int i=0;i<empCounselorList.size();i++){
            for (int j=0;j<datas.getRows().get(0).getEvaluDetails().size();j++){
                if (datas.getRows().get(0).getEvaluDetails().get(j).getId()==empCounselorList.get(i).getEvaluId()){
                    couEvaluList.add(datas.getRows().get(0).getEvaluDetails().get(j));
                    //LogUtils.i("susu", String.valueOf(couEvaluList.get(i).getId()));
                    break;
                }
            }
        }
        evaluateRecycler.setAdapter(evaluateAdapter);
    }

    private void showProscenium(OrderDetail datas) {
        empAdvicesList.clear();
        for (int i=0;i<datas.getRows().get(0).getAdviceDetail().getEmpAdvices().size();i++){
            if (datas.getRows().get(0).getAdviceDetail().getEmpAdvices().get(i).getEmpType()==1){
                empAdvicesList.add(datas.getRows().get(0).getAdviceDetail().getEmpAdvices().get(i));
            }
        }

        prosceniumAdapter.addBase(datas.getRows().get(0).getEvaluDetails());
        prosceniunRecycler.setAdapter(prosceniumAdapter);
        prosceniumCreatTime.setText(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(datas.getRows().get(0).getAdviceDetail().getAdvice().getEntryTime()));
    }

    @Override
    public void netWorkError() {
        Toast("网络异常");
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        onRefresh();
    }

    private void onRefresh() {
        refreshLayout.updateListener();
        orderDetailPresenter.requestNetWork(map);
    }
}
