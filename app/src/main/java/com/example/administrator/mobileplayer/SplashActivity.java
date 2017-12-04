package com.example.administrator.mobileplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;

import com.example.administrator.mobileplayer.activity.MainActivity;

public class SplashActivity extends Activity {
    private static final String TAG = SplashActivity.class.getSimpleName();//获取当前类的名称
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
              //两秒进入主界面
                intoActivity();
                Log.e(TAG, "当前线程的名称=="+Thread.currentThread().getName() );
            }
        },2000);
    }

    /**
     * 进入主界面
     */
    private void intoActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        //销毁当前界面
        finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "onTouchEvent: "+event.getAction());
        intoActivity();
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDestroy() {
        handler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }
}
