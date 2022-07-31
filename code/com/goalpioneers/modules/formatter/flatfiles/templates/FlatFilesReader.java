package com.goalpioneers.modules.formatter.flatfiles.templates;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.goalpioneers.modules.formatter.IOFormatterReader;
import com.goalpioneers.modules.formatter.flatfiles.templates.elements.FlatFilesMatrice;


/**
 * 
 */
public abstract class FlatFilesReader 
	extends IOFormatterReader
{
	/**
	 * 
	 */
	public FlatFilesReader()
	{
		this.setMatrice( 
			new FlatFilesMatrice() 
		);
	}
	
	// Variables
	private String path = null;
	
	private FlatFilesMatrice matrice = null;
	
	private BufferedReader reader = null;
	
	private boolean isDone = false;
	
	
	public void setup() 
		throws FileNotFoundException
	{
		this.setReader(
			new BufferedReader(
				new FileReader( 
					this.getPath()
				)
			)
		);
	}
	
	/**
	 * 
	 */
	public abstract void loadWholeFile();
	
	/**
	 * 
	 */
	public abstract void load();
	
	
	/**
	 * 
	 */
	public final void clearColumns()
	{
		
	}
	
	
	public final void completed() 
		throws IOException
	{
		this.reader.close();
		this.setDone( true );
	}
	
	// Accessors
	/**
	 *
	 * @return
	 */
	public final FlatFilesMatrice getMatrice()
	{
		return this.matrice;
	}
	
	/**
	 *
	 * @param matrice
	 */
	public final void setMatrice( FlatFilesMatrice matrice )
	{
		this.matrice = matrice;
	}
	
	public final String getPath() 
	{
		return this.path;
	}
	
	public final void setPath( String toValue )
	{
		this.path = toValue;
	}
	
	public final boolean isDone() 
	{
		return this.isDone;
	}
	
	public final void setDone( boolean done ) 
	{
		this.isDone = done;
	}
	
	public final BufferedReader getReader() 
	{
		return this.reader;
	}
	
	public final void setReader( BufferedReader reader ) 
	{
		this.reader = reader;
	}
}
