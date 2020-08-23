import java.util.ArrayList;

public class EvalVisitor extends XYBaseVisitor<String> {
    
    @Override
    public String visitLine(XYParser.LineContext ctx){
        String resultado="";
        String[] lines = ctx.getText().split("\n");
        for(String line : lines){
            if(line.charAt(0)=='x'){
                resultado+="X";
            }else{
                resultado+="Y";
            }
        }
        return resultado;
    }
}