package com.goalpioneers.modules.formatter.objects.elements;

import com.goalpioneers.modules.formatter.objects.types.FlatFilesColumnType;
import com.goalpioneers.modules.formatter.templates.ff.FlatFilesColumn;


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
