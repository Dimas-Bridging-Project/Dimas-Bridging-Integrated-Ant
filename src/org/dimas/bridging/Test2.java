/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging;

/**
 *
 * @author yhawin
 */
public class Test2 {

    public static void main(String [] args){
        String str = "a,,001,001,APRIYANTO.KEK,KEDIRI,,KEDIRI,,,,a";
        System.out.println(str.split("\\,").length);

        String str2 = "a,,010,010,R.KEK,KEDIRI,,,,,,a";
        System.out.println(str2.split("\\,").length);
    }
}
