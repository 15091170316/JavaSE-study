package com.wwt.listTest;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> city1 = new ArrayList<>();
        city1.add("南京市");
        city1.add("扬州市");
        city1.add("苏州市");
        city1.add("无锡市");
        city1.add("常州市");

        ArrayList<String> city2 = new ArrayList<>();
        city2.add("武汉市");
        city2.add("孝感市");
        city2.add("十堰市");
        city2.add("宜昌市");
        city2.add("鄂州市");

        ArrayList<String> city3 = new ArrayList<>();
        city3.add("石家庄市");
        city3.add("唐山市");
        city3.add("邢台市");
        city3.add("保定市");
        city3.add("张家口市");

        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        hm.put("江苏省", city1);
        hm.put("湖北省", city2);
        hm.put("河北省", city3);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            StringBuffer sb = new StringBuffer();
            sb.append(entry.getKey()).append(" = ");
            for (int i = 0; i < entry.getValue().size(); i++) {
                if(i != entry.getValue().size() - 1){
                    sb.append(entry.getValue().get(i) + ", ");
                } else{
                    sb.append(entry.getValue().get(i));
                }
            }
            System.out.println(sb);
        }
    }
}
