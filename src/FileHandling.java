import java.io.File;

import java.io.IOException;

import java.io.FileWriter;

import java.io.FileNotFoundException;

import java.util.Scanner;


public class FileHandling {
    public static void main(String[] args){

        //Create file
        try {
            File obj = new File("NewFile.txt");
            if (obj.createNewFile()){
                System.out.println(obj.getName());
            }else{
                System.out.println("File exists");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        //Write File
        try{
            FileWriter Wobj = new FileWriter("NewFile.txt",true);
            Wobj.write("This is a sample text...\n");
            Wobj.close();

        }catch (IOException e){
            e.printStackTrace();
        }


        //Read file
        try{
            File Robj = new File("NewFile.txt");
            Scanner Rscan = new Scanner(Robj);

            while(Rscan.hasNextLine()){
                String data = Rscan.nextLine();
                System.out.println(data);
            }

            Rscan.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


        // Delete a file
        File Dobj = new File("Other.txt");

        if (Dobj.delete()){
            System.out.println("File deleted : " + Dobj.getName());
        }else {
            System.out.println("Faild to delete");
        }


    }
}