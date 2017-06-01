package com.example.administrator.threadpool.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/6/1.
 */

public class CustomThreadPool {

    private static CustomThreadPool _instance = null;

    public static CustomThreadPool getInstance(){
        if(_instance == null){
            _instance = new CustomThreadPool();
        }
        return _instance;
    }

    private ExecutorService cachedThreadPool, fiexdThreadPool, ScheduleThreadPool, SingleThreadExecutor;

    public ExecutorService getCachedThreadPool(){
        if(cachedThreadPool == null){
            cachedThreadPool = Executors.newCachedThreadPool();;
        }
        return cachedThreadPool;
    }

    public ExecutorService getFiexdThreadPool(int nThreads){
        if(fiexdThreadPool == null){
            fiexdThreadPool = Executors.newFixedThreadPool(nThreads);
        }
        return fiexdThreadPool;
    }

    public ExecutorService getScheduleThreadPool(int nThreads){
        if(ScheduleThreadPool == null){
            ScheduleThreadPool = Executors.newScheduledThreadPool(nThreads);
        }
        return ScheduleThreadPool;
    }

    public ExecutorService getSingleThreadExecutor(){
        if(SingleThreadExecutor == null){
            SingleThreadExecutor = Executors.newSingleThreadExecutor();
        }
        return SingleThreadExecutor;
    }
}
