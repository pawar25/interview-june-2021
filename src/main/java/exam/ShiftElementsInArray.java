package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int[] arr=new int[]{1,2,3,4,5}
    int n= 1 //n to tell number of rotation to perform
      
    system.out.print("Our Array")
    for(int i=0;i<arr.lenght;i++)
    {
      system.out.print(arr[i]+" ");
    }
    for(int i=0;i<n;i++){
      int j,last_ele;
      last_ele=arr[arr.lenght-1];
      for(j=arr.lenght-1;j>0;j--)
      {
        arr[j]=arr[j-1];
      }
      
        system.out.print()
           system.out.print("After Rotation by 1")
              
      for(int i=0;i<arr.lenght;i++)
    {
      system.out.print(arr[i]+" ");
    }

  }

}
