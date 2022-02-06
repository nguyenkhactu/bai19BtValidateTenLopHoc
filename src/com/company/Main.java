package com.company;

public class Main {
    private static ClassNameExample classNameExample;
    public static final String[] validclassNameExample = new String[] {"C0318G"};
    public static final String[] invalidclassNameExample = new String[] { "M0318G, P0323A" };

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        for (String name : validclassNameExample) {
            boolean isvalid = classNameExample.validate(name);
            System.out.println("name is " + name +" is valid: "+ isvalid);
        }
        for (String name : invalidclassNameExample) {
            boolean isvalid = classNameExample.validate(name);
            System.out.println("name is " + name +" is valid: "+ isvalid);
        }
    }
}
