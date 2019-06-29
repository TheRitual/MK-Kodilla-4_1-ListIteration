package com.kodilla;

import java.util.Collection;
import java.util.stream.Collectors;

final public class HelpfulClass {
    public static String forIterationConcatenate (Collection colect) {
        String result = "";
        for(Object o:colect){
            result += o.toString() + ", ";
        }
        result = result.substring(0, result.length() - 2);
        return result;
    }

    public static String forIterationAppend (Collection colect) {
        StringBuilder result = new StringBuilder();
        for(Object o:colect){
            result.append(o.toString() + ", ");
        }
        return result.toString().substring(0, result.length() - 2);
    }

    public static String forIterationStream (Collection colect) {
        return colect.stream().map(n -> n.toString()).collect(Collectors.joining(", ")).toString();
    }
}
