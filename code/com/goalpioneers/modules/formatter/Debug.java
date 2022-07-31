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
		String pathTo = "D:\\OpenHardwareMonitorLog-2022-06-02.csv";
		CSVFilesReader reader = new CSVFilesReader( pathTo );
		
		System.out.println(reader.toString());
	}
	
}
