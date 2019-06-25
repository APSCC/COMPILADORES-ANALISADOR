package controller;

import utils.MappedTokens;
        
public class CheckTokens {
    
    MappedTokens mappedToken = new MappedTokens();
    
    public boolean isMathematicalOperators(String lexema){
        for(String mat : mappedToken.getMathematicalOperators()) {
            if(lexema.equals(mat)) return true;
        }
        return false;
    }

    public boolean isRelationalOperators(String lexema){
        for(String rel : mappedToken.getRelationalOperators()){
            if(lexema.equals(rel)) return true;
        }
        return false;
    }

    public boolean isLogicalOperators(String lexema){
        for(String log : mappedToken.getLogicalOperators()){
            if(lexema.equals(log)) return true;
        }
        return false;
    }


    public boolean isDel(String lexema){
        for(String del : mappedToken.getDelimitadores()){
            if(lexema.equals(del)) return true;
        }
        return false;
    }
    
    public boolean isReservedWord(String lexema){
        for(String reserved : mappedToken.getReserverdsWord()){
            if(lexema.equals(reserved)) return true;
        }
        return false;
    }
}
