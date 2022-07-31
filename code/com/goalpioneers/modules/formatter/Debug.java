package com.goalpioneers.modules.formatter;


import com.goalpioneers.modules.formatter.flatfiles.csv.CSVFilesReader;

/**
 * 
 */
public class Debug 
{
	/**
	 * 
	 * @param args
	 */
	public static void main( String[] args ) 
		throws Exception
	{
		String pathTo = "D:\\Workspace\\drivers\\Shipment.Module.Formatters\\test\\data\\test.csv";
		CSVFilesReader reader = new CSVFilesReader( pathTo );
		
		System.out.println( reader.toString() );
	}
	
}
