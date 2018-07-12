/*
PROG: ride
ID: afrazha2
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;

class ride {
    public static void main (String [] args) throws IOException {
        // Use BufferedReader rather than RandomAccessFile; it's much faster
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        String s1 = f.readLine();
        String s2 = f.readLine();
        int n1 = 1; int n2 = 1;
        for (char ch : s1.toCharArray()){
            n1 *= Character.getNumericValue(ch)-9;
        }
        for (char ch : s2.toCharArray()){
            n2 *= Character.getNumericValue(ch)-9;
        }
        if (n1 % 47 == n2 % 47)
            out.println("GO");
        else
            out.println("STAY");
        out.close();
    }
}