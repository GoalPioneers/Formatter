package com.goalpioneers.modules.formatter.flatfiles.templates.elements;


/**
 * 
 */
public class FlatFilesColumnData 
	extends FlatFilesColumn
{
	/**
	 * 
	 */
	public FlatFilesColumnData()
	{
		super( FlatFilesColumn.EmptyString );
		this.setType( FlatFilesColumnType.Data );
	}
	
}
