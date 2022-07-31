package com.goalpioneers.modules.formatter.flatfiles.templates.elements;

import com.goalpioneers.modules.formatter.flatfiles.templates.FlatFilesColumn;
import com.goalpioneers.modules.formatter.flatfiles.templates.objects.FlatFilesColumnType;


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
