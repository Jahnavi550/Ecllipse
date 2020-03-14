package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		try
		{
			FileInputStream fis=new FileInputStream("D:\\cts training\\Examples\\src\\Files\\test.txt");
			FileOutputStream fos=new FileOutputStream("D://output.txt");
			char ch;
			int i;
			while((i=fis.read())!=-1)
			{
				ch=(char)i;
				System.out.print(ch);
				fos.write(ch);
			}
			fis.close();
			fos.close();
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("File does not exists");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
	}

}
