package com.kynetx;
import org.antlr.runtime.*;
import java.io.*;
import org.json.*;

public class ParseRuleset 
	{ 
		public static void main(String[] args) throws Exception 
		{
			File f = new File(args[0]);
			
			File[] files = null;
			if(f.isDirectory())
			{
				files = f.listFiles();
			}
			else
			{
				files = new File[1];
				files[0] = new File(args[0]);
			}
			
			for(int i =0;i< files.length;i++)
			{	
				File thefile = files[i];
				if(thefile.length() == 0 || thefile.length() == 31 ||  thefile.length() == 162)
				{
//					System.out.println("Skipping " + thefile);
					continue;
				}
				long start = System.currentTimeMillis();
				try
				{
					ANTLRFileStream input = new ANTLRFileStream(thefile.getCanonicalPath() );
					com.kynetx.RuleSet2Lexer lexer = new com.kynetx.RuleSet2Lexer(input); 
					CommonTokenStream tokens = new CommonTokenStream(lexer); 
					com.kynetx.RuleSet2Parser parser = new com.kynetx.RuleSet2Parser(tokens);
					parser.ruleset();			
					JSONObject js = new JSONObject(parser.rule_json);
					System.out.println("Parsed: " + thefile + " in " + (System.currentTimeMillis() - start) + "ms." );
				}
				catch(Exception e)
				{
					System.out.println("Error "  + thefile +  " " + e.getMessage());
				}
			}
//			System.out.println(js.toString(3));
		}
}
