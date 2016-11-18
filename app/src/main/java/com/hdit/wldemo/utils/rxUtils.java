package com.hdit.wldemo.utils;

import rx.Subscription;

/**
 * by y on 2016/7/6.
 */
public class rxUtils {

    public static Subscription subscription;

    public static void unsubscribe() {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

}
