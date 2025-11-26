import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	int i = 10 , j = 20;
	transient String s =" Not to Serialize"; // transient keyword use to not save value of any variable for security
                                          // it will store the default value of the variable in serialize file
}

public class SerializeDemo {
	
	public static void main(String[] args) throws Exception {
		
		Dog d1 = new Dog();
		
		FileOutputStream fos =  new FileOutputStream("abc.ser"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		
		
		System.out.println(d2.i+"  "+d2.j+" "+d2.s);
		
	}

}
