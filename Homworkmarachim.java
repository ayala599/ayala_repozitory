package Homworkmarachim;

public class Homworkmarachim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//targil 1
		int [][] arr = {{1},{6,8},{3,7,5,6},{1,4,8}};
		/*for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
		for(int x[]:arr) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println(" ");
		}
		*/
		int [] arrNums = {1,2,3,4,56,78,89};
		int caunt =0;
		int sumzugi=0;
		int cauntAIZugi=0;
		int sumAIZugi=0;
		int gadol=0;
		int katan=arrNums[0];
		int sumAll=0;
		for(int i=0;i<arrNums.length;i++ ) {
			if(arrNums[i]%2==0) {
				caunt++;
				sumzugi+=arrNums[i];
			}
			else {
				cauntAIZugi++;
				sumAIZugi+=arrNums[i];
				
				
			}
			if (arrNums[i]>gadol) {
				gadol=arrNums[i];
			}
			if (arrNums[i]<katan) {
				katan=arrNums[i];
			}
			if(arrNums[i]==6) {
				System.out.println("number 6 faund here!");
			}
			sumAll+=arrNums[i];
			
		}
		int memuzta = sumAll/arrNums.length;
		System.out.println(String.format("camut aivarim hazoogiim hoo: %s and the sum is: %s",caunt,sumzugi));
		System.out.println(String.format("camut aivarim hai hazoogiim hoo: %s and the sum is: %s",cauntAIZugi,sumAIZugi));
		System.out.println(String.format("The biggest number is %s:",gadol));
		System.out.println(String.format("The smallest number is %s:",katan));
		System.out.println(String.format("The sum of all the aivarim is %s:",sumAll));
		System.out.println(String.format("The memuzta hoo: %s:",memuzta));
		
	}


	}


