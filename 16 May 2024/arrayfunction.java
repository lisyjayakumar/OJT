public class arrayfunction {
    public static void main(String[] args){
        int [] array1 = {5,3,4,1};
       
        int sum = 0;
        int length = array1.length;
        for(int i = 0; i<length ; i++){
            sum = sum + array1[i];
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average "+sum/length);
       
    }

    }

