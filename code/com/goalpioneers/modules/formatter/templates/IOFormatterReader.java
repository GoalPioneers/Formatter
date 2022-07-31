package com.goalpioneers.modules.formatter.templates;


import com.goalpioneers.modules.formatter.templates.objects.IOFormatterType;


/**
 * 
 */
public abstract class IOFormatterReader 
	extends IOFormatter
{
	/**
	 * 
	 */
	public IOFormatterReader()
	{
		this.setType( IOFormatterType.Reader );
	}
}
