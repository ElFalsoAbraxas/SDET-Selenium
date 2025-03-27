package org.example.utilities;

public class Print {

    public static void TestCaseStart(String description) {
        System.out.println();
        System.out.println("########################################");
        System.out.println("##############" + description + "###############");
        System.out.println("########################################");
        System.out.println();
    }

    public static void TestCaseEnd(String description) {

        description = "";
        System.out.println();
        System.out.println("########################################");
        System.out.println("########################################");
        System.out.println("########################################");
        System.out.println();
    }
}