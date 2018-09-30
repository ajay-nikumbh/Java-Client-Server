import java.io.*;
import java.net.*;

public class fileclient{
public static void main(String[] argv) throws Exception {

byte []b=new byte[2002];
Socket sr=new Socket("localhost",5643);
InputStream is=sr.getInputStream();
FileOutputStream fr=new FileOutputStream("G:/transfer.txt");
is.read(b,0,b.length);
fr.write(b, 0, b.length);
}
}