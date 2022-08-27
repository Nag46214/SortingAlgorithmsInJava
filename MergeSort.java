/******************************************************************************
Here i have performed mergesort algorithm .

*******************************************************************************/
import java.util.*;
class MergeSort{
    public static void merge(int[]a,int[]b,int[]c){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
        if(a[i]<b[j])
            c[k++]=a[i++];
        else
            c[k++]=b[j++];
        }
        while(i<a.length)
            c[k++]=a[i++];
        while(j<b.length)
            c[k++]=b[j++];
    
    }
  public static int[] mergeSort(int[]a)
    {
        if(a.length==1)
            return null;
      int[]left=new int[a.length/2];
      int[]right=new int[a.length-left.length];
      int i;
      for(i=0;i<left.length;i++)
        left[i]=a[i];
      for(int j=0;j<right.length;j++){
        right[j]=a[i];
        i++;
      }
      mergeSort(left);
      mergeSort(right);
      merge(left,right,a);
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
    System.out.println(Arrays.toString(mergeSort(array)));
  }
}
