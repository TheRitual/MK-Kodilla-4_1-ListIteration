package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> companies = new ArrayList();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        String text = HelpfulClass.forIterationConcatenate(companies);
        System.out.println(text);

        text = HelpfulClass.forIterationAppend(companies);
        System.out.println(text);

        text = HelpfulClass.forIterationStream(companies);
        System.out.println(text);
    }
}
