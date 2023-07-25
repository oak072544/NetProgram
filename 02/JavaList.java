import java.io.*;
public class JavaList{
    public static void main(String[] args){
        try{
            if(args.length > 1 ){
                System.out.println("Usage : JavaList <File/Directory Name>");
                System.exit(1);
            }
            
            File f = new File(args[0]);

            if(!f.exists()){
                System.out.println("File not found");
                System.exit(1);
            }

            if(f.isFile()){
                System.out.println(f.getName()+" "+f.length()+" Bytes");
            }
            else if(f.isDirectory()){
                File list[] = f.listFiles();
                for (int i = 0; i < list.length; i++){
                    if (list[i].isFile()){
                        System.out.println(list[i].getName()+" " +list[i].length()+" Bytes");
                    }
                    else if(list[i].isDirectory()){
                        System.out.println(list[i].getName());
                    }
                    else{
                        System.out.println(list[i].getName()+ "is unknown");
                    }
                }
            } 
        }
        catch(Exception e){
            System.out.println("Usage : JavaList <File/Directory Name>");
        }
        
    }
}