public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("Informática", "INF");
        Curso curso = new Curso("Ciência da Computação", "CC", 9, departamento);
        Alunos aluno = new Alunos("Marco Antonio", 99999999, 2023, curso);

        System.out.println(aluno.getCurso().getNome());
        System.out.println(aluno.getCurso().getSigla());
        System.out.println(aluno.getCurso().getDuracao());
        System.out.println(aluno.getCurso().getDepartamento().getNome());


    }
}
