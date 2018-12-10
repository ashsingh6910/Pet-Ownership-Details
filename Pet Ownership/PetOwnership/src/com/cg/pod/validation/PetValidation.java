package com.cg.pod.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PetValidation 
{
	public void validateOwnerName(String name)
	{
		if (!name.matches("[A-Z][a-z]")) 
		{
		    System.out.println("Invalid name");
		}
		
//		Pattern p=Pattern.compile("[A-Z][a-z]");
//		Matcher m=p.matcher(name);
//		//System.out.println(matcher.matches());
//		return m.matches();
	}
}
