//package com.json.test;
//
//import com.cslg.gfjkpt.utils.HttpClientUtils;
//import org.junit.Test;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class Test {
//
//    private static final int PORT = 123;
//
//    public static void main(String[] args) {
//        String json = HttpClientUtils.doPost("http://127.0.0.1:12580/shutdown");
//        System.out.println(json);
//    }
//
//    @org.junit.Test
//    public static void  test6() {
//        String json = HttpClientUtils.doPost("http://127.0.0.1:12580/shutdown");
//        System.out.println(json);
//    }
//
//    public void init() {
//        try {
//            ServerSocket serverSocket = new ServerSocket(PORT);
//            socketReceive(serverSocket);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void socketReceive(ServerSocket serverSocket) {
//        try {
//            Socket socket = serverSocket.accept();
//            System.out.println("成功接收");
//            handleSocket(socket);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void handleSocket(Socket socket) {
//        try {
//            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
//            System.out.println("接下读取数据");
//            String clientInputStr = dataInputStream.readUTF();
//            System.out.println(clientInputStr);
//
//            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
//            String s = "我服务端收到了";
//            dataOutputStream.writeUTF(s);
//
//            dataOutputStream.close();
//            dataInputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (socket != null) {
//                try {
//                    socket.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }
//
//}
