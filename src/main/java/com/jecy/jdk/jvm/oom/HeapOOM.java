package com.jecy.jdk.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huijun on 17/8/17.
 */
public class HeapOOM {
    static  class  OOMObject {

    }
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
