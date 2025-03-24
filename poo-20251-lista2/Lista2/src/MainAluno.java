import exe2.Aluno;

public class MainAluno {
    public  static void main(String[] args) {
        Aluno obj1 = new Aluno();
        System.out.println(obj1.dadosAluno());
        Aluno obj2 = new Aluno(125705, "Matheus", 33, 8.5f, 7.5f);
        System.out.println(obj2.dadosAluno());
        System.out.println(obj2.notaFinal());
    }
}
