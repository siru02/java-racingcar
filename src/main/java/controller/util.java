package controller;

import java.util.ArrayList;
import java.util.List;
public class util {
    public static List <String> splitByDelemeter(String input, String delemeter){
        List<String> result = new ArrayList<>();

        // 문자열을 구분자를 기준으로 분할하여 리스트에 추가
        String[] parts = input.split(delemeter);
        for (String part : parts) {
            result.add(part);
        }
        return result;
    }
}
