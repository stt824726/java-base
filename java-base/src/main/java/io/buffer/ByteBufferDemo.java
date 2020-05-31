package io.buffer;

import java.nio.ByteBuffer;

public class ByteBufferDemo {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        printBuffer(byteBuffer);

        String str = "hello world";
        byteBuffer.put(str.getBytes());
        printBuffer(byteBuffer);

        byteBuffer.flip();
        System.out.print("切换后=========================================");
        printBuffer(byteBuffer);

        byte[] bytes =new byte[2];
        byteBuffer.get(bytes);
        printBuffer(byteBuffer);


        byteBuffer.compact();
        System.out.print("compact =========================================");
        printBuffer(byteBuffer);


        byteBuffer.clear();
        System.out.print("clear =========================================");
        printBuffer(byteBuffer);
    }

    /**
     * 打印出ByteBuffer的信息
     *
     * @param buffer
     */
    private static void printBuffer(ByteBuffer buffer) {
        System.out.println("mark：" + buffer.mark());
        System.out.println("position：" + buffer.position());
        System.out.println("limit：" + buffer.limit());
        System.out.println("capacity：" + buffer.capacity());
    }
}
