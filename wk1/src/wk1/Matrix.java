package wk1;
import java.util.*;
public class Matrix {
    public int [][]a;
    public int v,d;
    Matrix(int n,int m){
        a = new int[n][m];
        v = n;
        d = m;
        Random r = new Random();
        for(int i = 0 ; i <n;i++){
            for(int j = 0 ; j<m;j++){
                a[i][j] = r.nextInt(50);
            }
        }
    }
    public void print(){
        for(int i = 0;i<v;i++){
           for(int j = 0 ; j<d;j++){
               System.out.print(a[i][j]+" ");
           }
           System.out.println("");
       }
    }
    public int sum(){
        int sm = 0;
        boolean t;
        for(int i = 0;i<v;i++){
            for(int j = 0;j<d;j++){
                if(j > i){
                    t = true;
                    for(int h = 2;h<a[i][j];h++){
                        if(a[i][j] % h == 0){
                            t = false;
                            break;
                        }
                    }
                    if(t){
                        sm += a[i][j];
                    }
                }
            }
        }
        return sm;
    }
    
    public void zam(){
        int nal;
        for(int i = 0 ; i<v;i++){
            nal = 0;
            
            for(int j = 0;j<d;j++){
                if(Bibu.prost(a[i][j])){
                    nal += 1;
                }
            }
            if(nal > 2){
                for(int j = 0;j<d;j++){
                    if(a[i][j] % 2 == 0){
                        a[i][j] = 0;
                    }
                }
            }
        }
    }
    
    public int proz(int f){
        int p = 1;
        for(int i = 0 ; i<v;i++){
            for(int j = 0 ; j<d;j++){
                if(j > (v - i - 1)){
                    if(a[i][j] > f){
                        p *= a[i][j];
                        a[i][j] = 0;
                    }
                }
            }
        }
        return p;
    }
    
    public int perfproiz(){
        int p = 1;
        for(int i = 0; i<v; i++){
            for(int j = 0; j<d; j++){
                if(Bibu.perf(a[i][j])){
                    p *= a[i][j];
                }
            }
        }
        return p;
    }
    
}
