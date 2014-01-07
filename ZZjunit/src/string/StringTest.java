package string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.junit.Test;

public class StringTest {
	@Test
	public void StringConstructor() throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String a="Test";
		char [] ch="Hello".toCharArray();
		byte [] bt={1,2,3};
		int [] unicode={4,5,6,7};
		byte t=-128;
		t=127;
		int k='0';
		int o=6553611;
		System.out.println(a);
	    a=new String(ch,1,3);
	    System.out.println(a);
	    a=new String(ch,1,4);
	    System.out.println(a);
	    a=new String(ch);
	    System.out.println(a);
	    a=new String(bt,1,2);
	    System.out.println(a);
	    a=new String(unicode,1,2);

	    System.out.println(a);
	    a=new String(unicode,1,2);
	    System.out.println(a);
	    // public String(byte ascii[], int hibyte, int offset, int count) 用ascii码来表示，hibyte为进制
	    //public String(byte bytes[], int offset, int length, Charset charset) 
	    //public String(byte bytes[], int offset, int length, String charsetName)
	    //public String(byte bytes[],String charsetName)
	    //public String(byte bytes[])采用默认的编码
	    //public String(byte bytes[], int offset, int lengt)采用默认的编码 
	    //  String(int offset, int count, char value[]) 私有的
	    a=new String(bt,1,2,"UTF-8");
	    System.out.println(a);
	    a=new String(bt,"UTF-8");
	    System.out.println(a);
	    System.out.println(Charset.defaultCharset()); 
	    
	    a=new String(bt,1,2,Charset.defaultCharset());
	    System.out.println(a);
	    System.out.println("\u8bf7\u628a\u4f60\u9700\u8981\u8f6c\u6362\u7684\u5185\u5bb9\u7c98\u8d34\u5728\u8fd9\u91cc");
	    
	    String bbb=new String("b");
	    System.out.println(bbb == new String("b"));
	    System.out.println(bbb == "b");

//	    a=new String(1,2,ch);
//	    System.out.println(a);
	
	}
}
