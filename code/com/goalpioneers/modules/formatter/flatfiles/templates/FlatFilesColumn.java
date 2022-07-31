package com.goalpioneers.modules.formatter.flatfiles.templates;


import com.goalpioneers.modules.formatter.flatfiles.objects.types.FlatFilesColumnType;

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
	
	
	// Accessors
	protected static String EmptyString = "None";
	
	private String data = null;
	
	private FlatFilesColumnType type = null;
	
	
	// Accessors
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
	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() 
	{
		return super.toString();
	}
}
