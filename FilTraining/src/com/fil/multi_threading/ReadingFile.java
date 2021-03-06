package com.fil.multi_threading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFile extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 101; i++)
		readAndCopyData();
		
	}

	private void readAndCopyData() {
		// TODO Auto-generated method stub
		
		Long startTime = System.currentTimeMillis();
		BufferedReader bufferedReader = null;
		FileWriter writer = null;
		
		try {
			FileReader reader = new FileReader("original.txt");
			bufferedReader = new BufferedReader(reader) ;
			writer = new FileWriter("copy.txt"); 
			String line;
			while( (line = bufferedReader.readLine()) != null  ) {
				writer.write(line);
			}
			Long endTime = System.currentTimeMillis();
			
			System.out.println( -startTime + endTime);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
