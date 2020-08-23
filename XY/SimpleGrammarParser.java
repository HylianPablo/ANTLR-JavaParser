import java.util.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
/**
 * This class will read a single file which has only 'x' or 'y'. It will parse it with a grammar.
 */
public class SimpleGrammarParser {
    public static void main(String args[]) throws Exception{
        Scanner scanner = new Scanner(System.in);

        /*
        String firstFile = scanner.nextLine();
        String firstFileOutput = scanner.nextLine();
        System.out.println("OK");
        */

        CharStream charstream = CharStreams.fromFileName("test.txt");
        XYLexer lexer = new XYLexer(charstream);
        XYParser parser = new XYParser(new CommonTokenStream(lexer));
        
        ParseTree tree = parser.line();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);

        /*String end = scanner.nextLine();
        scanner.close();
        if (end.equals("end")) {
            return;
        }*/

    }
}