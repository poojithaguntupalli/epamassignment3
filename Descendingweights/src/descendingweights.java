
import java.util.*;
import java.util.stream.*;
 
public class descendingweights{
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
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int ni;
HashMap<Integer,Integer> treemap=new HashMap<Integer,Integer>();
for(int i=0;i<n;i++)
{   ni=sc.nextInt();
    treemap.put(ni,(ni%k));}
        // Write your code here
       
    // Add Key-Value pairs to TreeMap
    
    
    //sort treemap by values
   Map<Integer,Integer> sortedMap = sortByValues(treemap);
    // Get Set of entries
    //Set set = sortedMap.entrySet();
    // Get iterator
    //Iterator it = set.iterator();
    // Show TreeMap elements
   // while(it.hasNext()) {
     // Map.Entry pair = (Map.Entry)it.next();
     // System.out.print(pair.getKey()+" ");
     
 
     for(int i:sortedMap.keySet()){
         System.out.print(i+" ");
     }
    //}
  }
    
 public static <k, v extends Comparable<v>> Map<k, v> 
  sortByValues(final Map<k, v> map) {
    Comparator<k> valueComparator = 
             new Comparator<k>() {
      public int compare(k k1, k k2) {
         int compare= map.get(k2).compareTo(map.get(k1));
         if(compare==0)
         return 1;
         else
         return compare;
        
      }
    };
 
    Map<k, v> sort = 
      new TreeMap<k, v>(valueComparator);
    sort.putAll(map);
    return sort;}
 
    }