import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] arr={9,2,7,3,6,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
