package es.uva.inf.tfg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * This class will read a single file which has only 'x' or 'y'. It will parse
 * it with a grammar.
 */
public class SimpleGrammarParser {
    public static void main(String args[]) throws Exception {
        try (PrintWriter out = new PrintWriter(args[1])) {
            out.println("READY");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        String firstFile = scanner.nextLine();
        String firstEncoding = scanner.nextLine();
        String firstFileOutput = scanner.nextLine();
        System.out.println("OK");
        parseFile(firstFile);

        String secondFile = scanner.nextLine();
        String secondEncoding = scanner.nextLine();
        String secondFileOutput = scanner.nextLine();
        System.out.println("OK");
        parseFile(secondFile);

        String end = scanner.nextLine();
        scanner.close();
        if (end.equals("end")) {
            return;
        }
    }

    private static void parseFile(String file) {
        try {
            CharStream charstream = CharStreams.fromFileName(file);
            MethodLexer lexer = new MethodLexer(charstream);
            MethodParser parser = new MethodParser(new CommonTokenStream(lexer));

            ParseTree tree = parser.init();
            EvalVisitor visitor = new EvalVisitor();
            visitor.visit(tree); //Debe escribir en un fichero externo y cada vez que tenga que escribir de verdad, lea el buffer
        } catch (IOException ex) {

        }

    }
}