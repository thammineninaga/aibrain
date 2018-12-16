/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tyn.nlp.grammer;

import java.util.StringTokenizer;

/**
 *
 * @author yellanagaiah.t
 */
public class Statement {
    
    public void tokeniseStatement(String statement){
        StringTokenizer tokens = new StringTokenizer(statement, " ");
       
        while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }
       
    }
    
    public static void main(String args[]){
        String str = "How are you ?";
        Statement statement = new Statement();
        
        statement.tokeniseStatement(str);
    }
}
