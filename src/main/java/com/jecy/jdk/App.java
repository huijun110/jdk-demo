package com.jecy.jdk;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Map<String,Object> map = new HashMap<>();
        map.put("test",111);
        Object h = map.put("test",22);
        System.out.println(map.toString());
    }
}
