package view;
import models.Token;
import controller.CheckTokens;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import models.Lexema;
import models.Scope;

public class Main extends javax.swing.JFrame {
 
    CheckTokens checkToken = new CheckTokens();
    Lexema lexema = new Lexema("");
    int index = 0;
    ArrayList<Token> tokenList = new ArrayList<>();
    ArrayList<String> dec = new ArrayList<>();
    ArrayList<Scope> sc = new ArrayList<>();
    Stack<String> pilha = new Stack<>();
    
    int idScope = 0;
    
 
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite seu código aqui", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Analisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("TABELA DE SÍMBOLOS");

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo_javinho.png")));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder("Erros Léxicos"));
        jScrollPane3.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setBorder(javax.swing.BorderFactory.createTitledBorder("Erros Sintáticos"));
        jScrollPane4.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(34, 34, 34)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void analiseLexica() throws Exception{ 
    
        dec.clear();
        tokenList.clear();
        
        String code = (String) jTextArea1.getText(); 
        int line = 1;
        boolean comment = false;
        
        for(char check : code.toCharArray()){
            
            if(check != '\n' && check != ' ' && check != '\0' && check != '\t'){                
                lexema.setLexema(check); 
            }
            
            else{
                
                    if(!lexema.getLexema().equals("")){
                
                    if(lexema.getLexema().equals("/*")) comment = true;

                    else if (lexema.getLexema().equals("*/")) comment = false;

                    else if(checkToken.isReservedWord(lexema.getLexema())){
                        if(comment == false)
                            tokenList.add(new Token("PALAVRA RESERVADA", lexema.getLexema(), line));
                    }
                    else if(checkToken.isDel(lexema.getLexema())){
                        if(comment == false)
                            tokenList.add(new Token("DELIMITADOR", lexema.getLexema(), line));
                    }

                    else if(checkToken.isRelationalOperators(lexema.getLexema())){
                        if(comment == false)
                            tokenList.add(new Token("OPERADOR RELACIONAL", lexema.getLexema(), line));
                    }
                     else if(checkToken.isLogicalOperators(lexema.getLexema())){
                        if(comment == false)
                            tokenList.add(new Token("OPERADOR LÓGICO", lexema.getLexema(), line));
                    }

                    else if(checkToken.isMathematicalOperators(lexema.getLexema())){
                        if(comment == false)
                            tokenList.add(new Token("OPERADOR ARITIMÉTICO", lexema.getLexema(), line));
                    }
                    
                    else{

                        if(lexema.getLexema().matches("\\d+")){
                            if(comment == false)
                                tokenList.add(new Token("NUMERO", lexema.getLexema(), line));
                        }

                        else if(lexema.getLexema().matches("\\d+.\\d+")){
                            if(comment == false)
                                tokenList.add(new Token("NUMERO", lexema.getLexema(), line));
                        }

                        else if(lexema.getLexema().matches("\\d+\\w+")){ 
                            jTextArea2.setText("Linha: "+line+" - ERRO: o token "+lexema.getLexema()+" não é aceito pela linguagem.");
                            lexema = new Lexema("");
                            return;
                        }

                        else if(lexema.getLexema().matches("\\w+\\W+")){
                            jTextArea2.setText("Linha: "+ line + " - ERRO: o token " + lexema.getLexema() + " não é aceito pela linguagem.");
                            lexema = new Lexema("");
                            return;
                        }
                        
                        else if(lexema.getLexema().matches("\\W+\\w+")){
                            jTextArea2.setText("Linha: "+ line + " - ERRO: o token " + lexema.getLexema() + " não é aceito pela linguagem.");
                            lexema = new Lexema("");
                            return;
                        }
                        
                        else if(lexema.getLexema().matches("\\W+")){
                            jTextArea2.setText("Linha: "+ line + " - ERRO: o token " + lexema.getLexema() + " não é aceito pela linguagem.");
                            lexema = new Lexema("");
                            return;
                        }

                        else {
                            if(comment == false){
                                tokenList.add(new Token("ID", lexema.getLexema(), line));
                                //dec.add(lexema.getLexema());
                                //System.out.println(lexema.getLexema());
                            }
                        }    
                    }
                }
                
                if(check == '\n') line += 1;
                
                lexema = new Lexema("");
            }
        }
        if(comment) jTextArea2.setText("ERRO - Bloco de comentário aberto, mas não fechado.");
        populateTable(tokenList);
        
        sintaxAnalisys(tokenList);
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            analiseLexica();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextArea2.setText("");
       // jTextArea3.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
       
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
        DefaultTableModel tokensTable = toClearTable();
        
        
        jTextArea2.setText("");
        jTextArea1.setText("");
        jTextArea3.setText("");
        tokenList.clear();
        dec.clear();
        
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
       
    }//GEN-LAST:event_jTextArea1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables

    
    public void populateTable(ArrayList<Token> tokenList) {
        DefaultTableModel tokensTable = toClearTable();

        tokensTable.addColumn("TOKEN");
        tokensTable.addColumn("LEXEMA");
        tokensTable.addColumn("LINHA");

        for (Token token : tokenList) {
            tokensTable.addRow(new Object[]{"< " + token.toString() + " >", token.getValue(), token.getLine()});
        }
    }

