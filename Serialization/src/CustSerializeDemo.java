import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Account implements Serializable {
	
	String name = "Hemraj";
	transient String pass = "patil";
	
	
	private void writeObject(ObjectOutputStream oos )throws Exception{
		    oos.defaultWriteObject();
		    String epass ="123"+pass;
		    oos.writeObject(epass);
	}
	
	private void readObject(ObjectInputStream oi) throws Exception{
		   oi.defaultReadObject();
		   String epass = (String) oi.readObject();
		   pass = epass.substring(3);
	}
	
	
	@Override
	public String toString() {
		return "Account [name = " + name + ", pass = " + pass + "]";
	}
}



public class CustSerializeDemo {

	public static void main(String[] args) throws Exception {
		
	Account a1 = new Account();
	
	FileOutputStream fos = new FileOutputStream("acs.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(a1);
	
	FileInputStream fis = new FileInputStream("acs.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Account a2 = (Account)ois.readObject();
	
	System.out.println(a2);
			 
	
   }
	
}
