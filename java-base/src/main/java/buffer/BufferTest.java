package buffer;

import java.nio.ByteBuffer;

public class BufferTest {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2048);
        System.out.println(byteBuffer.position() +" ;" +byteBuffer.limit() +" ;" +byteBuffer.capacity());
        byte[] bytesData = "helllo nio".getBytes();
        byteBuffer.put(bytesData);
        System.out.println(byteBuffer.position() +" ;" +byteBuffer.limit() +" ;" +byteBuffer.capacity());
        byteBuffer.flip();
        System.out.println(byteBuffer.position() +" ;" +byteBuffer.limit() +" ;" +byteBuffer.capacity());

        byte c = byteBuffer.get();
        System.out.println((char)c);
    }
}
