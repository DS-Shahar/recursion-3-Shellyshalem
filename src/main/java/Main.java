package rekursia;

public class Main {
	//פעולה המקבלת מספר שלם וכל מספר זוגי בריבוע ואי זוגי מכפילה בשתיים
		public static int exe10(int n) {
			if(n==0) {
				return 0;
			}
			if(n%2==0) {
				return n*n+exe10(n-1);
			}
			return n*2+exe10(n-1);
		}
		
//פעולה המקבלת שני מספרים ומחזירה את סכוםכל הכפולות של המספר הראשון הקטנות מהמספר השני
		public static int exe12(int n1, int n2, int x) {
			if(x>=n2) {
				return 0;
			}
			if(n1%x==0) {
				return x+exe12(n1, n2, x+1);
			}
			return exe12(n1,n2,x+1);
		}

//סדרה בה האיבר הראשון הוא 0 השני הוא 1 וכל איבר אחר הוא סכום ריבועי של שני האיברים הקודמים
//פעולה המקבללת מספר סידורי של איבר ומחזירה את ערכו	
		public static int exe13(int n) {
			if(n==1) {
				return 0;
			}
			if(n==2) {
				return 1;
			}
			return (exe13(n-1)*exe13(n-1))+(exe13(n-2)*exe13(n-2));
		}
	
		
		
//בודק כמה אותיות קטנות יש במילה
	public static int exe21(String s, int i) {
		if(i==s.length()) {
			return 0;
		}
		if(Character.isLowerCase(s.charAt(i))) {
			return 1+exe21(s, i+1);
		}
		return exe21(s, i+1);
	}
		
//מקבל מחרוזת ומחזיר מחרוזת בסדר הפוך	
	public static String exe23(String s, int i) {
		if(i==-1) {
			return "";
		}
		return s.charAt(i)+exe23(s,i-1);
	}
	
	public static void exe24(char l1, char l2) {
		if(l1>l2)
		{
			return;
		}
		
		System.out.println(l1);
		exe24((char)(l1+1), l2);
	}
		
	public static void exe25(int n1,int x) {
		if(x==n1) {
			return;
		}
		if(n1%x==0) {
			System.out.println(x);
		}
		exe25(n1,x+1);
	}
	
	public static void exe26(int n) {
		if(n==0) {
			return;
		}
		if(n%2==0) {
			System.out.println(n);
		}
		exe26(n-1);
	}
	
	public static void exe29(int n, int d, int num) 
	{
		if(n==0)
		{
			return;
		}
		System.out.println(num);
		
		exe29(n-1,d+1, num+d);
	}

	public static void exe30(int n, int num, boolean isOdd) {
	    if (n==0) {
	        return; 
	    }
	    
	    System.out.println(num);
	    
	    if (isOdd){
	    	
	        exe30(n-1,num+2,!isOdd); 
	    }
	    else {
	        exe30(n-1,num-1,!isOdd); 
	    }
	}


//פעולה המקבלת מערך ומדפיסה את אברי המערך שהמציינים שלהם זוגיים	
		public static void exe31(int[]a,int i) {
			if(i==a.length) {
				return;
			}
			if(i%2==0) {
				System.out.println(a[i]);
			}
			exe31(a, i+1);
		}
		
	//פעולה המקבלת מספר שלם את ספרת הביקורת- חישוב חוזר של סכום ספרות המספר עד
	//שהסכום ספרות המספר הופך להיות ספרה אחת	
		public static int sum_number(int n) {
			if(n==0) {
				return 0;
			}
			return n%10+sum_number(n/10);
		}
		public static int exe42(int n) {
			if(n<10) {
				return n;
			}
			int x=sum_number(n);
			return exe42(x);
		}
	public static void main(String[] args) {
	
	}
	
		}
