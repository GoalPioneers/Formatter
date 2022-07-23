package com.goalpioneers.modules.formatter.flatfiles.templates.elements;


/**
 * 
 */
public abstract class FlatFilesColumn 
{
	/**
	 * 
	 * @param dataValue
	 */
	public FlatFilesColumn( String dataValue )
	{
		this.setData( dataValue );
		this.setType( FlatFilesColumnType.None );
	}
	
	//
	protected static String EmptyString = "None";
	
	private String data = null;
	
	private FlatFilesColumnType type = null;
	
	//
	
	/**
	 * 
	 * @return
	 */
	public final String getData() 
	{
		return this.data;
	}
	
	/**
	 * 
	 * @param data
	 */
	public final void setData( String data ) 
	{
		this.data = data;
	}
	
	/**
	 * 
	 * @return
	 */
	public final FlatFilesColumnType getType() 
	{
		return this.type;
	}
	
	/**
	 * 
	 * @param type
	 */
	public final void setType( FlatFilesColumnType type ) 
	{
		this.type = type;
	}
}
