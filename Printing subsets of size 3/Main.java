import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr= new int[5];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          }
     for(int j=0;j<n-1;j++){
     for(int k=j+1;k<n;k++){
       for(int l=k+1;l<n;l++){
       System.out.print("("+arr[j]+","+" "+arr[k]+","+" "+arr[l]+")" +" ");
         
       }
     }
        
       System.out.println();
      
     }
  //--------------------------------------------------------
    }
}