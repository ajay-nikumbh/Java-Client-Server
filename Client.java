import java.io.*;
import java.net.*;
public class Client {
public static void main(String[] args) throws Exception
{

Socket s=new Socket("localhost",9999);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
while(true)
{
String so=br.readLine();
dout.writeUTF(so);
if(so.equalsIgnoreCase("exit"))
break;
}
s.close();}

}