package com.goalpioneers.modules.formatter.objects.elements;

import com.goalpioneers.modules.formatter.objects.types.FlatFilesColumnType;
import com.goalpioneers.modules.formatter.flatfiles.templates.FlatFilesColumn;


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
