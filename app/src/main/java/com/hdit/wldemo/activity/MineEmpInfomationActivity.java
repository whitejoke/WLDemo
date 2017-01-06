package com.hdit.wldemo.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hdit.wldemo.R;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.MemberForEmp;
import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.UpdateEmpPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.ActivityUtils;
import com.hdit.wldemo.utils.LogUtils;
import com.hdit.wldemo.utils.SelectPicPopupWindow;
import com.hdit.wldemo.widget.WheelView;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2017/1/4.
 */

public class MineEmpInfomationActivity extends BaseNewActivity implements BaseView.updateEmp, View.OnClickListener {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    @Bind(R.id.member_emp_name)
    TextView memberEmpName;
    @Bind(R.id.member_emp_sex)
    TextView memberEmpSex;
    @Bind(R.id.member_emp_jobnum)
    TextView memberEmpJobNum;
    @Bind(R.id.member_emp_room)
    EditText memberEmpRoom;
    @Bind(R.id.member_emp_entrytime)
    TextView memberEmpEntryTime;
    @Bind(R.id.btn_emp_save)
    Button btnEmpSave;
    @Bind(R.id.member_emp_head_change)
    TextView memberEmpHeadChange;
    @Bind(R.id.member_emp_head)
    ImageView memberEmpHead;

    private BasePresenter.updateEmp updateEmp;

    private String member_name;
    private int member_sex;
    private int member_id;
    private String member_jobnum;
    private String member_room;
    private long member_entrytime;
    private int mapSex=1;

    private int screenWidth;
    private int screenHeight;
    private String[] sex={"女","男"};
    private String[] PLANETS=new String[]{"男","女"};
    private SelectPicPopupWindow popWindow;

    private Calendar calendar;
    private int year;
    private int month;
    private int day;

    private List<String> paths=new ArrayList<String>();
    private String picPath=null;

    public static void startIntent(MemberForEmp memberForEmp) {
        Bundle bundle = new Bundle();
        bundle.putInt("memberId",
               memberForEmp.getResult().getEmpInfo().get(0).getId());
        bundle.putString("memberName",
                memberForEmp.getResult().getEmpInfo().get(0).getEmpName()==null?null:memberForEmp.getResult().getEmpInfo().get(0).getEmpName());
        bundle.putInt("memberSex",
                memberForEmp.getResult().getEmpInfo().get(0).getSex());
        bundle.putString("memberJobNum",
                memberForEmp.getResult().getEmpInfo().get(0).getEmpNumber()==null?null:memberForEmp.getResult().getEmpInfo().get(0).getEmpNumber());
        bundle.putString("memberRoom",
                memberForEmp.getResult().getEmpInfo().get(0).getRoom()==null?null:memberForEmp.getResult().getEmpInfo().get(0).getRoom());
        bundle.putLong("memberEntryTime",
                memberForEmp.getResult().getEmpInfo().get(0).getEntryTime());
        ActivityUtils.startActivityForResult(MineEmpInfomationActivity.class, bundle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getBundle();
        WindowManager wm= (WindowManager) getSystemService(WINDOW_SERVICE);
        screenWidth= wm.getDefaultDisplay().getWidth();
        screenHeight=wm.getDefaultDisplay().getHeight();
        init();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.mine_emp_item;
    }

    private void getBundle() {
        Bundle bundle = getIntent().getExtras();
        if (null != bundle && !bundle.isEmpty()) {
            member_name = bundle.getString("memberName");
            member_sex=bundle.getInt("memberSex");
            member_jobnum=bundle.getString("memberJobNum");
            member_room=bundle.getString("memberRoom");
            member_entrytime=bundle.getLong("memberEntryTime");
            member_id=bundle.getInt("memberId");
        }
    }
    private void init() {
        toolbarTitle.setText("个人信息");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        updateEmp=new UpdateEmpPresenterImpl(this);

        memberEmpHeadChange.setOnClickListener(this);
        memberEmpEntryTime.setOnClickListener(this);
        memberEmpSex.setOnClickListener(this);
        btnEmpSave.setOnClickListener(this);
        showView();
    }
    private void showView() {
        memberEmpName.setText(member_name);
        memberEmpSex.setText(sex[member_sex]);
        memberEmpJobNum.setText(member_jobnum);
        memberEmpRoom.setText(member_room);
        String time=new SimpleDateFormat("yyyy-MM-dd").format(member_entrytime);
        LogUtils.i("susu",time);
//        LogUtils.i("susu",time.substring(0,4)+"-"+time.substring(4,6)+"-"+time.substring(6,8));
//        memberEmpEntryTime.setText(time.substring(0,4)+"-"+time.substring(4,6)+"-"+time.substring(6,8));
        memberEmpEntryTime.setText(time);
    }

    @Override
    public void setData(PostNoBean datas) {
        Intent intent=new Intent();
        setResult(Constant.RESULTCODE,intent);
        finish();
    }

    @Override
    public void netWorkError() {
        Toast("网络异常");
    }
    private View.OnClickListener itemsOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            popWindow.dismiss();
            switch (v.getId()) {
                case R.id.btn_take_photo:
                    Intent it = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(it, 1);
                    break;
                case R.id.btn_pick_photo:
                    Intent local = new Intent();
                    local.setType("image/*");
                    local.setAction(Intent.ACTION_GET_CONTENT);
                    startActivityForResult(local, 2);
                    break;
            }
        }
    };
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
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.member_emp_head_change:
                popWindow = new SelectPicPopupWindow(this, itemsOnClick);
                popWindow.showAtLocation(memberEmpHeadChange, Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL, 0, 0);
                break;
            case R.id.member_emp_entrytime:
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
                                memberEmpEntryTime.setText(year+"-"+(monthOfYear+1) + "-" + dayOfMonth);
                            }
                        }, year, month, day);
                datePickerDialog.show();

                DatePicker dp = findDatePicker((ViewGroup) datePickerDialog.getWindow().getDecorView());
                Field f[] = dp.getClass().getDeclaredFields();
                //隐藏年份
