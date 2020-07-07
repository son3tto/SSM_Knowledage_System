package com.tree.community.service;


import java.sql.*;
// ../../../resources/batchFile/jiaoben.py
public class Demo {

    public static void addUser() {
        String command = "python ../../../../../resources/static/batchFile/jiaoben.py";
//        String command = "target/classes/static/batchFile/update.sh";
        cmd(command);
//        String com2 = "";
//        cmd(com2);

    }


    public static boolean cmd(String command){
//        System.out.println(command);
        boolean flag = false;
        try{
            Runtime.getRuntime().exec("cmd.exe /C start "+command);
            flag = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}