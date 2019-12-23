package com.my.tcpip;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

import java.net.Socket;



public class TcpSocket {

    public static void main(String[] args ) {

        try {

            //Connect to server)

            Socket socket = new Socket("IP",Port);

            //Data for server

            BufferedWriter bufWriter = 

              new BufferedWriter( new OutputStreamWriter( socket.getOutputStream()));

            bufWriter.write("request    constitution numb & stirngs           ");
          //  bufWriter.newLine();
            bufWriter.flush();

            

            //Print data from server

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

