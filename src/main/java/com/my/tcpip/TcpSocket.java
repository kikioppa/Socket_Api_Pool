package com.my.tcpip;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

import java.net.Socket;



public class TcpSocket {

    public static void main(String[] args ) {

        try {

            //���� ����

            Socket socket = new Socket("211.59.10.133", 5984);

            //Server�� ���� ������ 

            BufferedWriter bufWriter = 

              new BufferedWriter( new OutputStreamWriter( socket.getOutputStream()));

            bufWriter.write("request &response      constitution numb & stirngs           ");
          //  bufWriter.newLine();
            bufWriter.flush();

            

            //Server�� ���� ������ ���

            BufferedReader bufReader =

              new BufferedReader( new InputStreamReader( socket.getInputStream()));

            String message = bufReader.readLine();

            System.out.println("Message : " + message );

            
            socket.close();

            bufReader.close();

            bufWriter.close();

          }

          catch( Exception e ){

            e.printStackTrace();

          }

            

          }

}

