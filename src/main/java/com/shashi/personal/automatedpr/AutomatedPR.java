package com.shashi.personal.automatedpr;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutomatedPR {
    public void performanceIssues() {
        // Simulate a performance issue by creating a large list
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }

        // Simulate inefficient iteration over the list
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        // Simulate unnecessary string concatenation in a loop
        String result = "";
        for (int i = 0; i < 1000; i++) {
            result += "This is a test string.";
        }

        // Simulate a sleep operation that can block the main thread
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void securityIssues(String userInput) {
        // Simulate an SQL injection vulnerability
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "user", "password");
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM users WHERE username='" + userInput + "'";
            stmt.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Simulate storing passwords in plain text in a map
        Map<String, String> users = new HashMap<>();
        users.put("admin", "adminPassword");

        // Simulate unsafe deserialization
        try {
            byte[] serializedData = userInput.getBytes(); // Assuming this data comes from an untrusted source
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedData));
            Object deserializedObject = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bottleNeckProblem() {
        // Simulate a CPU-bound operation
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            double result = Math.pow(2, 10);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for CPU-bound operation: " + (endTime - startTime) + " ms");

        // Simulate a blocking I/O operation
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            data.add(i);
        }
        long ioStartTime = System.currentTimeMillis();
        data.stream().map(this::performBlockingOperation).forEach(System.out::println);
        long ioEndTime = System.currentTimeMillis();
        System.out.println("Time taken for I/O-bound operation: " + (ioEndTime - ioStartTime) + " ms");
    }

    private int performBlockingOperation(int input) {
        try {
            // Simulate a blocking I/O operation by sleeping
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return input;
    }


    public void staticCodeAnalysis() {
        // Simulate a resource leak by not closing a FileInputStream
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("example.txt");
            // Perform some operations with the input stream
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Simulate a resource leak by not closing a FileOutputStream using try-with-resources
        try {
            FileOutputStream outputStream = new FileOutputStream("output.txt");
            // Perform some operations with the output stream
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Simulate a null pointer exception
        List<String> items = new ArrayList<>();
        String item = items.get(0);

        // Simulate an unused variable
        int unusedVariable = 42;
    }

}
