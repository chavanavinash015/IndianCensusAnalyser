package com.bridgelabz;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IndianCensusAnalyserTest {

    @BeforeAll
    public static void displayMessege(){
        System.out.println("Welcome to the Census Analyser ");
    }

    @AfterAll
    public void afterDisplayMessege(){
        System.out.println("Test Pass/Run");
    }

}