    public DefaultTableModel toClearTable() {
        DefaultTableModel tokensTable = (DefaultTableModel) jTable1.getModel();

        tokensTable.setColumnCount(0);

        while (tokensTable.getRowCount() > 0) {
            tokensTable.removeRow(0);
        }
        return tokensTable;
    }

    public void nextToken() {
        index++;
    }

    public boolean verifyTipo(String token) {
        if (token.equals("int") || token.equals("float") || token.equals("double") || token.equals("char") || token.equals("boolean")) {
            nextToken();
            return true;
        }
        return false;
    }

    public boolean verifyID(Token token) throws Exception {
        if (token.getKey().equals("ID")) {
            if(dec.contains(token.getValue())){                
                throw new Exception("A Variável " +tokenList.get(index).getValue() + " já foi declarada anteriormente");              
            }
            else{
                dec.add(token.getValue());
                nextToken();
                return true;
            }
        }
        return false;
    }
    
    public boolean verifyOpMat(String token){
        if ((token.equals("*")) || (token.equals("+")) || (token.equals("-")) || (token.equals("/"))) {
            return true;
        }
        return false;
    }
  
    public boolean verifyID2(Token token) throws Exception {
       if(token.getKey().equals("NUMERO")){
           nextToken();
           if(verifyOpMat(tokenList.get(index).getValue()))
               verifyID2(tokenList.get(index));
           return true;
       }
       else if(dec.contains(token.getValue())){
           nextToken();
            if(verifyOpMat(tokenList.get(index).getValue()))
               verifyID2(tokenList.get(index));
           return true;
       }
       else if(verifyOpMat(tokenList.get(index).getValue())){
           nextToken();
           verifyID2(tokenList.get(index));
       }
       else{
           throw new Exception("A Variável " +tokenList.get(index).getValue() + " nao foi declarada anteriormente");
       }
       return false;
    }
    
   public boolean verifyAtr(Token token)throws Exception {
       
       if(token.getKey().equals("ID")){
           nextToken();
           if(verifyEqual(token.getValue())){
               nextToken();
               
            if(dec.contains(token.getValue())){
                System.out.println("Atribuição semanticamente valida");
                return true;
            }
            else{
                throw new Exception("A Variável " +tokenList.get(index).getValue() + "não foi declarada");
            }
       }           
   }
  return false; 
}
 
    
    public boolean verifyDel(String token) {
        if (token.equals(";")) {
            nextToken();
            return true;
        }
        return false;
    }

    public boolean verifyCondicional(String token) {
        if (token.equals("if")) {
            nextToken();
            return true;
        }
        return false;
    }

