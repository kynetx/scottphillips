import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.*;


public class Test {

    public static void main(String args[]) throws Exception {
		System.out.println("Reading " + args[0]);
        rulesetLexer lex = new rulesetLexer(new ANTLRFileStream(args[0], "UTF8"));
		System.out.println("Read Stream");
        CommonTokenStream tokens = new CommonTokenStream(lex);

		System.out.println("Token");
        rulesetParser g = new rulesetParser(tokens,new org.antlr.runtime.debug.Tracer());
		System.out.println("Parser");
        try {
			System.out.println("Last Step");
            g.ruleset();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}