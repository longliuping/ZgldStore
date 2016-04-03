package com.zgld.mall.utils;

import android.widget.EditText;

/**
 * Created by Administrator on 2016/3/23.
 */
public class StringUtils {

    public static boolean isEmpty(EditText editText){
        if(editText==null || editText.getText()==null || editText.getText().toString().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static  boolean isEmpty(String text){
        if(text == null || text.isEmpty()){
            return true;
        }else {
            return  false;
        }
    }
}
