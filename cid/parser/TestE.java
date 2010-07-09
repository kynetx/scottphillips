import org.antlr.runtime.*;
import java.io.*;

public class TestE 
	{ 
		public static void main(String[] args) throws Exception 
		{
			System.out.println("Reading " + args[0]);
			
			ANTLRFileStream input = new ANTLRFileStream(args[0]);
			System.out.println("2");
			rulesetLexer lexer = new rulesetLexer(input); 
			System.out.println("3");
			CommonTokenStream tokens = new CommonTokenStream(lexer); 
			System.out.println("4");
			rulesetParser parser = new rulesetParser(tokens);
			System.out.println("5");
			parser.ruleset();
			System.out.println("Done");
		}
}
