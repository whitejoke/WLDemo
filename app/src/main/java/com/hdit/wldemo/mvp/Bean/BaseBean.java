package com.hdit.wldemo.mvp.Bean;

import java.util.List;

/**
 * Created by joker on 2016/11/11.
 */

public class BaseBean<T> {

    private List<T> WLin;
    public List<T> getInfo() {
        return WLin;
    }
    public void setInfo(List<T> WLin) {
        this.WLin = WLin;
    }

}
