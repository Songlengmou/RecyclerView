package com.anningtex.recyclerview.utils;

import android.widget.EditText;

/**
 * @author Song
 * desc: EditText再输入过程中显示金额千分位格式
 */
public class StringUtils {
    public static String touzi_ed_values22 = "";

    public static String addComma(String str, EditText edtext) {
        touzi_ed_values22 = edtext.getText().toString().trim().replaceAll(",", "");
        return addComma(str);
    }

    public static String addComma(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        boolean neg = false;
        //处理负数
        if (str.startsWith("-")) {
            str = str.substring(1);
            neg = true;
        }
        String tail = null;
        //处理小数点
        if (str.indexOf('.') != -1) {
            tail = str.substring(str.indexOf('.'));
            str = str.substring(0, str.indexOf('.'));
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        for (int i = 3; i < sb.length(); i += 4) {
            sb.insert(i, ',');
        }
        sb.reverse();
        if (neg) {
            sb.insert(0, '-');
        }
        if (tail != null) {
            sb.append(tail);
        }
        return sb.toString();
    }

    public static String removeComma(String str) {
        return str.replaceAll(",", "");
    }

    public static String formatFloatNumber(double value) {
        if (value != 0.00) {
            java.text.DecimalFormat df = new java.text.DecimalFormat("########.00");
            return df.format(value);
        } else {
            return "0.00";
        }
    }

    public static String formatFloatNumber1(double value) {
        if (value != 0) {
            java.text.DecimalFormat df = new java.text.DecimalFormat("########");
            return df.format(value);
        } else {
            return "0";
        }
    }

    public static String formatFloatNumber2(double value) {
        if (value != 0.000) {
            java.text.DecimalFormat df = new java.text.DecimalFormat("########.000");
            return df.format(value);
        } else {
            return "0.000";
        }
    }

    /**
     * 判断  只要值为null 就显示 ""
     */
    public static String getStr(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }
}
