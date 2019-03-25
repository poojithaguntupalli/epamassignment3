package rodcutting;
import java.util.*;
public class rodcutting {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//String line = br.readLine();
//int test = Integer.parseInt(line);
Scanner s=new Scanner(System.in);
int test=s.nextInt();
for(int i=0;i<test;i++)
{  // int n = Integer.parseInt(br.readLine());
int n=s.nextInt();
    int c=0,r=3;
    while(r<=n)
    {
        r=r*2+1;
        c=c+1;
    }
    System.out.println(c);
}
}
}