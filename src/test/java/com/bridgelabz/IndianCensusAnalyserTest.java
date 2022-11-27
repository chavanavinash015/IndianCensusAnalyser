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
    public static void afterDisplayMessege(){
        System.out.println("Test Pass/Run");
    }

    @Test
    void given_file_should_return_information() {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        censusAnalyser.readData();
    }
}
