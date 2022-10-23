public class Byte_to_String 
{  
public static void main(String args[])   
{  
try  
{  
byte[] bytes = "hello world".getBytes();  
String v = new String(bytes);     
System.out.println(v);  
}  
catch(Exception e)  
{  
System.out.println(e);  
}  
}  
}  
