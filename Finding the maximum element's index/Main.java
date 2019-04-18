import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    }
    fun(a,n);
  }
  public static void fun(int[] a,int n){
  	int max=0;
    if(a[0]<a[1]){
    max=a[0];
    }else{
    max=a[1];
    }
    
    for(int i=2;i<n;i++){
    if(a[i]>max){
    max=a[i];
    }
    }
    int index=0;
    for(int j=0;j<n;j++){
    if(a[j]==max){
    
    index=j;
    }
    }
    System.out.println(index);
  }
}