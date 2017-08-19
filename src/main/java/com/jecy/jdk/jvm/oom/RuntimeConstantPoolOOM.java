package com.jecy.jdk.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huijun on 17/8/17.
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
