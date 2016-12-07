package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

public class NIOTest {
	static IntBuffer buf = IntBuffer.allocate(1024);  
	public static void main(String[] args) throws IOException {
/*		for(int i=0;i<50;i++){
			buf.put(i);
		}
		buf.flip();
		
		int j = 0;
		while(j<5){
			buf.get();
			j++;
		}
//		buf.compact();
	//	buf.flip();
		buf.limit(buf.capacity());
		//buf.reset();
		buf.position(8);
		while( j <100){
			if(j==99){
				buf.mark();
			}
			buf.put(j);
			j++;
		}
buf.flip();
		buf.flip();
		for(;buf.position()!= buf.limit();){
			System.out.println(buf.position()+":"+buf.get());
		}
		buf.reset();
		System.out.println(buf.get());

*/
		RandomAccessFile aFile = new RandomAccessFile("D:/a.txt","rw");
		FileChannel inChannel = aFile.getChannel();
		ByteBuffer byteBuffer = ByteBuffer.allocate(48);
		byteBuffer.putChar('a');
		byteBuffer.putChar('b');
		byteBuffer.putChar('c');
		byteBuffer.flip();
	System.out.println(byteBuffer.get());
	System.out.println(byteBuffer.get());
	System.out.println(byteBuffer.get());
		
		//System.out.println(byteBuffer.get());
		inChannel.write(byteBuffer);
		
	}

}
