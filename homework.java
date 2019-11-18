package homework;




public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//targil 1
		/*int x=2;
		int y=2;
		//A
		double chishuv = (x+y)/2;
		System.out.println(String.format("The evg is: %s",chishuv));
		//B
		if (x>y) {
			System.out.println(String.format("%s is the biggest number",x));
		}
		else {
			System.out.println(String.format("%s is the biggest number",y));
		}
		//c
		if (x<y) {
			System.out.println(String.format("%s is the smallest number",x));
		}
		else {
			System.out.println(String.format("%s is the smallest number",y));
		}
		//d
		//need to think about it.
		 * 
		 */
		//2
		/*int x = 150;
		int y = 200;
		String txt = "hello world";
		//a
		if(x>y) {
			System.out.println(txt);
		}
		//b
		if(x<y) {
			System.out.println(txt);
		}
		//c
		if(x==y) {
			System.out.println(txt);
		}
		//d
		if(x<y || x==y) {
			System.out.println(txt);
			
		}
		//e
		if((x<y || x==y) && x<100) {
			System.out.println(txt);
		}
		//3
		for (int i =0; i<=10; i++) {
			System.out.println(i);
		}
		//4
		for (int i=10; i>=0; i--) {
			System.out.println(i);
		}
		//5
		for (int i=0; i<=10; i++) {
			System.out.print(i);

		}
		//6
		for (int i=10; i>=0; i--) {
			System.out.print(i);
		}*/
		//7
		/*double lloMam = 115.58;
		double maam = 1.18;
		System.out.println(String.format("scum letashlum hu: %s",lloMam*maam));
		//8
		double collel=118;
		double mammm= 1.18;
		System.out.println(String.format("schum lo colel mam who: %s",collel/mammm));
		//9
		double tasloom = 89;
		double tip = tasloom * 13/100;
		System.out.println(String.format("erec hatip hoo: %s ",tip));
		//10
		 
		for (int i=1; i<=10; i++) {
			System.out.println(String.format("The printed number is: %s",i));
		}
		
		11
		אובייקט זה מופע של מחלקה ופריטיבי זה משתנה
		12
		כן
		13
		int= מספר שלם שיכול להכיל עד 32 סיביות
		double=מספר עשרוני שיכול להכיל עד 64 סיביות
		14
		
		15
		while ,for ,do while,for each
		16
		אין אפשרות להשוות בין שני סטרינגים דרך:
		if (s==s)
		17
		
		18
		public=ציבורי,ניתן להשמש בה ללא הרשאות מיוחדות
		static=אי אפשר ליוצור מופעים מהמחלקה
		void=טיפוס הערך המוחזר,אין למתודה הזאת ערך
		void- מוחזר ריק
		19
		
		
		
		
		
		
		
		//targilim mitkadmim:
		//1
		
		int mis_du_sifrati = 75;
		int asarot = mis_du_sifrati/10;
		int achdot = mis_du_sifrati%10;
		String result="START";
		System.out.println(asarot);
		System.out.println(achdot);
		if (asarot == 5 || achdot == 5) {
			result="PAM";
			
		}
		 
		if (asarot ==7 || achdot==7) {
			result = "BOOM";
		}
			
		if ((asarot == 5 || achdot ==5)&&( asarot ==7 || achdot==7)) {
			result="BOOM_PAM";
		}
				
		if(achdot+asarot==7 || achdot+asarot==5) {
			result = "GOOD";
		}
					
		if (achdot != 7 && achdot !=5 && asarot !=5 && asarot !=7) {
	         result = "BAD FORMAT";
		}
		
		System.out.println(result);
	
				
		*/
	//targil 2 mitkadem
		/*
	int x=7;
	int y=5;
	int sum=0;
	for (int i=0;i<=10;i++) {
		y++;
		sum++;
	if (y==x) {
		break;
	}
	}
	System.out.println(String.format("sherit vchaloka he: %s", sum));
	targil 3 mitkadem
	
	int x=5;
	int y=7;
	for (int i=0;i<6;i++) {
		x+=5;
		
	}
	System.out.println(String.format("macpela shell 5 b7 hi: %s",x));
	targil 4 mitkadmim:
	*/
	//homwork-marachim:
	//1
	/*
	int sum=0;
    int [] aRR= new int [120];{
    	for(int i=0;i<aRR.length;i++) {
    		aRR[i]=i;
    		sum+=aRR[i];
    		//System.out.println(sum);
    		//System.out.println(aRR[i]);
    	}
    }
    System.out.println(String.format("sum of all the numbers is: %s",sum));
    
	//1.1
    int sum=0;
    int [] aRR= new int [120];{
    	for(int i=0;i<aRR.length;i++) {
    	aRR[i]=i;
    		if(aRR[i]%2==0) {
    			sum+=aRR[i];
    		}
    	}
    }	
    System.out.println(String.format("sum of all the zoogiim is: %s",sum));
	//1.2
    
	/*
	int mishtane=0;
	int [] aRR= new int [120];{
	for(int i=0;i<aRR.length;i++) {
		aRR[i]=i+10;
		if (aRR[i]%2!=0) {
			if (aRR[i]>mishtane) {
				mishtane=aRR[i];
			}
		}
	}
	}
	System.out.println(mishtane);
	}
}
	/*
	//2
	String[] aRR = {"MOSHE","YOSEF","YOSI"};{
		for (int i=0;i<aRR.length;i++) {
			System.out.print(String.format("%s, ", aRR[i]));
		}
			
	}
    	
	//3
	String Medinot_aRR[]= {"Ostria","Sfarad","Israel"};{
		for (int i=0;i<Medinot_aRR.length;i++) {
			if(Medinot_aRR[i].equals("Israel")) {
				System.out.println("Israel exist in this arr!");
			}
		}
	}
	//4
	
	
	
	String x= "qa";
	switch (x){
	case "qa":
		System.out.println(String.format("hanascoret shel qa hi: %s",7000));
		break;
	case "it":
		System.out.println(String.format("hanascoret shel it is: %s",8000));
		break;
	case "automation":
		System.out.println(String.format("hanascoret shel automation is: %s",12000));
		break;
	default:
		System.out.println("mikzoa lo mocaaaaarrrrrr");
	}
	*/
		//targil 1
		//String [] arrString = {"o","l","l","e","H"};
		//for (int i=4;i>=0;i--) {
			//System.out.print(arrString[i]);
//	        }
		//targil 2
		/*
		String str = "hello automation class";
		String firstWord = str.substring(0, 5);
		String secondWord =str.substring(str.length()-5,str.length());
		System.out.println(firstWord+" "+secondWord);
		
		//targil 3:
		
		char [] arrString = {'o','l','l','e','H'};
		String helloStr = new String(arrString);
		String newString= "";
		char c;
		int i=helloStr.length()-1;
		do {
			c=helloStr.charAt(i);
			newString=newString+c;
			i--;
		}while (i!=-1);
		
		System.out.println(newString);
		
		//targil 4
		int [] nums = {4,3,2,1};
		for (int i=nums.length-1;i>=0;i--) {
			System.out.print(nums[i]+",");
		}
		*/
		//targil 5:
		String hello ="olleH";
		char ch;
		String newStr="";
		int i = hello.length()-1;
		do {
			ch=hello.charAt(i);
			newStr=newStr+ch;
			i--;
		}while (i!=-1);
		
		System.out.println(newStr);
		}
			}
	

	


