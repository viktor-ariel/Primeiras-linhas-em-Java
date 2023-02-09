
package primeiroprograma;
import classes.Aluno;
import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Aluno pessoa = new Aluno();
        Scanner leia = new Scanner(System.in);
        //objetotr  
        pessoa.nome ="Maria";
        pessoa.CPF ="123.123.123-00";
        pessoa.matricula ="0058";
        pessoa.pagamento=false;
        pessoa.situacao=true;
        pessoa.valor= 123;
        pessoa.turma=15;
        
        System.out.println("Seu boleto foi pago?");
        pessoa.pagamento = leia.nextBoolean();
        
        System.out.println("Nome : "+pessoa.nome);
        System.out.println("CPF : "+pessoa.CPF );
        System.out.println("Matrícula : "+pessoa.matricula );
        System.out.println("Pagamento : "+pessoa.pagamento);
        System.out.println("Situação : "+pessoa.situacao );
        System.out.println("Turma : "+pessoa.turma);
        System.out.println("Valor : "+pessoa.valor );
        
        pessoa.verificacao(pessoa.pagamento);
    }
    
    
}
