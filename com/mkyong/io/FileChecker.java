package com.mkyong.io;
 
import java.io.*;
 
public class FileChecker {
 
  public static void main(String args[]) {
 
	  File f = new File("mkyong.txt");
 
	  if(f.exists()){
		  System.out.println("File existed");
	  }else{
		  System.out.println("File not found!");
	  }
 
  }
 
}