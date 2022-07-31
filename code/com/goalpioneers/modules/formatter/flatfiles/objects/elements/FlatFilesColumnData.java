package com.goalpioneers.modules.formatter.flatfiles.objects.elements;

import com.goalpioneers.modules.formatter.flatfiles.objects.types.FlatFilesColumnType;
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
