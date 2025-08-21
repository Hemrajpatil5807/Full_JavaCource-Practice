package Questions;
import java.util.Scanner;
public class Demo {

//	public static float m1(int i){
//		
////		     Employee e = (Employee) o; //Ques.5
//		     System.out.println("m1 called");
//		     return i*i;
//		}
//	
//	public static Employee m1() {    //Ques. 10
//		Employee e = new Employee(101,"sam",1000); //Ques. 10
//		return e;
//	}
//    public static void main(String[] args) {
    	
    // 	Employee e = new Employee(101,"sam",1000);   //Ques.1 3 4 5
    //	String s = "Hemraj";          //Ques.2
    //	String s1 = new String("String"); //Ques.2
		//call m1 method from here
//    	int total = 100+(int)Demo.m1(10);   //Ques.8 9
//    	System.out.println(total);
    	
//    	Employee e = Demo.m1();  //Ques. 10
//    	System.out.println(e);
//
//	}
	
	
//	public static Object m1(){
//		//create Employee object here and return
//		Employee e = new Employee(01,"sam",1000);
//		//don’t change m1 method prototype i.e return type or access specifier
//		return e;
//		}
//		public static void main(String[] args) {
//		//call m1 method and catch returned employee object here
//			Employee e = (Employee)m1();
//		//display returned employee data here
//			System.out.println(e.toString());
//		}
	
	//Que no 32
	
//	public static int m1(int i){
//		return i*i;
//		}
//	
//	public static void main(String args[]) {
//		
//		int a = m1(10);    //catching return value
//		System.out.println(a);
//		
//		System.out.println(m1(10)); //without catching return value
//		
//		int x = 10;
//		System.out.println(x + m1(10)); //calling m1 in expression
//		
//			
//		}
	  //Que. 33
	
//	public static void show(Employee e){
//		System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
//		
//	}
//	public static void process(Employee e){
//		  
//		e.setId(101);
//		e.setName("sam");
//		e.setSal(1000);
//		
//	}
//	public static void main(String[] args) {
//	//do required changes in main,process and show method
//	//create empty employee object here
//		Employee e = new Employee();
//	//add data into that empty object using process method
//		Demo.process(e);
//	//display employee object with data in show method
//		Demo.show(e);
//	}
	
	//Ques.34
//	public static void main(String[] args) {
//		//take data id , name , salary from user using scanner and
//		Scanner in = new Scanner(System.in);
//		
//		Employee e = new Employee();
//		
//		System.out.println("Enter the Employee ID Name Salary\n");
//		
//		e.setId(in.nextInt());
//     	e.setName(in.next());
//    	e.setSal(in.nextInt());
//		
//		System.out.println("\nEmployee Information \n");
//		 Demo d = new Demo();
//		 d.show(e);
//		
//		
//		}
//		public void show(Employee e){
//		//display data here by doing required changes
//			
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
//		}
		
//     Que. 35/36
//		static int total = 0;
//		
//		public static void add() {
//			
//		     total = 10 + 30;
//		}
//		
//		public static void main(String[] args) {
//			
//		      Demo.add();
//		      System.out.println(total);
//		}
	
	//Ques. 37
//	public static String reverseString (String str){
//		//reverse str string here and return
//		  String reverse = "";
//
//		  for(int i=0; i<str.length();i++) {
//			  char ch = str.charAt(i);
//			  reverse = ch +reverse;
//			  
//		  }
//		   return reverse;
//		}
//		public static void main(String[] args) {
//		String str = "Hello Welcome";
//		String reversedString = reverseString (str);
//		System.out.println(reversedString);
//		
//		}
//	Que.38
//	public static void main(String[] args) {
//		String str = "Hello Welcome";
//		//here print second character of str string for example e
//		System.out.println(str.charAt(1));
//		
//	Ques.39
//	public static void main(String[] args) {
//		String str = "Hello how are you sam?";
//		//here print the index of 'o' character from str string
//		
//		System.out.println(str.indexOf('o'));
//		}
//	 Ques.40
//	public static void main(String[] args) {
//		String str = "Hello how are you sam?";
//		//here print the index of last 'o' character from str string
//		System.out.println(str.lastIndexOf('o'));
//		}
	
//	Ques.41
//	public static void main(String[] args) {
//		String str = "Hello how are you shyam?";
//		//here print the index of third occurrence 'o' character from str string
//		
//	      char target = 'o';
//	        int count = 0;
//
//	        // Loop through the string to find the third occurrence
//	        for (int i = 0; i < str.length(); i++) {
//	            if (str.charAt(i) == target) {
//	                count++;
//	                if (count == 3) {
//	                    System.out.println("Index of third occurrence of 'o': " + i);
//	                    return;
//	                }
//	            }
//	        }
//	        System.out.println("The character 'o' does not appear 3 times in the given string.");
//	    
//		}
	
//	Ques.42
//	  public static void main(String[] args) {
//		  
//		   String str = "Hello how are you shyam?";
//		  //here print number of occurrences of 'o' character from str string
//		   char target = 'o';
//	        int count = 0;
//
//	        // Loop through the string to find the third occurrence
//	        for (int i = 0; i < str.length(); i++) {
//	            if (str.charAt(i) == target) {
//	                count++;
//	            }
//	            
//	        }
//	        System.out.println("Number of occurrences of 'o' character from : "+str+" = "+count);
//		
//		}
	
//    Ques.43
//	 public static int calculateLength(String str){
//		//calculate length here and don't use length function of string class\
//		 int length = 0;
//		for(int i = 0; i<str.lastIndexOf("");i++) {
//			length++;
//		}
//		return length;
//		
//		}
//	public static void main(String[] args) {
//		
//		String str = "Hello how are you shyam?";
//		
//		int length = calculateLength(str);
//		
//		System.out.println(length);
//		}
	
//	 Ques.44
//	public static void main(String[] args) {
//		
//		String str = "Hello Welcome";
//		//print index of first 'l' after 'W'
//		 System.out.println("index of l : "+str.indexOf('l') +"\nindex of w : "+str.indexOf('W'));
//		
//		}
	
//	 Ques.45
	
//	private int pri = 1;  //it is accecesible only in same class/ private members are only accessible within the same class.
//	protected int pro = 2; //it is accesible in same package and outside the class through inheritance / protected is accessible in subclasses and within the same package.
//	public int pub = 3;// it is accesible outside the class and package / public is accessible from anywhere.
//	       int def = 4;// it is default access specifier it can accessible outside the class in same package / default access (no specifier) allows access within the same package.
//	
//	public static void main(String[] args) {
//		
//		Demo d = new Demo();
//		 System.out.println(d.pri);
//		 System.out.println(d.pro);
//		 System.out.println(d.pub);
//		 System.out.println(d.def);
//		
//	}
	
//   Ques.47
//	 public static void main(String[] args) {
//	        Student s = new Student("Alice", 30, 1001, "Engineering");
//	         s.displayInfo();
//	    }
	
//  Ques.48
	// Java does not support Multiple Inheritance 
	
//	Ques.49
//	public static void main(String[] args) {
//		
//		Test1 t = new Test1(); // child class object
//		   t.display();
//		  
//		Test t1 = new Test1(); // parent class reference child class object
//		    t1.display();
//		   
//		Test t3 = new Test(); // parent object to call parent method
//		    t3.display();
//	}
	
//	Ques.50
		public static void main(String[] args) {
			
			MyClass m = new MyClass();
			m.sayHello();
			m.sayGoodbye();
		}
}
