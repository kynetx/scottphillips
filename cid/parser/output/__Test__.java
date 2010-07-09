import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        rulesetLexer lex = new rulesetLexer(new ANTLRFileStream("/Users/ciddennis/Development/sandboxes/cid/parser/dispatch.krl", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        rulesetParser g = new rulesetParser(tokens, 49100, null);
        try {
            g.ID();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}