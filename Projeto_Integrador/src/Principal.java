import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarProfessorAdjunto("Mario", "Dias", 0120, 2);

        ProfessorTitular professorTitular1 = new ProfessorTitular("João", "Silva", 001, 0, "Android");
        ProfessorTitular professorTitular2 = new ProfessorTitular("Jorge", "Sousa", 001, 0, "Android");
        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto("Mario", "Dias", 0120, 2, 200);
        ProfessorAdjunto professorAdjunto2 = new ProfessorAdjunto("Ricardo", "veiga", 908, 1, 12);


        Curso curso1 = new Curso("Full Stack", 20001, 3);
        Curso curso2 = new Curso("Android", 20002, 3);

        curso1.setProfessorTitular(professorTitular1);
        curso1.setProfessorAdjunto(professorAdjunto2);

        curso2.setProfessorTitular(professorTitular2);
        curso2.setProfessorAdjunto(professorAdjunto1);

        Aluno aluno1 = new Aluno("Pedro", "Alves", 999);
        Aluno aluno2 = new Aluno("Roberto", "Silva", 88);
        Aluno aluno3 = new Aluno("Mateus", "Sousa", 778);
        Aluno aluno4 = new Aluno("Maria", "Rita", 222);


        curso1.adicionarUmAluno(aluno1);
        curso1.adicionarUmAluno(aluno2);


        curso2.adicionarUmAluno(aluno3);
        curso2.adicionarUmAluno(aluno4);

    }
}




//        2. Registrar dois professores titulares e dois professores adjuntos. (Inventar
//        todos os seus valores)
//        3. Registrar dois cursos.
//        ○ Nome do curso: Full Stack
//        Código do curso: 20001
//        Quantidade máxima: 3
//        ○ Nome do curso: Android
//        Código do curso: 20002
//        Quantidade máxima: 2
//        4. Alocar um professor titular e um adjunto para cada curso.
//        5. Matricular dois alunos no curso de Full Stack.
//        6. Matricular três alunos no curso de Android.