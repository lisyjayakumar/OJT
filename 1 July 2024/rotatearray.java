public class rotatearray{
    public void rotatearrays(int[] num, int k){
        int[] newarr = new int[num.length];
        if(k>num.length){
            k = k%num.length;
        }
        for(int i = 0; i< k ; i++){
            newarr[i] = num[num.length-k+i];

        }
    int j = 0;
    for(int i =k; i< num.length ;i++){
        newarr[i] =num[j]; 
        j++;
    }
    for(int n: newarr){
        System.out.println(n);
    }

    }
    public static void main(String[]args){
        int[] num = {1,2,3,4,5,7};
        rotatearray obj = new rotatearray();
        obj.rotatearrays(num,3);
    }
}