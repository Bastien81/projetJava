package model;

import java.io.BufferedReader;
import java.io.File;
//<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
//=======
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//>>>>>>> 3336c8762d10472f9979565ebcb3dcfcfb610570

public class Tag extends GitObject{
    
    public Tag(File _file, Git _gitInstance) throws IOException {
        
        super(_file, _gitInstance);
        
        name = _file.getName();
        
        FileReader fr = new FileReader(_file);
        BufferedReader bf = new BufferedReader(fr);
        
//        System.out.println("-------------------------------------------------------");
//        System.out.println("nom : " + this.getName());
//        System.out.println( bf.readLine() );
//        System.out.println("-------------------------------------------------------");
        
        
        //lire le tag avec filereading

    }
       public static void main(String[] argv) throws IOException
  {
      BufferedReader lecteurAvecBuffer=null;
    String ligne;
    
    try
      {
	lecteurAvecBuffer = new BufferedReader
	  (new FileReader(argv[0]));
      }
    catch(FileNotFoundException exc)
      {
	System.out.println("Erreur d'ouverture");
      }
    
    while ((ligne = lecteurAvecBuffer.readLine())!=null)
      System.out.println(ligne);
    lecteurAvecBuffer.close();
  }
} 
