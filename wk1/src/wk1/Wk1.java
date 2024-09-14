package wk1;
import java.util.Scanner;
public class Wk1 {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Input kol-vo: ");
       int n = in.nextInt();
       int b = in.nextInt();
       Matrix m = new Matrix(n,b);
       m.print();
//       System.out.println(m.sum());
//       m.zam();
//       m.print();
        int c = in.nextInt();
        System.out.println(m.proz(c));
        m.print();


//       Mass m = new Mass(n);
//       m.print();
//       int sum = m.sum();
//       System.out.println("Sum: "+sum);
       // 1
       //System.out.println(m.sim()); 
       
       // 2
//       Mass m2 = new Mass(n);
//       m2.print();
//       int sum2 = m2.sum();
//       if(sum > sum2){
//           System.out.println("m > m2");
//       }
//       else if(sum == sum2){
//           System.out.println("m = m2");
//       }
//       else{
//           System.out.println("m2>m");
//       }
        // 3
        //System.out.println(m.sump());
        // 
        //System.out.println(m.vozrst());
        // 4
//        m.sort();
//        m.print();

        //System.out.print(m.kol());
    }
    
}
