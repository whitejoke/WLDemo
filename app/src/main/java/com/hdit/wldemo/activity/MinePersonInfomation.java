package com.hdit.wldemo.activity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.utils.ActivityUtils;

import java.lang.reflect.Field;
import java.util.Calendar;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/17.
 */

public class MinePersonInfomation extends BaseActivity implements View.OnClickListener {

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


    private String member_truename;
    private String member_age;
    private String member_birthday;
    private String member_occupa;
    private String member_telephone;
    private String member_idnum;
    private String member_email;
    private String member_usercardnum;
    private String member_income;

    private Calendar calendar;
    private int year;
    private int month;
    private int day;

    public static void startIntent(Member member) {
        Bundle bundle = new Bundle();
        bundle.putString("memberTrueName",
                member.getResult().getArchive().get(0).getCustoInfo().getUuid()==null?null:member.getResult().getArchive().get(0).getCustoInfo().getUuid());
        bundle.putString("memberAge",
                member.getResult().getArchive().get(0).getCustoInfo().getAge()==null?null:member.getResult().getArchive().get(0).getCustoInfo().getAge());
        bundle.putString("memberBirthday",
                member.getResult().getArchive().get(0).getCustoInfo().getBirthday()==null?null:member.getResult().getArchive().get(0).getCustoInfo().getBirthday());
        bundle.putString("memberOccupa",
                member.getResult().getArchive().get(0).getCustoInfo().getOccupa()==null?null:member.getResult().getArchive().get(0).getCustoInfo().getOccupa());
        bundle.putString("memberTelephone",
                member.getResult().getArchive().get(0).getCustoInfo().getTelphone()==null?null:member.getResult().getArchive().get(0).getCustoInfo().getTelphone());
        bundle.putString("memberIdnum",
                member.getResult().getArchive().get(0).getCustoInfo().getIdNum()==null?null:member.getResult().getArchive().get(0).getCustoInfo().getIdNum());
        bundle.putString("memberEmail",
                member.getResult().getArchive().get(0).getCustoInfo().getEmail()==null?null:member.getResult().getArchive().get(0).getCustoInfo().getEmail());
        bundle.putString("memberUserCard",
                member.getResult().getArchive().get(0).getCustoInfo().getUserCardNum()==null?null:member.getResult().getArchive().get(0).getCustoInfo().getUserCardNum());
        bundle.putString("memberIncome",
                member.getResult().getArchive().get(0).getCustoInfo().getIncome()==null?null:member.getResult().getArchive().get(0).getCustoInfo().getIncome());
        ActivityUtils.startActivity(MinePersonInfomation.class, bundle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getBundle();
        init();
    }
    private void getBundle() {
        Bundle bundle = getIntent().getExtras();
        if (null != bundle && !bundle.isEmpty()) {
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
        showView();
        memberBirthday.setOnClickListener(this);
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
}
