package cn.therookie.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "1");

        map.forEach((k, v) -> System.out.println("k = " + k));
    }
}
