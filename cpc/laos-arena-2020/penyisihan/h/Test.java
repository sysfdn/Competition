import java.lang.*;
import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        int SUM_TEST_CASE = 100;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			int n = (int)(Math.random()*100);
   			System.out.println(n);
		    for(int i=0; i<n; i++){
		    	System.out.println((int)(Math.random()*9));
		    }
        }
	}
}
