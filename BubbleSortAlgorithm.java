import java.util.*;
class BubbleSort{
  //Bubble sort logic to implement sorting for the given array
  public static int[] bubbleSort(int[]a)
    {
      for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
          if(a[i]>a[j+1]){
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
          }
        }
      }
      return a;
    }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array ");
    int n = sc.nextInt();
    int []array = new int[n];
    //for loop to add the elements to an array
     for(int i=0;i<n;i++){
        array[i]=sc.nextInt();  //array={9,7,4,1,2};
    }
    System.out.println(Arrays.toString(bubbleSort(array))); //output will be [1,2,4,7,9]
  }
}
