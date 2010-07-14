package com.kynetx;
import org.antlr.runtime.*;
import java.io.*;
import org.json.*;

public class ParseRuleset 
	{ 
		public static void main(String[] args) throws Exception 
		{
			System.out.println("Starting");
			ANTLRFileStream input = new ANTLRFileStream(args[0]);
			com.kynetx.RulesetLexer lexer = new com.kynetx.RulesetLexer(input); 
			CommonTokenStream tokens = new CommonTokenStream(lexer); 
			com.kynetx.RulesetParser parser = new com.kynetx.RulesetParser(tokens);
			parser.ruleset();
			System.out.println("Done");
			System.out.println("Rule name is " + parser.rule_json.get("ruleset_name"));
			
			JSONObject js = new JSONObject(parser.rule_json);
			System.out.println(js.toString(3));
		}
}
