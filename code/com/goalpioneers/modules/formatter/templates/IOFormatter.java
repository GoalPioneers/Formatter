package com.goalpioneers.modules.formatter.templates;


import com.goalpioneers.modules.formatter.templates.objects.IOFormatterType;

/**
 * 
 */
public abstract class IOFormatter 
{
	/**
	 * 
	 */
	private IOFormatterType type = IOFormatterType.None;
	
	
	/**
	 * 
	 * @return
	 */
	public IOFormatterType getType() 
	{
		return type;
	}
	
	
	/**
	 * 
	 * @param type
	 */
	protected void setType( IOFormatterType type ) 
	{
		this.type = type;
	}
}
