/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k, x;
        for (int i = 0; i < n; i++) {
            k = sc.nextInt();
            x = sc.nextInt();
            System.out.println(k - x);
        }
	}
}
