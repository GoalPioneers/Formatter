package com.goalpioneers.modules.formatter.objects.elements;

import com.goalpioneers.modules.formatter.objects.types.FlatFilesColumnType;
import com.goalpioneers.modules.formatter.flatfiles.templates.FlatFilesColumn;


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
