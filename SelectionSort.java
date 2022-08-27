import java.util.*;
class SelectionSort{
  public static int[] selectionSort(int[]a)
    {
      for(int i=0;i<a.length;i++){
          int index=i;
        for(int j=i;j<a.length;j++){
          if(a[j]<a[index]){
            index=j;
          }
        }
        int temp=a[i];
            a[i]=a[index];
            a[index]=temp;
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
    System.out.println(Arrays.toString(selectionSort(array)));
  }
}
