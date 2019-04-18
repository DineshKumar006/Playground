import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int[] arr= new int[n];
      for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     
      }
      
      fun(arr,n);
      
    }
  
  public static void fun(int[] arr,int n){
    int[] ele=new int[n];
    int[] zero=new int[n];
    int ele_size=0,zero_size=0;
    for(int i=0;i<n;i++){
    if(arr[i]>0){
    ele[ele_size]=arr[i];
      ele_size++;
    }
      else{
      zero[zero_size]=arr[i];
        zero_size++;
      }
    }
    
    int index=0;
    for(int i=0;i<ele_size;i++){
    arr[index]=ele[i];
      index++;
    }
    
    for(int j=0;j<zero_size;j++){
    arr[index]=zero[j];
      index++;
    }
    
    
  for(int m=0;m<n;m++){
    System.out.print(arr[m]+" ");
    }
  
  
    
    
  
  }
}