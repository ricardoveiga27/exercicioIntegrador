public class ProfessorTitular extends Professor {

    private String especialidade;




    public ProfessorTitular(String nome, String sobrenome, Integer codigo, Integer tempoDeCasa, String especialidade) {
        super(nome, sobrenome, codigo, tempoDeCasa);
        this.especialidade = especialidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