//                for (Field field : f) {
//                    if (field.getName().equals("mYearPicker")
//                            || field.getName().equals("mYearSpinner")) {
//                        field.setAccessible(true);
//                        Object yearPicker = new Object();
//                        try {
//                            yearPicker = field.get(dp);
//                        } catch (IllegalAccessException e) {
//                            e.printStackTrace();
//                        }
//                        ((View) yearPicker).setVisibility(View.GONE);
//                    }
//                }
                break;
            case R.id.member_emp_sex:
                View outerView = LayoutInflater.from(getContext()).inflate(R.layout.wheel_view, null);
                WheelView wv = (WheelView) outerView.findViewById(R.id.wheel_view_wv);
                wv.setOffset(2);
                wv.setItems(Arrays.asList(PLANETS));
                wv.setSeletion(0);
                wv.setOnWheelViewListener(new WheelView.OnWheelViewListener() {
                    @Override
                    public void onSelected(int selectedIndex, String item) {
                        memberEmpSex.setText(item);
                    }
                });
                new AlertDialog.Builder(MineEmpInfomationActivity.this)
                        .setTitle("请选择性别")
                        .setView(outerView)
                        .setPositiveButton("OK", null)
                        .create().show();
                break;
            case R.id.btn_emp_save:
                if (TextUtils.equals(memberEmpSex.getText(),"男")){
                    mapSex=1;
                }else if (TextUtils.equals(memberEmpSex.getText(),"女")){
                    mapSex=0;
                }
                Map<String,String> map=new HashMap<>();
                map.put("id", String.valueOf(member_id));
                map.put("empName",member_name);
                map.put("sex", String.valueOf(mapSex));
                map.put("entryTime", String.valueOf(memberEmpEntryTime.getText())+" 00:00:00");
                map.put("room", String.valueOf(memberEmpRoom.getText()));
                updateEmp.requestNetWork(map);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            String srcPath="";
            switch (requestCode) {
                case 1:
                    Bundle extras = data.getExtras();
                    Bitmap b = (Bitmap) extras.get("data");
                    String name = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
                    String fileNmae = Environment.getExternalStorageDirectory().toString() + File.separator + name + ".jpg";
                    srcPath = fileNmae;
                    File myCaptureFile = new File(fileNmae);
                    try {
                        if (Environment.getExternalStorageState().equals(
                                Environment.MEDIA_MOUNTED)) {
                            if (!myCaptureFile.exists()) {
                                System.out.println(myCaptureFile.createNewFile()+ "----------");
                            }
                            BufferedOutputStream bos;
                            bos = new BufferedOutputStream(new FileOutputStream(myCaptureFile));
                            b.compress(Bitmap.CompressFormat.JPEG, 80, bos);
                            bos.flush();
                            bos.close();
                        } else {
                            Toast toast = Toast.makeText(this,"保存失败，SD卡无效", Toast.LENGTH_SHORT);
                            toast.setGravity(Gravity.CENTER, 0, 0);
                            toast.show();
                        }
                    }catch (FileNotFoundException e){
                        e.printStackTrace();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    Uri uri = data.getData();
                    String[] proj = { MediaStore.Images.Media.DATA };
                    Cursor cursor = managedQuery(uri, proj, null, null, null);
                    int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
                    cursor.moveToFirst();
                    srcPath = cursor.getString(column_index);
                    break;
                default:
                    break;
            }
            paths.add(0,srcPath);
            picPath=srcPath;
            BitmapFactory.Options options=new BitmapFactory.Options();
            options.inJustDecodeBounds=true;
            BitmapFactory.decodeFile(srcPath,options);
            int imgWidth=options.outWidth;
            int imgHeight=options.outHeight;
            int scale=1;
            int scalex=imgWidth/screenWidth;
            int scaley=imgHeight/screenHeight;
            scale=scalex>scaley?scalex:scaley;
            //按照缩放比显示图片
            options.inSampleSize=scale;
            //开始真正解析位图
            options.inJustDecodeBounds=false;

            Bitmap bitmap =  BitmapFactory.decodeFile(srcPath,options);
            memberEmpHead.setImageBitmap(bitmap);
            if(picPath!=null&&picPath.length()>0)
            {

            }
        }
    }
}
