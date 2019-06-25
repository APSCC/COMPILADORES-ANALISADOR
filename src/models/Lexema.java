package models;

public class Lexema {
    
    private String lexema;

    public Lexema(String lexema){
        this.lexema = lexema;
    }
    
    public String getLexema() {
        return lexema;
    }

    public void setLexema(char check) {
        this.lexema = lexema.concat(String.valueOf(check));
    }

}
