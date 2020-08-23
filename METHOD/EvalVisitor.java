import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EvalVisitor extends MethodBaseVisitor<String> {
    
    @Override
    public String visitInit(MethodParser.InitContext ctx){
        try{
        String classname = ctx.word().getText();
        String sentence = ctx.method().sentence(0).word().getText();

        int lastLine = 4; // public class + main + cierre + cierre
        ArrayList<String> sentences = (ArrayList) ctx.method().sentence();
        lastLine+=sentences.size();

        int headerClassEnd = 6 + 1 + 5 + 1 + classname.length() + 1 + 1 + 2; //public + space + class + space + classname + space + { + \r\n

        int endMethod = 2 + sentences.size() + 1;
        String text = new String(Files.readAllBytes(Paths.get("test.txt")), StandardCharsets.UTF_8);
        int footerPos = text.lastIndexOf("}");
        String[] textLines = text.split("\r\n");
        int endMethodChar = textLines[endMethod].length() - 1 + 2; //menos 1 pues length genera uno más, +2 \r\n

        int initCharMethod = textLines[0].length() + 2;
        int sentenceCharCount = 0;
        for(int i=2;i<(textLines.length-2);i++){
            sentenceCharCount+=textLines[i].length();
            sentenceCharCount-=1;
            sentenceCharCount+=2;
        }
        int endCharMethod = initCharMethod + endMethodChar + 2 + (textLines[1].length() -1 + 2) + sentenceCharCount;

        System.out.println("---");
        System.out.println("type: file");
        System.out.println("name: <nombre archivo>");
        System.out.println("locationSpan : {start: [1,0], end:["+lastLine+",1]}");
        System.out.println("footerSpan : [0,-1]");
        System.out.println("parsingErrorsDetected : false");
        System.out.println("children:");
        System.out.println("- type : class");
        System.out.println("  name : "+classname);
        System.out.println("  locationSpan : {start: [1,0], end: ["+lastLine+",1]}");
        System.out.println("  headerSpan : [0, "+headerClassEnd+"]");
        System.out.println("  footerSpan : ["+footerPos+", "+footerPos+"]");
        System.out.println("  children :");
        System.out.println("  - type : method");
        System.out.println("    name : main");
        System.out.println("    locationSpan : {start: [2,0], end: ["+endMethod+", "+endMethodChar+"]}");
        System.out.println("    span : ["+initCharMethod+", "+endCharMethod+"]");


        }catch(IOException ex){

        }finally{
            return "Valor retornado";
        }
    }
}