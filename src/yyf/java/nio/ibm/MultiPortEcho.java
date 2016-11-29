package yyf.java.nio.ibm;

import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.*;

public class MultiPortEcho {
	private int ports[];
	private ByteBuffer echoBuffer = ByteBuffer.allocate(1024);

	public MultiPortEcho(int ports[]) throws IOException {
		this.ports = ports;
		go();
	}

	private void go() throws IOException {
		// Create a new selector
		Selector selector = Selector.open();

		// Open a listener on each port, and register each one
		// with the selector
		for (int i = 0; i < ports.length; ++i) {
			ServerSocketChannel ssc = ServerSocketChannel.open();
			ssc.configureBlocking(false);
			ServerSocket ss = ssc.socket();
			InetSocketAddress address = new InetSocketAddress(ports[i]);
			ss.bind(address);

			SelectionKey key = ssc.register(selector, SelectionKey.OP_ACCEPT);

			System.out.println("Going to listen on " + ports[i]);
		}

		while (true) {
			// 这个方法会阻塞，直到至少有一个已注册的事件发生
			int num = selector.select();
			// 调用 Selector 的 selectedKeys() 方法，
			//它返回发生了事件的 SelectionKey 对象的一个 集合
			Set selectedKeys = selector.selectedKeys();
			Iterator it = selectedKeys.iterator();
			//迭代SelectionKeys 
			while (it.hasNext()) {
				SelectionKey key = (SelectionKey) it.next();
				//key.readyOps():确认已经注册 
				//SelectionKey.OP_ACCEPT:实践为接收事件
				if ((key.readyOps() & SelectionKey.OP_ACCEPT) == SelectionKey.OP_ACCEPT) {
					// Accept the new connection
					ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
					SocketChannel sc = ssc.accept();
					sc.configureBlocking(false);

					// Add the new connection to the selector
					SelectionKey newKey = sc.register(selector, SelectionKey.OP_READ);
					it.remove();

					System.out.println("Got connection from " + sc);
				} else if ((key.readyOps() & SelectionKey.OP_READ) == SelectionKey.OP_READ) {
					// Read the data
					SocketChannel sc = (SocketChannel) key.channel();

					// Echo data
					int bytesEchoed = 0;
					while (true) {
						echoBuffer.clear();
						int r = sc.read(echoBuffer);
						System.out.println("r="+r);
						if (r <= 0) {
							break;
						}
						echoBuffer.flip();
						byte[] dst = new byte[1024];
						echoBuffer.get(dst);
						String str = new String(dst);
						System.out.println("##"+dst.length);
						//sc.write(echoBuffer);
						bytesEchoed += r;
					}

					System.out.println("Echoed " + bytesEchoed + " from " + sc);

					it.remove();
				}

			}
		}
	}

	static public void main(String args[]) throws Exception {
		int ports[] = new int[] { 8080 };
		for (int i = 0; i < args.length; ++i) {
			ports[i] = Integer.parseInt(args[i]);
		}
		new MultiPortEcho(ports);
	}
}
