package com.funda.kcb; /**
 * Created by wonjun-pc on 2016-07-05.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server implements Runnable {
    ServerSocket serverSocket;
    Thread[] threadArr;

    public static void main(String[] args) {
        // 5개의 쓰레드를 생성하는 서버를 생성한다.
        Server server = new Server(5);
        server.start();
    }

    public Server(int num) {
        try {
            // 서버 소켓을 생성하여 7777번 포트와 바인딩.
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + " 서버가 준비되었습니다.");

            threadArr = new Thread[num];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        for (int i = 0; i < threadArr.length; i++) {
            threadArr[i] = new Thread(this);
            threadArr[i].start();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(getTime() + " 가 연결 요청을 기다립니다.");

                Socket socket = serverSocket.accept();
                System.out.println(getTime() + " " + socket.getInetAddress()
                        + "로부터 연결요청이 들어왔습니다.");

                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                dos.writeUTF("[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf[Notice] Test Message1 from Serverasdfasf");
                System.out.println(getTime() + " 데이터를 전송하였습니다.");

                dos.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static String getTime() {
        String name = Thread.currentThread().getName();
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date()) + name;
    }
}