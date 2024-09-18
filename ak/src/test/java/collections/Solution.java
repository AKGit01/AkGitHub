package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private final static class Employee {
        public final String name;
        public final String salary;
        public final String department;
        public final String email;
        public final String account_number;

        public Employee(String name, String salary, String department, String email, String account_number) {
            this.name = name;
            this.salary = salary;
            this.department = department;
            this.email = email;
            this.account_number = account_number;
        }
    }

    public static List<HashMap<String, String>> createEmployeeData() {
        HashMap<String, String> emp1 = new HashMap<>();
        emp1.put("name", "john");
        emp1.put("salary", "54000");
        emp1.put("department", "consulting");
        emp1.put("email", "john@test.com");
        emp1.put("account_number", "12321333");

        HashMap<String, String> emp2 = new HashMap<>();
        emp2.put("name", "Mohan");
        emp2.put("salary", "54000");
        emp2.put("department", "Engineering");
        emp2.put("email", "mohan@test.com");
        emp2.put("account_number", "3526213623");

        HashMap<String, String> emp3 = new HashMap<>();
        emp3.put("name", "Raj");
        emp3.put("salary", "54000");
        emp3.put("department", "Engineering");
        emp3.put("email", "raj@test.com");
        emp3.put("account_number", "352635623");

        HashMap<String, String> emp4 = new HashMap<>();
        emp4.put("name", "daniel");
        emp4.put("salary", "10000");
        emp4.put("department", "consulting");
        emp4.put("email", "daniel@test.com");
        emp4.put("account_number", "352635we623");

        return Arrays.asList(emp1, emp2, emp3, emp4);
    }

    public static List<HashMap<String, String>> createEmployeeData1() {
        HashMap<String, String> emp1 = new HashMap<>();
        emp1.put("name", "ram");
        emp1.put("salary", "80000000");
        emp1.put("department", "consulting");
        emp1.put("email", "ram@test.com");

        HashMap<String, String> emp2 = new HashMap<>();
        emp2.put("name", "rohit");
        emp2.put("salary", "800000");
        emp2.put("department", "consulting");
        emp2.put("email", "rohit@test.com");

        return Arrays.asList(emp1, emp2);
    }

    private final static List<HashMap<String, String>> EMPLOYEES = createEmployeeData();
    private final static List<HashMap<String, String>> EMPLOYEES1 = createEmployeeData1();

    private final static Map<String, List<HashMap<String, String>>> testCases = new HashMap<>();

    static {
        testCases.put("example", EMPLOYEES);
    }

    private final static Map<String, String> emailMapping = new HashMap<>();

    static {
        emailMapping.put("example", "john@test.com");
    }

    public static String solution(String input) {
        List<HashMap<String, String>> testList = testCases.getOrDefault(input, new ArrayList<>());
        String email = emailMapping.getOrDefault(input, "");
        String result = new EmployeeRepo().getSalaryBasedOnEmail(testList, email);
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("example"));
    }

    public static class EmployeeRepo {
        public String getSalaryBasedOnEmail(List<HashMap<String, String>> employees, String email) {
            // Iterate through the list of employees to find the matching email
            for (HashMap<String, String> employee : employees) {
                if (employee.get("email").equals(email)) {
                    // Return the salary of the employee with the matching email
                    return employee.get("salary");
                }
            }
            // If no employee is found with the given email, return a message
            return "Email not found";
        }
    }
}
