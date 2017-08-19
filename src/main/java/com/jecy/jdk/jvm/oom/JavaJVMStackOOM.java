package com.jecy.jdk.jvm.oom;

/**
 * Created by huijun on 17/8/17.
 * 栈 outmemory
 * -Xss2M(这时候不妨设置大些)
 */
public class JavaJVMStackOOM {


    private void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaJVMStackOOM oom = new JavaJVMStackOOM();
        oom.stackLeakByThread();
    }
}
