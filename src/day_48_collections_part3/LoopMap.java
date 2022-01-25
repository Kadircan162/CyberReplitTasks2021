package day_48_collections_part3;

import day38Overriding.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoopMap {



    public static void main(String[] args) {

        Map<String, String> webDatas = new HashMap<>();

        webDatas.put("url" , "qa3.vytrack.com");
        webDatas.put("username", "user66");
        webDatas.put("password", "abc345");
        webDatas.put("browser", "chrome");
        webDatas.put("Truck driver", "Bob");
        webDatas.put("Store manager", "Bob");

        for (String sKeys : webDatas.keySet()) {
            System.out.println("Data keys" + sKeys);
        }
        for(String sValues : webDatas.values()){
            System.out.println("Data values" + sValues);
        }

        for (String sKey : webDatas.keySet()) {
            System.out.println("Key: " + sKey + " | Value: " + webDatas.get(sKey));//you can get values using key as a parameter,
                                                                                    // but cannot get keys using values as a parameter
        }

        webDatas.forEach((k,v) -> System.out.println(k + " | " + v));//forEch method (lambda expression)

        Map<Integer,Employee> employeeMap = new HashMap<>();
        Map<Integer,Employee> employeeMap2 = new HashMap<>(employeeMap);
        Map<String,String[]> emMapWithArr = new HashMap<>();
        Map<Integer, List<System>> emMapWithList = new HashMap<>();
        Map<Integer, List<System[]>> emMapWithList2 = new HashMap<>();
        Map<String,Map<Integer,Employee>> emMapWithMap = new HashMap<>();
        Map<String,Map<Integer,Integer>> emMapWithMap2 = new HashMap<>();



    }
}
