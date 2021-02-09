package br.com.maromo;

public class Aluno {
    //Atributos
    public int ra;
    public String nome;
    public String email;

    //Comportamentos - métodos
    public void efetuarMatricula(){
        System.out.println("Matrícula do Aluno: " + nome);
        System.out.println("efetuada com sucesso");
    }
    public void cancelarMatricula(){
        System.out.println("Ra: " + ra);
        System.out.println("Teve sua matrícula cancelada");
    }

}
