/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.examtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ExamTask {

    public static void main(String[] args) {
        System.out.println("Введите число больше 5");
        Scanner sc = new Scanner(System.in);
        int value;
        try {
            value = sc.nextInt();
        }catch (InputMismatchException e){
            throw new InputMismatchException("Введено не число");
        }
        if(value > 5){
            Integer[] array = new Integer[value];
            for(int i = 0;i < value;i++){
                array[i] = (i + 1) * 2;
            }          
            int data = Arrays.stream(array).max(Integer::compareTo).get();
            Thread t = new Thread(() -> {
                try {
                    URL url = new URL("https://android-for-students.ru/exam/calc.php");
                    URLConnection connection = url.openConnection();
                    HttpURLConnection httpConnecton = (HttpURLConnection) connection;
                    httpConnecton.setRequestMethod("POST");
                    httpConnecton.setDoOutput(true);
                    OutputStreamWriter osw = new OutputStreamWriter(httpConnecton.getOutputStream());
                    osw.write("value=" + data);
                    osw.flush();
                    int responseCode = httpConnecton.getResponseCode();
                    System.out.println("Response Code : " + responseCode);
                    if(responseCode == 200){
                        InputStreamReader isr = new InputStreamReader(httpConnecton.getInputStream());
                        BufferedReader br = new BufferedReader(isr);
                        String currentLine;
                        StringBuilder sbResponse = new StringBuilder();
                        while((currentLine = br.readLine()) != null){
                            sbResponse.append(currentLine);
                        }
                        String responseBody = sbResponse.toString();
                        System.out.println("Integer value from server: " + Integer.valueOf(responseBody));
                    }else{
                        System.out.println("Error! Bad response code!");
                    }
                } catch (MalformedURLException ex) {
                    System.out.println("URL error" + ex.getLocalizedMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getLocalizedMessage());                
                }
            });
            t.start();       
            try {
                t.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }else {
            System.out.println("Введено число меньше или равное 5");
        }
    }
}
