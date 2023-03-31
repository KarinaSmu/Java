package HomeWorks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HW_2 {
    public static void main(String[] args) {
        System.out.println(buildString(5,'a','b'));
        Path myfile= Path.of("file.txt");
        try {
            Files.createFile(myfile);
        }catch (IOException e){
            System.out.println("File create failed");
        }
        String mytext=textBuilder(100,"TEXT");
        try {
            Files.writeString(myfile, mytext);
        }catch (IOException e2){
            System.out.println("Error File Written");
        }

    }
    static String buildString (int n, char c1, char c2) {
        StringBuilder temp=new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            temp= temp.append(c1).append(c2);
        }
        if (n%2!=0) temp=temp.append(c1);
        String result=temp.toString();
        return result;
    }

    static String textBuilder(int a,String user){
        StringBuilder text=new StringBuilder();
        for (int i = 0; i < a; i++) {
            text=text.append(user);
        }
        String result=text.toString();
        return result;
    }





}
