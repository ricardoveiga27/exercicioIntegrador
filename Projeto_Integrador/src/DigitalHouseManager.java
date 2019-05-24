import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaAlunos;
    private List<Professor> listaProfessores;
    private List<Curso> listaCursos;
    private  List<Matricula> listaMatriculas;




    public void registrarCurso(String nome, Integer codigoCurso,
                               Integer quantidadeMaximaAlunos){

        Curso curso = new Curso(nome,codigoCurso,quantidadeMaximaAlunos);

        listaCursos.add(curso);
    }


    public void excluirCurso(Integer codigoCurso){

        listaCursos.remove(codigoCurso);

    }

    public void registrarProfessorAdjunto(String nome, String
            sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){

        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome,sobrenome,codigoProfessor, 0, quantidadeDeHoras);
        listaProfessores.add(professorAdjunto);
    }


    public void registrarProfessorTitular(String nome, String
            sobrenome, Integer codigoProfessor, String especialidade){

        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, 0, especialidade);
        listaProfessores.add(professorTitular);
    }


    public void excluirProfessor(Integer codigoProfessor){
        listaProfessores.remove(codigoProfessor);
    }

    public void matricularAluno(String nome, String sobrenome,
                                Integer codigoAluno){
        Aluno aluno = new Aluno(nome,sobrenome,codigoAluno);
        listaAlunos.add(aluno);
    }


    public void matricularAluno(Integer codigoAluno, Integer
            codigoCurso){

        Aluno alunoEncontrado = getAlunoPorCodigo(codigoAluno);

        Curso cursoEncontrado = getCursoPorCodigo(codigoCurso);




        if(cursoEncontrado.adicionarUmAluno(alunoEncontrado)){
            Matricula matricula = new Matricula(alunoEncontrado,cursoEncontrado);
            listaMatriculas.add(matricula);
            System.out.println("matricula realizada com sucesso!!!");
        } else {
            System.out.println("não foi possivel matricular, o curso esta lotado!!!");
        }

    }

    public Aluno getAlunoPorCodigo(Integer codigoAluno){
        for(Aluno aluno:listaAlunos){
            if(aluno.getCodigo()==codigoAluno){
                return aluno;
            }
        }
        return null;
    }

    public Curso getCursoPorCodigo(Integer codigoCurso){
        for(Curso curso:listaCursos){
            if(curso.getCodigo()==codigoCurso){
                return curso;
            }
        }
        return null;
    }



    public void alocarProfessores(Integer codigoCurso, Integer
            codigoProfessorTitular, Integer codigoProfessorAdjunto){

        ProfessorAdjunto professorAdjunto = getProfessorAdjuntoPorCodigo(codigoProfessorAdjunto);
        ProfessorTitular professorTitular = getProfessorTitularPorCodigo(codigoProfessorTitular);
        Curso curso = getCursoPorCodigo(codigoCurso);

        curso.setProfessorAdjunto(professorAdjunto);
        curso.setProfessorTitular(professorTitular);

        System.out.println("Os professores foram alocados no curso com sucesso!!!");



    }

    public ProfessorTitular getProfessorTitularPorCodigo (Integer codigoProfessor){
        for (Professor professorTitular: listaProfessores){
            if(professorTitular.getCodigo() == codigoProfessor && professorTitular instanceof ProfessorTitular){
                return (ProfessorTitular) professorTitular;
            }
        }
        return null;
    }

    public ProfessorAdjunto getProfessorAdjuntoPorCodigo (Integer codigoProfessor){
        for (Professor professorAdjunto: listaProfessores){
            if(professorAdjunto.getCodigo() == codigoProfessor && professorAdjunto instanceof ProfessorAdjunto){
                return (ProfessorAdjunto) professorAdjunto;
            }
        }
        return null;
    }


    public DigitalHouseManager() {
        this.listaAlunos = new ArrayList<>();
        this.listaProfessores = new ArrayList<>();
        this.listaCursos = new ArrayList<>();
        this.listaMatriculas = new ArrayList<>();
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }
}
