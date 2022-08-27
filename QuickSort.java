import java.util.*;
class QuickSort{
  public static int[] quickSort(int[]a,int start,int end)
    {
        //Here is the base condition to stop after the required number of recursive calls.
        if(start>=end)
            return null;
      int pivot=a[end]; //here iam fixing the last index element of an array and performing the required operations.
      int i=start;  
      int j=end;
      while(i<=j){
          while(a[i]<pivot)
            i++;
        while(a[j]>pivot)
            j--;
        if(i<=j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
      }
    //Performing the recursive call to my quickSort method.
      quickSort(a,start,j);
      quickSort(a,i,end);
      return a;
    }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array ");
    int n = sc.nextInt();
    int []array = new int[n];
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(quickSort(array,0,array.length-1)));
  }
}
