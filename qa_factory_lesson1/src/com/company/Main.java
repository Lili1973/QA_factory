package com.company;

public class Main {

    public static int f() {
        return 1000;
    }

    public static void main(String[] args) {


        // write your code here
        System.out.println("QA Factory");
        int x = 10;
        int a;
        a = 15 + 25;
        System.out.println(a + x);
        String s = "lesson";
        int i = 1;
        a = a + 1;
        System.out.println(s + " " + i + " " + a);
        String ss;
        ss = "hello class";
        int j = 255;
        System.out.println("j=" + j);
        double h = 10.52;
        h = h / 3;
        System.out.println(h);
        System.out.println(10 / 3);
        System.out.println(10 / 3.0);
        boolean o;
        o = true;
        o = false;
        o = true && false;
        System.out.println(o);
        o = true || false;
        System.out.println(o);
        System.out.println(h == 10);
        int[] mas = {1, 10, 20};
        System.out.println(mas[0] + " " + mas[1]);
        int p;
        p = mas[1];
        System.out.println(p);
        String[] smas = {"hello", "class"};
        System.out.println(smas[0] + " " + smas[1]);
        smas[0] = "ha";
        System.out.println(smas[0] + " " + smas[1]);
        System.out.println("-------------lesson2--------------");
        int y = 11;
        if (y < 10) {
            System.out.println("y<10");
        } else {
            System.out.println("y>=10");
        }
        System.out.println("-------------W H I L E--------------");
        int xy = 0;
        while (xy < 10) {
            xy += 5;
            xy -= 4;
            System.out.println("xy=" + xy);
        }
        System.out.println("finish");
        int xy1 = 0;
        while (xy1 < 10) {
            xy1 += 2;
            System.out.println("xy1=" + xy1 + "");
        }
        System.out.println("finish");
        System.out.println("-------------FIBONACHI-WHILE-------------");
        int f1 = 0;
        int f2 = 1;
        int f3;
        int f4 = 0;
        while (f4 < 20) {
            System.out.print(f1 + " ");
            f3 = f1;
            f1 = f2;
            f2 = f1 + f3;
            f4 = f4 + 1;
        }
        System.out.println("finish");
        System.out.println("-------------F O R--------------");
        for (int k = 0; k < 10; k = k + 5) {
            System.out.println("k=" + k);
        }
        System.out.println("finish");
        System.out.println("-------------FIBONACHI-FOR-------------");
        for (int p1 = 0, p2 = 1, p3, p4 = 0; p4 < 10; p4 = p4 + 1) {
            System.out.print(p1 + " ");
            p3 = p1;
            p1 = p2;
            p2 = p1 + p3;
        }
        System.out.println("");
        for (int k1 = 0; k1 < 1000; k1 = k1 + 1) {
            System.out.print("hello class" + " ");
        }
        System.out.println("");
        int[] m2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (i = 0; i < 12; i = i + 1) {
            if (m2[i] == 8) {
                break;
            }
            System.out.println("m2=" + m2[i]);
        }
        for (i = 0; i < 12; i++) {
            if (m2[i] == 6) {
                continue;
            }
            System.out.println("m2=" + m2[i]);
        }
        System.out.println("--------------------");

        for (i = 0; i < 1000; i++) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.print(" " + i);
        }


        int[] operand1 = {76, 90, 4, 87, 70, 57, 48, 70, 31, 69, 18, 40, 76};
        int[] operand2 = {76, 50, 36, 77, 87, 28, 98, 20, 20, 52, 86, 34, 34};
        int[] expectedResults = {152, 140, 40, 164, 157, 85, 146, 90, 51, 121, 104, 74, 110};
        int k = 0;
        while (k < 13) {
            if (expectedResults[k] == operand1[k] + operand2[k]) {
                System.out.println("true: TEST PASSED");
            } else {
                System.out.println("FALSE TEST FAILED");
            }
            k = k + 1;

        }

       /* //int[] notstrings = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        //int[] notstrings = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int[] notstrings = {1, 7, 1, 4, 1, 7, 9, 6, 13, 1, 7};
        //int target = 1;
        //int target = 6;
        int target = 7;
        int count=0;
        for (int j5 = 0; j5 < 10; j5=j5+1) {
            if (notstrings[j5]==target){
                count = count+1;
            }
        }
        System.out.println("Coun element in massive: "+target+": " +count );*/
        //////////////////function
        int fun = f();
        System.out.print(fun);
        /////////////////////////
        int[] notstrings = {1, 7, 1, 4, 1, 7, 9, 6, 13, 1, 7};
        //int target = 1;
        //int target = 6;
        int target = 7;
        System.out.println(fun(notstrings, target));

        int s3 = 2;
        System.out.print(f3(s3));
        /////////

        System.out.print(f4(2, "Hello"));
    }

    public static int fun(int[] ns, int t) {

        int count = 0;
        for (int j5 = 0; j5 < 10; j5 = j5 + 1) {
            if (ns[j5] == t) {
                count = count + 1;
            }
        }
        return count;
    }

    public static int f3(int p) {
        return p * p;
    }

    public static String f4(int p1, String strings) {
        String strings1 = "";
        int j = 0;
        while (j < p1) {
            strings1 = strings + strings1;
            j = j + 1;
        }
        return strings1;
    }

   /* public static boolean f5(int[] m6, int[] m7) {
        boolean bool = true;

        for (int j9 = 0; j9 < m6.length; j9++) {
            if (m6[j9] == m7[j9]) {
                return bool;
            } else {
                bool = false;
                return bool;
            }
        }
        return bool;
    }*/
}

