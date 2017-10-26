package com.mi.homework;

/**
 * Created by IntelliJ IDEA.
 * User: 008839
 * Date: 2017/10/20
 * Time: 上午 09:44:21
 * To change this template use File | Settings | File Templates.
 */
public class Schedule {
    private String ext;    //設定此排程所處理的檔案格式 
    private String time;    //設定此排程所處理的時間
    private String interval;   //設定此排程執行的間隔

public Schedule(String ext, String time, String interval){
    this.ext=ext;
    this.time=time;
    this.interval=interval;
    }
public String getExt() {
        return ext;
}
public String getTime() {
        return time;
}
public String getInterval() {
        return interval;
}
}
