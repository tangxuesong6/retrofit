package com.txs.retrofit;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.gson.Gson;
import com.txs.retrofit.common.BaseActivity;
import com.txs.retrofit.common.MyEntity;
import com.txs.retrofit.http.RetrofitFactory;
import com.txs.retrofit.http.base.BaseObserver;
import com.txs.retrofit.http.bean.BaseEntity;
import com.txs.retrofit.utils.UploadUtil;
import java.util.ArrayList;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
public class MainActivity extends BaseActivity {
    private TextView mTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv = (TextView) findViewById(R.id.tv);
        mTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });

    }

    public void getData() {
        RetrofitFactory.getInstence().API()
                .test("1")
                .compose(this.<BaseEntity<MyEntity>>setThread())
                .subscribe(new BaseObserver<MyEntity>() {
                    @Override
                    protected void onSuccees(BaseEntity<MyEntity> t) throws Exception {
                        MyEntity m = t.getData();
                        Gson gson = new Gson();
                        String json = gson.toJson(m);
                        mTv.setText(json);

                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {

                    }
                });
    }

    public void upload() {
        String filepath = "图片本地路径";
        UploadUtil.uploadImage(filepath, new Observer() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Object o) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    public void uploads() {
        ArrayList<String> listFilePath = new ArrayList<>();
        listFilePath.add("图片1路径");
        listFilePath.add("图片2路径");
        UploadUtil.uploadImages(listFilePath, new Observer() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Object o) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
