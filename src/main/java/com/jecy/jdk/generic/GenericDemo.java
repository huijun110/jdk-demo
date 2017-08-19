package com.jecy.jdk.generic;

/**
 * Created by huijun on 17/8/16.
 */
public class GenericDemo <T,U>{

    private T first;
    private U second;

    public static <T> T  getIntData(T a) {
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getIntData(1));
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
