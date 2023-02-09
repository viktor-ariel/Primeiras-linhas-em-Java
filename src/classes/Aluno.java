
package classes;
//classe
public class Aluno {
    // metodo
    public String nome;
    public String matricula;
    public String CPF; 
    public int turma;
    public float valor;
    public boolean pagamento;
    public boolean situacao;
     
    //atributo
    public void verificacao(boolean pagamento){
        if(pagamento){
            System.out.println("Boleto pago!");
        } else{
            System.out.println("Boleto não pago!");
        }
    }
}

