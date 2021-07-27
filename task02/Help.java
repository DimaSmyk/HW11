package selfwork11.task02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Map<String, Integer> values = new HashMap<String, Integer>() {{
            put("0", 22);
            put("1", 6763);
            put("2", 32);
            put("3", 42);
            put("4", 33);
        }};
        int maxValue = Integer.MIN_VALUE;
        for (int value : values.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
            System.out.println(maxValue);
        }
    }
}

