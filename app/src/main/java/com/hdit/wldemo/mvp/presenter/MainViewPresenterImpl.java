package com.hdit.wldemo.mvp.presenter;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.view.BaseView;

/**
 * Created by joker on 2016/11/11.
 */

public class MainViewPresenterImpl extends BasePresenterImpl<BaseView.MainView> implements BasePresenter.MainViewPresenter {

    public MainViewPresenterImpl(BaseView.MainView view) {
        super(view);
    }

    @Override
    public void switchId(int id) {
        switch (id){
            case R.id.tab_home:
                view.switchHome();
                break;
            case R.id.tab_flow:
                view.switchFlow();
                break;
            case R.id.tab_mine:
                view.switchMine();
                break;
            case R.id.tab_business:
                view.switchBusiness();
        }
    }
}
