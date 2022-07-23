package com.goalpioneers.modules.formatter;


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
