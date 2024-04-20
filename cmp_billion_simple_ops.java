// Turn off loop optimization
// java -Djava.compiler=NONE cmp_billion_simple_ops.java

public class cmp_billion_simple_ops {
    public static void main(String[] args) {
  
      long startTime = System.currentTimeMillis();
      
      int i = 0;
      while (i < 1000000000){
        ++i;
      }
      
      long endTime = System.currentTimeMillis();
  
      System.out.println((endTime - startTime)/1000.0 + " seconds");
    }
  }