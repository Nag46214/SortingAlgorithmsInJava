import java.util.*;
class InsertionSort{
  public static int[] insertionSort(int[]a)
    {
      for(int i=0;i<a.length;i++){
          int index=a[i];
        //Nextline will be used to produce the space and do the operations on the element which is before to the index element or key element
          int j=i-1;
        while(j>=0 && a[j]>index){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=index;
      }
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
    System.out.println(Arrays.toString(insertionSort(array)));
  }
}
