// java array
//				: continues memory allocaton
//				: fixed size
//				: index start from 0 and 1 so on
//				: store same data type
//				: Java provides the feature of anonymous arrays which is not available in C/C++.

// Array types : single 
//			   : multidimensitionl
package practice;
class B
{
	public static void main(String[] args) 
	{
//		int[] arr= {1,2,3,4,5,6};				// single dimensional
//		for(int i=0;i<=arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
//		int[][] arr1= {{1,2,3,4},{5,6,7,8}};	// multidimensional 
//		for(int i=0;i<arr1.length;i++)
//		{
//			for(int j=0;j<arr1[i].length;j++)
//			{
//				System.out.print(arr1[i][j]);
//			}
//			System.out.println();
//		}
		
		int[][] arr=new int[3][];				// jagged array
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[4];
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count++;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(arr.getClass().getSimpleName());
	}
}