package utils;

import java.util.ArrayList;
import java.util.Arrays;

public class MappedTokens {

    private final String[] mo = {"+", "-", "*", "/"};
    private final ArrayList<String> mathematicalOperators = new ArrayList<>(Arrays.asList(mo));
    
    private final String[] ro = {"<", ">", "<=", ">=","=","!=", "=="};
    private final ArrayList<String> relationalOperators = new ArrayList<>(Arrays.asList(ro));
    
    
    private final String[] lo = {"&&", "||","!"};
    private final ArrayList<String> logicalOperators = new ArrayList<>(Arrays.asList(lo));
    
    private final String[] del = {";", ":","(",")",",","(",")","{","}","[","]"};
    private final ArrayList<String> delimitadores = new ArrayList<>(Arrays.asList(del));
    
    private final String[] words = {"int","void","float","char","return",
        "if","while", "class", "public","package","String","float","new","static","System.out.print","System.out.println","import"}; 
    private final ArrayList<String> reserverdsWord = 
            new ArrayList<>(Arrays.asList(words));

    
    public ArrayList<String> getMathematicalOperators() {
        return mathematicalOperators;
    }

    public ArrayList<String> getRelationalOperators() {
        return relationalOperators;
    }

    public ArrayList<String> getLogicalOperators() {
        return logicalOperators;
    }

    public ArrayList<String> getDelimitadores() {
        return delimitadores;
    }

    public ArrayList<String> getReserverdsWord() {
        return reserverdsWord;
    }
        
}
