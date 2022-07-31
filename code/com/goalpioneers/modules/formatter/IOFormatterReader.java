package com.goalpioneers.modules.formatter;


import com.goalpioneers.modules.formatter.templates.IOFormatter;
import com.goalpioneers.modules.formatter.templates.IOFormatterType;


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
