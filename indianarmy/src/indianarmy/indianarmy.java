package indianarmy;

import java.util.*;


public class indianarmy {
    
    static class Range implements Comparable{
        
        long x;
        long y;
        
        Range(long x,long y){
            this.x=x;
            this.y=y;
        }
        
        public int compareTo(Object obj){
            Range r=(Range)obj;
            if(x<r.x)return -1;
            else if(x==r.x){if(y<r.y)return -1;}
            return 1;
        }
        
    }
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long start=s.nextLong();
        long dest=s.nextLong(); 
        
        ArrayList<Range> border=new ArrayList<Range>();
        
        for(int i=0;i<n;i++)
        {
            long x=s.nextLong();
            long p=s.nextLong();
            border.add(new Range(x-p,x+p));
            
        }    
        
        Collections.sort(border);
        long unsafe=0;
        long curr=start;
        int i;
        for(i=0;i<n && border.get(i).x<=dest;i++){
            if(curr<border.get(i).x){
                unsafe=unsafe+border.get(i).x-curr;
                curr=border.get(i).y;}
            else if(curr>=border.get(i).x)
            {
                curr=Math.max(curr,border.get(i).y);
            }
        }
        if(curr<dest){
            unsafe=unsafe+dest-curr;
        }
        
        System.out.println(unsafe);
        
        
    }
}