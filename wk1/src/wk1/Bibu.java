package wk1;

import java.math.BigInteger;

public class Bibu {
    static boolean prost(int x){
        BigInteger big = BigInteger.valueOf(x);
        return big.isProbablePrime((int) Math.log(x));
    }
}
