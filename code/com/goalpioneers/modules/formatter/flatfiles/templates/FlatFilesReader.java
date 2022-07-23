package com.goalpioneers.modules.formatter.flatfiles.templates;


import com.goalpioneers.modules.formatter.IOFormatterReader;
import com.goalpioneers.modules.formatter.flatfiles.templates.elements.FlatFilesMatrice;


/**
 * 
 */
public abstract class FlatFilesReader 
	extends IOFormatterReader
{
	public FlatFilesReader()
	{
		this.setMatrice( new FlatFilesMatrice() );
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
		return matrice;
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
