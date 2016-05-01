/*
 * Kushal Mishra
 */

package com.sonalake.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class CalculatorImpl implements Calculator 
{	
	WordToNumber wtn=new WordToNumber();  
	public String calculate(String request) 
	{

		if(request==null)
		{
			throw new IllegalArgumentException();
		}else 
			if(request.contains("plus"))
			{


				String asplit[]=request.split("plus");
				String first=asplit[0];
				String last=asplit[1];	
				String sfirstall = "";
				String ssecondall = "";		
				String[] firstall=first.split(" ");
				String[] secondall=last.split(" ");
				for(String i:firstall )
					sfirstall=sfirstall+" "+i;
				for(String j:secondall )
					ssecondall=ssecondall+" "+j;

				long f=0;
				long s=0;
				try
				{
					f= WordToNumber.parse(sfirstall.trim());
					s=WordToNumber.parse(ssecondall.trim());
				}
				catch(Exception e){}
				long lresult=f+s;
				if(lresult==0||f>100||s>100)
				{
					throw new IllegalArgumentException();
				}
				return NumberToWord.convert(lresult);

			}
			else if((request.contains("multiplied")))
			{
				String asplit[]=request.split("multiplied by");
				String first=asplit[0];
				String last=asplit[1];	
				String sfirstall = "";
				String ssecondall = "";		
				String[] firstall=first.split(" ");
				String[] secondall=last.split(" ");
				for(String i:firstall )
					sfirstall=sfirstall+" "+i;
				for(String j:secondall )
					ssecondall=ssecondall+" "+j;

				long f=0;
				long s=0;
				try
				{
					f= WordToNumber.parse(sfirstall.trim());
					s=WordToNumber.parse(ssecondall.trim());
				}
				catch(Exception e)
				{}
				long lresult=f*s;

				if(lresult==0||f>100||s>100)
				{
					throw new IllegalArgumentException();
				}
				return NumberToWord.convert(lresult).trim();
			}
			else if((request.contains("divided")))
			{
				String asplit[]=request.split("divided by");
				String first=asplit[0];
				String last=asplit[1];	
				String sfirstall = "";
				String ssecondall = "";		
				String[] firstall=first.split(" ");
				String[] secondall=last.split(" ");
				for(String i:firstall )
					sfirstall=sfirstall+" "+i;
				for(String j:secondall )
					ssecondall=ssecondall+" "+j;

				long f=0;
				long s=0;
				try
				{
					f= WordToNumber.parse(sfirstall.trim());
					s=WordToNumber.parse(ssecondall.trim());
				}
				catch(Exception e){}
				long lresult=f/s;
				long reminder=f%s;	

				System.out.println(f+" "+s);
				System.out.println(lresult);

				if(lresult==0||f>1000||s>1000)
				{
					throw new IllegalArgumentException();
				}
				String m=NumberToWord.convert(lresult).trim();
				if(reminder!=0)
				{
					String sremi=NumberToWord.convert(reminder).trim();
					return m+" with a remainder of "+sremi;
				}
				return NumberToWord.convert(lresult).trim();
			}		
			else if((request.contains("minus")))
			{
				String asplit[]=request.split("minus");
				String first=asplit[0];
				String last=asplit[1];	
				String sfirstall = "";
				String ssecondall = "";		
				String[] firstall=first.split(" ");
				String[] secondall=last.split(" ");
				for(String i:firstall )
					sfirstall=sfirstall+" "+i;
				for(String j:secondall )
					ssecondall=ssecondall+" "+j;

				long f=0;
				long s=0;
				try
				{
					f= WordToNumber.parse(sfirstall.trim());
					s=WordToNumber.parse(ssecondall.trim());
				}
				catch(Exception e)
				{}
				long lresult=f-s;


				if(lresult==0||f>100||s>100)
				{
					throw new IllegalArgumentException();
				}
				String m;
				if(lresult<0)
				{
					lresult=Math.abs(lresult);
					m=NumberToWord.convert(lresult).trim();
					return "minus "+NumberToWord.convert(lresult).trim();
				}				
				return NumberToWord.convert(lresult).trim();
			}
			else
			{
				throw new IllegalArgumentException();
			}
	} 

}
