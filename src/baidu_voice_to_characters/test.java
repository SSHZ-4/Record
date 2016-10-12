package baidu_voice_to_characters;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class test
{
	public static void main(String[] args) throws Exception
	{
		getWords getwords = new getWords();
		
		while(true)
		{
		
			
			
			String result=getwords.listen("zhangxu1.mp3");
			System.out.println("得到的结果是："+result);
			
			//得到文件，存在本地，listen一下，返回读取结果。
			
			
			System.out.println("返回结果结束。。。");
		}
	}

}
