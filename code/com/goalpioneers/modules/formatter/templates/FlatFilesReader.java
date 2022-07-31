package com.goalpioneers.modules.formatter.templates;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.goalpioneers.modules.formatter.templates.IOFormatterReader;
import com.goalpioneers.modules.formatter.objects.elements.FlatFilesMatrice;


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
