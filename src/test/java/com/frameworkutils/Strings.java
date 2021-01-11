package com.frameworkutils;


import org.testng.annotations.Test;

public class Strings {

    String s1 = "";
    String rev1 = "";
    String s2 = "";
    String rev2 = "";

    public void setString1(String s1) {
        this.s1 = s1;
        System.out.println("The String1 is : " + s1);
    }

    public void setString2(String s2) {
        this.s2 = s2;
        System.out.println("The String2 is : " + s2);
    }

    public void disprev1() {
        StringBuffer v = new StringBuffer(s1);

        System.out.println("The reverse of String1 is : " + v.reverse());
    }


    public void disprev2() {

        for (int j = s2.length() - 1; j >= 0; j--)
            rev2 = rev2 + s2.charAt(j);


        System.out.println("The reverse of String2 is : " + rev2);
    }


    public void palindrome1() {

        if (s1.equals(rev1)) {
            System.out.println("Given Input String1 is Palindrome !!!");
        } else {
            System.out.println("Given Input String1 is not a Palindrome !!!");
        }
    }

    public void palindrome2() {

        if (s2.equals(rev2)) {
            System.out.println("Given Input String2 is Palindrome !!!");
        } else {
            System.out.println("Given Input String2 is not a Palindrome !!!");
        }
    }

    @Test
    public void results() {
        Strings ven = new Strings();
        System.out.println("*************Original Strings****************");
        ven.setString1("Venkatesh");
        ven.setString2("MalayalaM");
        System.out.println("************Reverse String***********************");
        ven.disprev1();
        ven.disprev2();
        System.out.println("****************Palindrome*******************");
        ven.palindrome1();
        ven.palindrome2();
    }


}



