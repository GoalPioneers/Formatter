package com.goalpioneers.modules.formatter.flatfiles.templates.elements;


import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class FlatFilesRow 
{
	/**
	 * 
	 */
	public FlatFilesRow()
	{
		this.setColumns( new ArrayList<>() );
	}
	
	
	//
	/**
	 * 
	 */
	private List<FlatFilesColumn> columns = null;
	
	/**
	 * 
	 * @return
	 */
	public final List<FlatFilesColumn> getColumns() 
	{
		return this.columns;
	}
	
	/**
	 * 
	 * @param columns
	 */
	public final void setColumns( List<FlatFilesColumn> columns )
	{
		this.columns = columns;
	}
}
