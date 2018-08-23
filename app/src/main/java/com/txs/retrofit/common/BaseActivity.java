package com.txs.retrofit.common;


import android.app.Activity;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * @author yemao
 */

public class BaseActivity extends Activity {
    public <T> ObservableTransformer<T,T> setThread(){
       return new ObservableTransformer<T,T>() {
            @Override
            public ObservableSource<T>  apply(Observable<T>  upstream) {
                return upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

}
