package com.goalpioneers.modules.formatter.flatfiles.templates.elements;

import com.goalpioneers.modules.formatter.flatfiles.templates.objects.FlatFilesColumnType;


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
