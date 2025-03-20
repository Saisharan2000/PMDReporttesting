package com.jenkins.tests.pmdTest;

public class BadCodeExample1 {
    private int unusedVar = 10; // Unused variable (PMD Violation)

    public void exampleMethod() {
        try {
            int x = 5 / 0; // Possible division by zero (PMD Violation)
        } catch (Exception e) {
            // Empty catch block (PMD Violation)
        }
    }
}


