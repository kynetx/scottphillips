package com.kynetx;
import org.antlr.runtime.*;
import java.io.*;
import org.json.*;

public class ParseRuleset 
	{ 
		public static void main(String[] args) throws Exception 
		{
			File f = new File(args[0]);
			int notparsed = 0;
			int parsed = 0;
			
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
				long start = System.currentTimeMillis();
				if(thefile.length() == 0 || thefile.length() == 31 ||  thefile.length() == 162)
				{
					notparsed = notparsed + 1;
					System.out.println("Skipping: " + thefile + " in " + (System.currentTimeMillis() - start) + "ms." );
//					System.out.println("Skipping " + thefile);
					continue;
				}
				parsed = parsed + 1;
				try
				{
					ANTLRFileStream input = new ANTLRFileStream(thefile.getCanonicalPath() );
					com.kynetx.RuleSet2Lexer lexer = new com.kynetx.RuleSet2Lexer(input); 
					CommonTokenStream tokens = new CommonTokenStream(lexer); 
					com.kynetx.RuleSet2Parser parser = new com.kynetx.RuleSet2Parser(tokens);
					parser.ruleset();			
					JSONObject js = new JSONObject(parser.rule_json);
//					System.out.println("Parsed: " + thefile + " in " + (System.currentTimeMillis() - start) + "ms." );
					System.out.println(js.toString(3));
				}
				catch(Exception e)
				{
					System.out.println("Error: " + thefile + " in " + (System.currentTimeMillis() - start) + "ms." );
					System.out.println("Error "  + thefile +  " " + e.getMessage());
				}
			}
//			System.out.println("Not Parsed " + notparsed);
//			System.out.println("Parsed " + parsed);
			
		}
}
