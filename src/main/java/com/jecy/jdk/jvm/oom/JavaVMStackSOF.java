package com.jecy.jdk.jvm.oom;

/**
 * Created by huijun on 17/8/1
 * VM args:-Xss128k
 */
public class JavaVMStackSOF {
    private int stackLength = 1;
    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack Length:"+ oom.stackLength);
            throw  e;
        }

    }
}