    public boolean verifyMain(ArrayList<Token> tokenList) {
        if (tokenList.get(0).getValue().equals("public")) {
            if (tokenList.get(1).getValue().equals("static")) {
                if (tokenList.get(2).getValue().equals("void")) {
                    if (tokenList.get(3).getValue().equals("main")) {
                        if (tokenList.get(4).getValue().equals("(")) {
                            if (tokenList.get(5).getValue().equals(")")) {
                                if (tokenList.get(6).getValue().equals("{")) {
                                    if (tokenList.get(tokenList.size() - 1).getValue().equals("}")) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean verifyOpr(String token) {
        if ((token.equals("==")) || (token.equals("<")) || (token.equals(">")) || (token.equals("!="))
        || (token.equals(">=")) || (token.equals("<="))) {
            return true;
        }
        return false;
    }
    
    public boolean verifyOprL(String token) {
        if ((token.equals("||") || token.equals("&&"))) {
            return true;
        }
        return false;
    }

    public boolean verifyIF(String token) {
        if ((token.equals("if"))) {
            nextToken();
            return true;
        }
        return false;
    }

    public boolean verifyEqual(String token) {
        if ((token.equals("="))) {
            nextToken();
            return true;
        }
        return false;
    }
    
    public boolean verifyNumAndId(String token) {
        if ((token.equals("NUMERO") || token.equals("ID"))) {
            nextToken();
            return true;
        }
        return false;
    }
    
    public boolean verifyExp(String token){
        if(token.equals("ID") || token.equals("NUMERO")){
            nextToken();
            if(verifyOpr(tokenList.get(index).getValue()) || verifyOprL(tokenList.get(index).getValue())){
                nextToken();
                verifyExp(tokenList.get(index).getKey());
            } 
            return true;
        } else {
            return false;
        }
    }
    
    public boolean verifyOpenPa(String token){
        if(token.equals("(")){
            nextToken();
            return true;
        }
        return false;
    }
    
    public boolean verifyClosePa(String token){
        if(token.equals(")")){
            nextToken();
            return true;
        }
        return false;
    }
    
    public boolean verifyOpenKey(String token){
        if(token.equals("{")){
            nextToken();
            return true;
        }
        return false;
    }
    
    public boolean verifyCloseKey(String token){
        if(token.equals("}")){
            nextToken();
            return true;
        }
        return false;
    }
    
    public void sintaxAnalisys(ArrayList<Token> tokenList) throws Exception {
        
        // Estrutura da funcao principal
        if (verifyMain(tokenList)) {
            System.out.println("Main ok! ");
            index = 7;
            
            while (index < tokenList.size()-1) {
   /* -------------------------------------------------------------------------------------------------------------------- */
                // Declaracao de variavel
                if (verifyTipo(tokenList.get(index).getValue())) {
                    if (verifyID(tokenList.get(index))) {
                        
                        if (verifyDel(tokenList.get(index).getValue())) {
                            
                            System.out.println("Declaracao sem igualdade OK");
                        } 
                       else if(verifyEqual(tokenList.get(index).getValue())){
                            if(verifyID2(tokenList.get(index))){
                                if(verifyDel(tokenList.get(index).getValue())){
                                    System.out.println("Declaracao com igualdade OK");
                                }
                                else {
                                    jTextArea3.setText("É esperado um ; na linha " + tokenList.get(index).getLine());
                                    return;
                                }
                            } else {
                               jTextArea3.setText("É esperado um ID ou um numero para a declaração na linha " + tokenList.get(index).getLine());
                               return; 
                            }
                        }else{
                            jTextArea3.setText("É esperado um ; na linha " + tokenList.get(index).getLine());
                            return;
                        }
          
                    } else {
                        jTextArea3.setText("É esperado um ID para a declaração na linha " + tokenList.get(index).getLine());
                        return;
                    }
                }  
                
  /* --------------------------------------------------------------------------------------------------------------------- */
                //Estrutura condicional
                else if (verifyIF(tokenList.get(index).getValue())) {
                    System.out.println("IF OK");
                    if (verifyOpenPa(tokenList.get(index).getValue())) {
                        if (verifyExp(tokenList.get(index).getKey())) {
                            if (verifyClosePa(tokenList.get(index).getValue())) {
                                System.out.println("Expressão dentro do if OK");
                                if(verifyOpenKey(tokenList.get(index).getValue())){
                                   if(verifyCloseKey(tokenList.get(index).getValue())){
                                       System.out.println("Chaves do if OK");
                                   } 
                                }
                            } else {
                                jTextArea3.setText("Parêntese aberto e não fechado");
                                return;
                            }
                        } else {
                            jTextArea3.setText("Erro de sintaxe na expressão lógica do if");
                            return;
                        }
                    } else {
                         jTextArea3.setText("Parêntese não aberto");
                         return;
                    }
                }
                else {  
                    nextToken();
                    jTextArea3.setText("Token inesperado");
                }
            }
        } else {
            jTextArea3.setText("Erro na sintaxe da funcao principal");
        }
    }
}