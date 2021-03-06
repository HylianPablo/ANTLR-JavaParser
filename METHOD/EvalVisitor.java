import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EvalVisitor extends MethodBaseVisitor<String> {

    @Override
    public String visitInit(MethodParser.InitContext ctx) {
        try {
            String classname = ctx.word().getText();
            String sentence = ctx.method().sentence(0).word().getText();

            int lastLine = 4; // public class + main + cierre + cierre
            ArrayList<String> sentences = (ArrayList) ctx.method().sentence();
            lastLine += sentences.size();

            int headerClassEnd = 6 + 1 + 5 + 1 + classname.length() + 1 + 1 + 2; // public + space + class + space +
                                                                                 // classname + space + { + \r\n

            int endMethod = 2 + sentences.size() + 1;
            String text = new String(Files.readAllBytes(Paths.get("test.txt")), StandardCharsets.UTF_8);
            int footerPos = text.lastIndexOf("}");
            String[] textLines = text.split("\r\n");
            int endMethodChar = textLines[endMethod].length() - 1 + 2; // menos 1 pues length genera uno más, +2 \r\n

            int initCharMethod = textLines[0].length() + 2;
            int sentenceCharCount = 0;
            for (int i = 2; i < (textLines.length - 2); i++) {
                sentenceCharCount += textLines[i].length();
                sentenceCharCount -= 1;
                sentenceCharCount += 2;
            }
            int endCharMethod = initCharMethod + endMethodChar + 2 + (textLines[1].length() - 1 + 2)
                    + sentenceCharCount;

            File outF = new File("out");
            FileWriter fw = new FileWriter(outF);

            fw.write("---");
            fw.write("type: file");
            fw.write("name: <nombre archivo>");
            fw.write("locationSpan : {start: [1,0], end:[" + lastLine + ",1]}");
            fw.write("footerSpan : [0,-1]");
            fw.write("parsingErrorsDetected : false");
            fw.write("children:");
            fw.write("- type : class");
            fw.write("  name : " + classname);
            fw.write("  locationSpan : {start: [1,0], end: [" + lastLine + ",1]}");
            fw.write("  headerSpan : [0, " + headerClassEnd + "]");
            fw.write("  footerSpan : [" + footerPos + ", " + footerPos + "]");
            fw.write("  children :");
            fw.write("  - type : method");
            fw.write("    name : main");
            fw.write("    locationSpan : {start: [2,0], end: [" + endMethod + ", " + endMethodChar + "]}");
            fw.write("    span : [" + initCharMethod + ", " + endCharMethod + "]");
            fw.close();

        } catch (IOException ex) {

        } finally {
            return "Valor retornado";
        }
    }
}