package com.example.administrator.threadpool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.administrator.threadpool.threadpool.CustomThreadPool;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomThreadPool.getInstance().getCachedThreadPool().execute(new Thread2("CachedThreadPool"));
        CustomThreadPool.getInstance().getCachedThreadPool().execute(new Thread1("CachedThreadPool"));
        CustomThreadPool.getInstance().getFiexdThreadPool(1).execute(new Thread2("FiexdThreadPool"));
        CustomThreadPool.getInstance().getFiexdThreadPool(1).execute(new Thread1("FiexdThreadPool"));
        CustomThreadPool.getInstance().getScheduleThreadPool(1).execute(new Thread2("ScheduleThreadPool"));
        CustomThreadPool.getInstance().getScheduleThreadPool(1).execute(new Thread3("ScheduleThreadPool"));
        CustomThreadPool.getInstance().getSingleThreadExecutor().execute(new Thread2("SingleThreadExecutor"));
        CustomThreadPool.getInstance().getSingleThreadExecutor().execute(new Thread4("SingleThreadExecutor"));
    }

    private class Thread1 implements Runnable{

        private String tag;

        public Thread1(String tag){
            this.tag = tag;
        }

        @Override
        public void run() {
            Log.d(TAG, tag + "# Thread #" + 1);
        }
    }

    private class Thread2 implements Runnable{

        private String tag;

        public Thread2(String tag){
            this.tag = tag;
        }

        @Override
        public void run() {
            Log.d(TAG, tag + "# Thread #" + 2);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class Thread3 implements Runnable{

        private String tag;

        public Thread3(String tag){
            this.tag = tag;
        }

        @Override
        public void run() {
            Log.d(TAG, tag + "# Thread #" + 3);
        }
    }

    private class Thread4 implements Runnable{

        private String tag;

        public Thread4(String tag){
            this.tag = tag;
        }

        @Override
        public void run() {
            Log.d(TAG, tag + "# Thread #" + 4);
        }
    }
}
