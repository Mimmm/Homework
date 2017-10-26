package com.mi.homework;

/**
 * Created by IntelliJ IDEA.
 * User: 008839
 * Date: 2017/10/19
 * Time: 下午 02:07:39
 * To change this template use File | Settings | File Templates.
 */
public class Config {
    private String ext;   //設定檔案格式 
    private String location;    // 設定要備份檔案的目錄 
    private String subDirectory;  //是否處理子目錄， true : 處理子目錄； false :  不 處理 子目錄 
    private String unit;          //設定備份單位， file : 以單一檔案為處理單位； directory : 以整 個目錄為處理單位 
    private String remove;      //處理完是否刪除檔案， true : 刪除； false : 不刪除 
    private String handler;      // zip : 壓縮； encode : 加密 
    private String destination;    //處理後要儲存到什麼地方， directory : 目錄； db : 資料 庫 
    private String dir;            //處理後的目錄 
    private String connectionString;    //設定資料庫連接字串

public Config(String ext,String location,String subDirectory,
String unit,String remove,String handler,String destination, String dir,String connectionString){
    this.ext = ext;    
    this.location = location;
    this.subDirectory = subDirectory;
    this.unit = unit;
    this.remove = remove;
    this.handler = handler;
    this.destination = destination;
    this.dir = dir;
    this.connectionString = connectionString;
}
public String getConnectionString() {
        return connectionString;
}
public String getDestination() {
        return destination;
}
public String getDir() {
        return dir;
}
public String getExt() {
        return ext;
}
public String getHandler() {
        return handler;
}
public String getLocation() {
        return location;
}
public String getRemove() {
        return remove;
}
public String getSubDirectory() {
        return subDirectory;
}
public String getUnit() {
        return unit;
}

}