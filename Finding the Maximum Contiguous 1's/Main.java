import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
    }
    int[] seq=new int[2*n];
    int count=0;
    for(int i=0;i<n;i++){
    if(arr[i]!=0){
    count++;
    }
    else{
    break;
    }
    }
    
    System.out.println(count);
    
    
    
    }
}