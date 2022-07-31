package com.goalpioneers.modules.formatter.objects.elements;

import java.util.ArrayList;
import java.util.List;

import com.goalpioneers.modules.formatter.flatfiles.templates.FlatFilesColumn;


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
		this.setColumns( 
			new ArrayList<>() 
		);
	}
	
	
	// Variables
	/**
	 * 
	 */
	private List<FlatFilesColumn> columns = null;
	
	
	// Accessors
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
