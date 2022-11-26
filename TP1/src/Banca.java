/**
 *Classe banca - Representa a banca de professores que avaliará a defesa do aluno
 * @author giovanna
 */
public class Banca {
	 /**
     * Elementos da tabela Banca no BD
     */
    private String banca_tipo_defesa;
    private String professor;
    private String aluno_banca;
    /**
     * Construtor da classe
     * @param professor representa o avaliador da banca
     * @param banca_tipo_defesa tipo de banca que tal professor pertence
     * @param aluno_banca aluno que apresentaraá para tal banca
     */
    public Banca(String aluno_banca, String banca_tipo_defesa,  String professor){
        this.professor = professor;
        this.banca_tipo_defesa = banca_tipo_defesa;
        this.aluno_banca = aluno_banca;
    }
    
    /**
     * Pega um professor de uma banca
     * @return String professor
     */
    public String get_professor(){return professor;}
    /**
     * Altera os valores do atributo professor_banca
     * @param professor_banca 
     */
    public void set_professor_banca(String professor){
        this.professor = professor;
    }
    
    /**
     * Pega o o tipo da banca 
     * @return String banca_tipo_defesa
     */
    public String get_banca_tipo_defesa(){ return banca_tipo_defesa;}
     /**
     * Altera o valor do atributo banca_tipo_defesa
     * @param banca_tipo_defesa 
     */
    public void set_banca_tipo_defesa(String banca_tipo_defesa){
        this.banca_tipo_defesa = banca_tipo_defesa;
    }
    
    /**
     * Pega o aluno que está defendendo diante de certa banca
     * @return String aluno_banca
     */
    public String get_aluno_banca(){ return aluno_banca;}
     /**
     * Altera o valor do atributo aluno_banca
     * @param aluno_banca 
     */
    public void set_aluno_banca(String aluno_banca){
        this.aluno_banca = aluno_banca;
    }
}
