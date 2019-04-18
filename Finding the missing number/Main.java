import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      }
//------------------------------
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        if(arr[i]<arr[j]){
        int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
        }
        }
      //---------------------------------
        int a[]=new int[n];
      int num=1;
      for(int i=0;i<n;i++){
          a[i]=num;
      //  System.out.print(a[i]+" ");
        num++;
      }
      //-------------------------
      int count=0;
       for(int i=0;i<n;i++){
      		for(int j=0;j<n;j++){
            if(a[i]==arr[j]){
              count++;
            }
            }
         if(count==0){
        System.out.println(a[i]);
         }
         count=0;
      
      }
      
      
      
      
      
      
     //-------------------------------   
      }      
    }
