package com.jenkins.tests.pmdTest;


import java.util.List;

public class BadCodeExample2 {
    public void processList(List<String> list) {
        for (String item : list) {
            if (item.equals("error")) {
                System.out.println("Found error");
                break;
            } else {
                continue; // Unnecessary continue statement (PMD Violation)
            }
        }
    }
}

