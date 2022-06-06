package com.botchan;

import java.io.File;
import java.io.FileWriter;

public class Commands extends Main {

    public void pause(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public void createBotBuild(String name) {


        String program = "class JavaFile { " +
                "public static void main(String[] args) { " +
                "System.out.println(\"This is file\");"+
                "}"+
                "}";

        try {
            FileWriter output = new FileWriter("C:\\Tanmay\\Code\\Java Stuf\\Bot_in_Bot\\Final_Bot_Builds\\" + name + ".java");
            output.write(program);
            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
