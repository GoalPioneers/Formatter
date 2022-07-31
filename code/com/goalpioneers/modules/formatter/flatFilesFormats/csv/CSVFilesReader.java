package com.goalpioneers.modules.formatter.flatFilesFormats.csv;

import java.io.FileNotFoundException;

import com.goalpioneers.modules.formatter.templates.ff.FlatFilesReader;


/**
 * 
 */
public class CSVFilesReader 
	extends FlatFilesReader
{
	/**
	 * 
	 * @param pathToFile
	 * @throws FileNotFoundException
	 */
	public CSVFilesReader( String pathToFile ) 
		throws FileNotFoundException
	{
		this.setPath( pathToFile );
		this.setup();
	}
	
	/**
	 * 
	 */
	@Override
	public void load() 
	{
		
	}
	
	
	
	/**
	 * 
	 */
	@Override
	public void loadWholeFile() 
	{
		
	}
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String toString()
	{
		return "CSVFilesReader: ";
	}
}
