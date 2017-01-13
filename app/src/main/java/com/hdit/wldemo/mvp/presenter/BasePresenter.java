package com.hdit.wldemo.mvp.presenter;

import android.content.Context;

import com.hdit.wldemo.mvp.Bean.HomeBean;

import java.util.Map;

/**
 * Created by joker on 2016/11/11.
 */

public interface BasePresenter {

    interface MainViewPresenter {
        void switchId(int id);
    }

    interface HomePresenter {
        void requestNetWork(Map<String,Integer> map);

        void onClick(HomeBean.ResultBean.DataBean.NewsBean info);
    }
    interface LoginPresenter{
        void requestNetWork(Context context,Map<String, String> map);
    }
    interface LoginForEmpPresenter{
        void requestNetWork(Map<String,String> map);
    }
    interface RegisterPresenter{
        void requestNeyWork(Map<String,String> map);
    }
    interface MemberPresenter{
        void requestNeyWork(int userId);
    }
    interface MemberForEmpPresenter{
        void requestNetWork(int empId);
    }
    interface updatePasswd{
        void requestNetWork(Map<String,String> map);
    }
    interface forgetPasswdPresenter{
        void requestNetWork(Map<String,String> map);
    }
    interface orderDetailPresenter{
        void requestNetWork(Map<String,String> map);
    }
    interface applyPresenter{
        void requestNetWork(int userId);
    }
    interface updateEmp{
        void requestNetWork(Map<String,String> map);
    }
    interface updateEvalu{
        void requestNetWork(Map<String,String> map);
    }
    interface reviewPreferen{
        void requestNetWork(Map<String,String> map);
    }
}
