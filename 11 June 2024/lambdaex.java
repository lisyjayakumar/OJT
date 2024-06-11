interface Moperation{
    int operate(int a , int b);
}

public class lambdaex {
    public static void main(String[] args) {
        Moperation add =(a,b)->a+b;
        Moperation sub= (a,b)->a-b;
        Moperation div =(a,b)->a/b;
        Moperation mul =(a,b)->a*b;
        int res1 = add.operate(2,5);
        int res2 = sub.operate(4,2);
        int res3 = div.operate(2,5);
        int res4 = mul.operate(4,2);
        System.out.println("add result "+res1);
        System.out.println("subtraction result "+res2);
        System.out.println("division result "+res3);
        System.out.println("multiplli result "+res4);

        
    }
}
