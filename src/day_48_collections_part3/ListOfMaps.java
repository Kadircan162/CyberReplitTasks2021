package day_48_collections_part3;

import java.util.*;

public class ListOfMaps {

    public static void main(String[] args) {

        List<Map<String,String>> employees = new ArrayList<>();

        Map<String,String> emp1 = new HashMap<>();
        emp1.put("Mike","Store Manager");
        emp1.put("John","Sales Person");
        emp1.put("Micheal","Driver");
        emp1.put("Denver","Transfer Manager");
        emp1.put("Salary", "80000");

        Map<String,String> emp2 = new HashMap<>();
        emp2.put("Ali","Store Manager");
        emp2.put("Tim","Sales Person");
        emp2.put("Micheal","Driver");
        emp2.put("Ozzy","Transfer Manager");
        emp2.put("Salary", "55000");

        Map<String,String> emp3 = new HashMap<>();
        emp3.put("Simon","Store Manager");
        emp3.put("Terry","Sales Person");
        emp3.put("Micheal","Driver");
        emp3.put("Ronaldo","Transfer Manager");
        emp3.put("Salary", "70000");


        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("employees.size() = " + employees.size());
        System.out.println("employees = " + employees.get(0));
        System.out.println("employees = " + employees.get(1));
        System.out.println("employees = " + employees.get(2));

        System.out.println("employees = " + employees);

        employees.forEach(System.out::println);
        String key = "Terry";
        System.out.println("Job of " + key + ": " + employees.get(2).get("Terry"));
        int totalSalary = 0;
        for (Map<String, String> map : employees){
            System.out.println("Micheal is the unique " + map.get("Micheal"));
            totalSalary += Integer.parseInt(map.get("Salary"));
        }

        System.out.println("totalSalary = " + totalSalary);


    }
}
