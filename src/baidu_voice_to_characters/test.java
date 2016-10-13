package baidu_voice_to_characters;

import java.io.File;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class test
{
	public static void main(String[] args) throws Exception
	{
		getWords getwords = new getWords();
		ServerSocket s = new ServerSocket(13000);
		while (true)
		{
			System.out.println(s + "等待连接中");
			Socket soc = s.accept();
			soc.close();

			String result = getwords.listen("zhangxu1.mp3");
			System.out.println("得到的结果是：" + result);

			PrintWriter pw = new PrintWriter(new File("words.txt"));
			pw.print(result);
			pw.close();

			Socket soc2 = new Socket("localhost", 14000);
			soc.close();
			System.out.println("通知识别结束");
		}
	}

}
