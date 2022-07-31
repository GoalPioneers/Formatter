package com.goalpioneers.modules.formatter.templates;


import com.goalpioneers.modules.formatter.templates.IOFormatterWriter;
import com.goalpioneers.modules.formatter.objects.elements.FlatFilesMatrice;


/**
 * 
 */
public abstract class FlatFilesWriter 
	extends IOFormatterWriter
{
	/**
	 * 
	 */
	public FlatFilesWriter()
	{
		this.setMatrice( 
			new FlatFilesMatrice()
		);
	}
	
	
	// Variables
	private FlatFilesMatrice matrice = null;
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public FlatFilesMatrice getMatrice() 
	{
		return this.matrice;
	}
	
	/**
	 * 
	 * @param matrice
	 */
	public void setMatrice( FlatFilesMatrice matrice ) 
	{
		this.matrice = matrice;
	}
}
