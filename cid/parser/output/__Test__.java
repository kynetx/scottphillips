import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import com.kynetx.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        RulesetLexer lex = new RulesetLexer(new ANTLRFileStream("/Users/ciddennis/Development/sandboxes/cid/parser/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        RulesetParser g = new RulesetParser(tokens, 49100, null);
        try {
            g.ruleset();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}