import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import com.kynetx.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        RuleSet2Lexer lex = new RuleSet2Lexer(new ANTLRFileStream("/Users/ciddennis/crap/allrules/a60x9.krl", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        RuleSet2Parser g = new RuleSet2Parser(tokens, 49100, null);
        try {
            g.ruleset();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}