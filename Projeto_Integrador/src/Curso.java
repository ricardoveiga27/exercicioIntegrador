import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private  String nome;
    private  Integer codigo;
    private  ProfessorTitular professorTitular;
    private  ProfessorAdjunto professorAdjunto;
    private  Integer qtdAlunos;
    private List<Aluno> listaAluno;



    public Boolean adicionarUmAluno(Aluno umAluno){

        if(qtdAlunos>= listaAluno.size()){
            listaAluno.add(umAluno);
            return true;
        } else {
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){

        listaAluno.remove(umAluno);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codigo.equals(curso.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public Curso(String nome, Integer codigo, Integer qtdAlunos) {
        this.nome = nome;
        this.codigo = codigo;
        this.qtdAlunos = qtdAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(Integer qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

}
