package com.mi.homework;

/**
 * Created by IntelliJ IDEA.
 * User: 008839
 * Date: 2017/10/19
 * Time: �U�� 02:07:39
 * To change this template use File | Settings | File Templates.
 */
public class Config {
    private String ext;   //�]�w�ɮ׮榡 
    private String location;    // �]�w�n�ƥ��ɮת��ؿ� 
    private String subDirectory;  //�O�_�B�z�l�ؿ��A true : �B�z�l�ؿ��F false :  �� �B�z �l�ؿ� 
    private String unit;          //�]�w�ƥ����A file : �H��@�ɮ׬��B�z���F directory : �H�� �ӥؿ����B�z��� 
    private String remove;      //�B�z���O�_�R���ɮסA true : �R���F false : ���R�� 
    private String handler;      // zip : ���Y�F encode : �[�K 
    private String destination;    //�B�z��n�x�s�줰��a��A directory : �ؿ��F db : ��� �w 
    private String dir;            //�B�z�᪺�ؿ� 
    private String connectionString;    //�]�w��Ʈw�s���r��

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