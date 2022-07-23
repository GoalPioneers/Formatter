package com.goalpioneers.modules.formatter.flatfiles.templates.elements;


/**
 * 
 */
public class FlatFilesColumnHeader 
	extends FlatFilesColumn
{
	/**
	 * 
	 */
	public FlatFilesColumnHeader()
	{
		super( FlatFilesColumn.EmptyString );
		this.setType( FlatFilesColumnType.Header );
	}
	
}
