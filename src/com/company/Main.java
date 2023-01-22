package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LandLine l1=new LandLine("6394528249");
        LandLine l2=new LandLine("8881800241");
        l1.callnumber("8881800241");
        l2.recievecall("8881800241");
        System.out.println(l2.answercall());
    }
}
