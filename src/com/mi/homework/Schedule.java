package com.mi.homework;

/**
 * Created by IntelliJ IDEA.
 * User: 008839
 * Date: 2017/10/20
 * Time: �W�� 09:44:21
 * To change this template use File | Settings | File Templates.
 */
public class Schedule {
    private String ext;    //�]�w���Ƶ{�ҳB�z���ɮ׮榡 
    private String time;    //�]�w���Ƶ{�ҳB�z���ɶ�
    private String interval;   //�]�w���Ƶ{���檺���j

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
