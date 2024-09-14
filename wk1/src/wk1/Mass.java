package wk1;
import java.util.*;
public class Mass {
    int []a;
    Mass(int n){
        a = new int[n];
        Random r = new Random();
        for(int i = 0;i<a.length;i++){
            a[i] = r.nextInt(50);
        }
    }
    void print(){
        System.out.println("Mass: ");
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    
    int sum(){
        int s = 0;
        for(int i = 0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
    boolean sim(){
        for(int i = 0 ; i <a.length/2;i++){
            if(a[i] != a[a.length-i-1]){
                return false;
            }
        }
        return true;
    }
    
    int sump(){
        int h = 0;
        boolean ch = true;
        for(int i = 0 ;i<a.length - 1;i++){
            ch = true;
            for(int j = a[i] - 1; j > 1;j--){
                if(a[i] % j == 0){
                    ch = false;
                    break;
                }
            }
            if(ch == true && a[i+1] % 2 == 0){
                h += a[i];
            }
        }
        return h;
    }
    
    boolean vozrst(){
        for(int i = 0;i<a.length -1;i++){
            for(int j = 1;j<a.length;j++){
                if(a[i]>a[j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    void sort(){
        int pol;
        for(int i = 0 ; i<a.length-1;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    pol = a[i];
                    a[i] = a[j];
                    a[j] = pol;
                }
            }
        }
    }
    
    int kol(){
        int k = 0,del;
        for(int i = 0 ; i <a.length;i++){
            del = 0;
            for(int j = 1;j<a[i];j++){
                if(a[i] % j == 0){
                    del += j;
                }
            }
            if(del == a[i]){
                k+=1;
            }
        }
        return k;
    }
    
}
