package com.goalpioneers.modules.formatter.templates;


import com.goalpioneers.modules.formatter.templates.objects.IOFormatterType;


/**
 * 
 */
public abstract class IOFormatterWriter 
	extends IOFormatter
{
	/**
	 * 
	 */
	public IOFormatterWriter()
	{
		this.setType( IOFormatterType.Writer );
	}
	
}
