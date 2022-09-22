
public class Matrix {

	//WAP a multiply two matrices(two dimensional array) and save result in a third matrix.
	  // write a method to print resultant array.
		
		public void matrix() {

		int a[][]={{1,2,3},{4,5,6},{7,8,9}};    
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};    
		    
		    
		int c[][]=new int[3][3];  
		    
		
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}//end of k loop  
		System.out.print(c[i][j]+" "); 
		}
		System.out.println();  
		}    
		}
		
	public static void main(String args[]){  
		Matrix mx=new Matrix();
		mx.matrix();
	}}  
	


