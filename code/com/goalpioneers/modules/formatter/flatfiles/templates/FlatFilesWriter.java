package com.goalpioneers.modules.formatter.flatfiles.templates;


import java.util.ArrayList;
import java.util.List;

import com.goalpioneers.modules.formatter.IOFormatterWriter;
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
		this.setRows( new ArrayList<>() );
	}
	
	//
	private List<FlatFilesRow> rows = null;
	
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
}
