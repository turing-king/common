package com.turingking.common.java.log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by king on 16-4-18.
 */
public class L {
    public interface Log{
        public void log (String tag,String log);
    }

    private static class LHolder{
        private static final L INSTANCE = new L();
    }

    private static List<Log> logs;

    private L (){
        logs = new ArrayList<>();
    };

    public void e(String tag,String msg){
        fors(tag,msg);
    }

    public void fors(String tag,String msg){
        int size = logs.size();
        for(int i = 0;i < size; i ++){
            logs.get(i).log(tag,msg);
        }
    }


}
