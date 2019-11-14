package com;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 9:50
 */

import com.cc.ApiUtil;
import com.pojo.Ads;
import com.pojo.Data;

import java.util.List;

/**
 * @ClassName
 * @author songy
 * @Date
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Data data = ApiUtil.getAds();
        for (int i = 0; i < data.getData().size(); i++) {
            System.out.println(data.getData().get(i).getName());

        }
    }
}

