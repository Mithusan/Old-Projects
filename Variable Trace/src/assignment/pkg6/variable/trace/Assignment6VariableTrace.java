/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6.variable.trace;

/**
 *
 * @author s201060267
 */
public class Assignment6VariableTrace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myNum = 11;//myNum is 11
        int mySum = 0;//mySum is 0

        while (myNum >= 0){// repeat the next block (between {}) while myNum is positive or 0
        myNum--;// decrease myNum by 1
        mySum += myNum * 5;// add 5 times myNum to mySum
        
        //Output
        System.out.println ("myNum: " + myNum + " *** mySum: " + mySum);
        }
    }
}
