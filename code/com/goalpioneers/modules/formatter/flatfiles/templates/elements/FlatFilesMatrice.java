package com.goalpioneers.modules.formatter.flatfiles.templates.elements;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class FlatFilesMatrice 
{
	/**
	 * 
	 */
	public FlatFilesMatrice()
	{
		this.setRows( new ArrayList<>() );
	}
	
	// Variables
	private List<FlatFilesRow> rows = null;
	
	
	// Accessors
	/**
	 *
	 * @return
	 */
	public List<FlatFilesRow> getRows()
	{
		return this.rows;
	}
	
	/**
	 *
	 * @param rows
	 */
	public void setRows( List<FlatFilesRow> rows )
	{
		this.rows = rows;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() 
	{
		return super.toString();
	}
}
