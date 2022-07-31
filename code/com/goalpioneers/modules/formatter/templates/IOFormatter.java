package com.goalpioneers.modules.formatter.templates;


import com.goalpioneers.modules.formatter.objects.types.IOFormatterType;

/**
 * 
 */
public abstract class IOFormatter 
{
	// Variables
	/**
	 * 
	 */
	private IOFormatterType type = IOFormatterType.None;
	
	/**
	 * 
	 */
	private String path = null;
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public final IOFormatterType getType() 
	{
		return this.type;
	}
	
	/**
	 * 
	 * @param type
	 */
	protected final void setType( IOFormatterType type ) 
	{
		this.type = type;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public final String getPath()
	{
		return this.path;
	}
	
	/**
	 * 
	 * @param toValue
	 */
	protected final void setPath( String toValue )
	{
		this.path = toValue;
	}
}
