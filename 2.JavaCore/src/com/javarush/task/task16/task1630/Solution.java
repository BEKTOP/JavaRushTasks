package com.javarush.task.task16.task1630;

import com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolImpl;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        firstFileName = reader.readLine();
        secondFileName = reader.readLine();
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
  /*      firstFileName = "d:/01.txt";
        secondFileName = "d:/02.txt";*/
    }
    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String fullFileName = "";
        String FileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName=fullFileName;
        }

        @Override
        public String getFileContent() {

            return this.FileContent;
        }

        public void run(){
            String path = fullFileName;
            String line,fbody="";
            try { BufferedReader readFile = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
                while ((line = readFile.readLine())!=null) {
                    fbody +=  " "+line;
                }
            }
            catch(Exception e) {
                System.out.println("sdgfsg");
            }

                this.FileContent = fbody.toString();
            //System.out.println(this.FileContent);

                /*File file = new File(this.fullFileName);
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                while (line !=null){FileContent.app}
                reader.close();
                this.FileContent = this.FileContent.replace("\r\n", " ")
            }catch (Exception e){

            }
            */
        }
    }
    //add your code here - добавьте код тут
}
