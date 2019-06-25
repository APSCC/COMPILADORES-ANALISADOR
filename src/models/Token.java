package models;

public class Token {
    private String key;
    private String value;
    private int line;
    
    public Token(String key, String value, int line){
        this.key = key;
        this.value = value;
        this.line = line;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return key+ " , " +value.toUpperCase();
    }
    
    public String getValue() {
        return value;
    }

    public void setLexema(String value) {
        this.value = value;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
    
    
}
