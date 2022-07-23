package com.goalpioneers.modules.formatter.flatfiles.templates;


import java.util.ArrayList;
import java.util.List;

import com.goalpioneers.modules.formatter.IOFormatterWriter;
import com.goalpioneers.modules.formatter.flatfiles.templates.elements.FlatFilesMatrice;
import com.goalpioneers.modules.formatter.flatfiles.templates.elements.FlatFilesRow;


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
