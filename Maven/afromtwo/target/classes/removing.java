/*
 * @author KUSA VAMSHI
 */

/*
 * This is the program to remove 'A' or 'a' from first two positons of a string
*/

package com.vamshi;

public class removing {
	String removing(String input)
	{
		if(input.length()==0)
		{
			return "Empty String";
		}
		else
		{
			if(input.charAt(0)== 'A' || input.charAt(0)== 'a' )
			{
				if(input.length()>1)
				{
					if(input.charAt(1)== 'A' || input.charAt(1)== 'a')
					{
						return input.substring(2,input.length());
					}
					else
					{
						return input.substring(1,input.length());
					}
				}
				else
				{
					return "Empty String";
				}
			}
			else
			{
				if(input.length() > 1)
				{
					if(input.charAt(1)== 'A' || input.charAt(1)== 'a')
					{
						String str=input.charAt(0)+input.substring(2,input.length());
						return str;
					}
					else
					{
						return input;
					}
				}
				else
				{
					return input;
				}
			}
		}
	
		
	}

}
