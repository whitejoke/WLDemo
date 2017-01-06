package com.hdit.wldemo.activity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.RegisterPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/17.
 */

public class MinePersonInfomation extends BaseNewActivity implements View.OnClickListener, BaseView.RegisterView {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    @Bind(R.id.member_truename)
    EditText memberTrueName;
    @Bind(R.id.member_age)
    EditText memberAge;
    @Bind(R.id.member_birthday)
    TextView memberBirthday;
    @Bind(R.id.member_occupa)
    EditText memberOccupa;
    @Bind(R.id.member_telephone)
    EditText memberTelephone;
    @Bind(R.id.member_idnum)
    EditText memberIdNum;
    @Bind(R.id.member_email)
    EditText memberEmail;
    @Bind(R.id.member_usercardnum)
    EditText memberUserCardNum;
    @Bind(R.id.member_income)
    EditText memberIncome;
    @Bind(R.id.btn_save)
    Button btnSave;


    private String member_truename;
    private String member_age;
    private String member_birthday;
    private String member_occupa;
    private String member_telephone;
    private String member_idnum;
    private String member_email;
    private String member_usercardnum;
    private String member_income;
    private int member_id;

    private Calendar calendar;
    private int year;
    private int month;
    private int day;
    private boolean error=false;

    private BasePresenter.RegisterPresenter registerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getBundle();
        init();
    }
    private void getBundle() {
        Bundle bundle = getIntent().getExtras();
        if (null != bundle && !bundle.isEmpty()) {
            member_id=bundle.getInt("memberId");
            member_truename = bundle.getString("memberTrueName");
            member_age = bundle.getString("memberAge");
            member_birthday = bundle.getString("memberBirthday");
            member_occupa = bundle.getString("memberOccupa");
            member_telephone = bundle.getString("memberTelephone");
            member_idnum = bundle.getString("memberIdnum");
            member_email = bundle.getString("memberEmail");
            member_usercardnum = bundle.getString("memberUserCard");
            member_income = bundle.getString("memberIncome");
        }
    }

    private void init() {
        toolbarTitle.setText("个人医疗资料");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        registerPresenter=new RegisterPresenterImpl(this);

        showView();
        memberBirthday.setOnClickListener(this);
        btnSave.setOnClickListener(this);
    }

    private void showView() {
        memberTrueName.setText(member_truename);
        memberAge.setText(member_age);
        memberBirthday.setText(member_birthday);
        memberOccupa.setText(member_occupa);
        memberTelephone.setText(member_telephone);
        memberIdNum.setText(member_idnum);
        memberEmail.setText(member_email);
        memberUserCardNum.setText(member_usercardnum);
        memberIncome.setText(member_income);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.mine_medical_data;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.member_birthday:
                // 获取日历对象
                calendar = Calendar.getInstance();
                // 获取当前对应的年、月、日的信息
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH) + 1;
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                memberBirthday.setText((monthOfYear+1) + "-" + dayOfMonth);
                            }
                        }, year, month, day);
                datePickerDialog.show();

                DatePicker dp = findDatePicker((ViewGroup) datePickerDialog.getWindow().getDecorView());
                Field f[] = dp.getClass().getDeclaredFields();
                //隐藏年份
                for (Field field : f) {
                    if (field.getName().equals("mYearPicker")
                            || field.getName().equals("mYearSpinner")) {
                        field.setAccessible(true);
                        Object yearPicker = new Object();
                        try {
                            yearPicker = field.get(dp);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        ((View) yearPicker).setVisibility(View.GONE);
                    }
                }
                break;
            case R.id.btn_save:
                Map<String,String> map=new HashMap<>();
                map.put("id", String.valueOf(member_id));
                map.put("custoInfo.age",memberAge.getText().toString());
                map.put("custoInfo.birthday",memberBirthday.getText().toString());
                map.put("custoInfo.occupa",memberOccupa.getText().toString());
                map.put("custoInfo.telphone",memberTelephone.getText().toString());
                map.put("custoInfo.idNum",memberIdNum.getText().toString());
                map.put("custoInfo.email",memberEmail.getText().toString());
                map.put("custoInfo.userCardNum",memberUserCardNum.getText().toString());
                map.put("custoInfo.income",memberIncome.getText().toString());
                registerPresenter.requestNeyWork(map);

        }
    }
    private DatePicker findDatePicker(ViewGroup group) {
        if (group != null) {
            for (int i = 0, j = group.getChildCount(); i < j; i++) {
                View child = group.getChildAt(i);
                if (child instanceof DatePicker) {
                    return (DatePicker) child;
                } else if (child instanceof ViewGroup) {
                    DatePicker result = findDatePicker((ViewGroup) child);
                    if (result != null)
                        return result;
                }
            }
        }
        return null;
    }

    @Override
    public void setData(PostNoBean datas) {
        if (error){
            Toast("出错啦");
        }else {
            Intent intent=new Intent();
            setResult(Constant.RESULTCODE,intent);
            finish();
        }

    }

    @Override
    public void netWorkError() {
        error=true;
        Toast("网络错误");
    }
}
