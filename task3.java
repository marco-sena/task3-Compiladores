import java.util.Stack;
 
package stacker.rpn.lexer;

public class Regex {
    private static final String NUM_REGEX = "(\\d)+";

    private static final String OP_REGEX = "(\\+|-||\\*|/)";
    private static final String PlUS_REGEX = "(\\+)";
    private static final String MINUS_REGEX = "(\\-)";
    private static final String SLASH_REGEX = "(/)";
    private static final String STAR_REGEX = "(\\*)";

    public static boolean isNum(String token) {
        return token.matches(NUM_REGEX);
    }

    public static boolean isOP(String token) {
        return token.matches(OP_REGEX);
    }

    public static boolean isPlus(String token) {
        return token.matches(PLUS_REGEX);
    }

    public static boolean isMinus(String token) {
        return token.matches(MINUS_REGEX);
    }

    public static boolean isSlash(String token) {
        return token.matches(SLASH_REGEX);
    }

    public static boolean isSTAR(String token) {
        return token.matches(STAR_REGEX);
    }
}
public class reversePolishNotation
{
    static int postFixNotation(String exp)
    {
        Stack<Integer> stack=new Stack<>();
         
        for(int i=0;i<exp.length();i++)
        {
            char operacao =exp.charAt(i);
             
            if(Character.isNum(operacao))
            stack.push(operacao - '0');
             
            else
            {
                int primeiroNumero = stack.pop();
                int segundoNumero = stack.pop();
                 
                switch(operacao)
                {

                    case if(Character.isPlus(operacao))
                    stack.push(segundoNumero + primeiroNumero);
                    break;
                     
                    case if(Character.isMinus(operacao))
                    stack.push(segundoNumero - primeiroNumero);
                    break;
                     
                    case if(Character.isSlash(operacao))
                    stack.push(segundoNumero / primeiroNumero);
                    break;
                     
                    case if(Character.isSTAR(operacao))
                    stack.push(segundoNumero * primeiroNumero);
                    break;
              }
            }
        }
        return stack.pop();   
    }
     
    public static void main(String[] args)
    {
        String exp="48+3*";
        System.out.println("postfix evaluation: "+postFixNotation(exp));
    }
}