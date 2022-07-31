package com.goalpioneers.modules.formatter;


import com.goalpioneers.modules.formatter.templates.IOFormatter;
import com.goalpioneers.modules.formatter.templates.IOFormatterType;


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
