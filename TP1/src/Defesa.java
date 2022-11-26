/**
 *Classe Defesa - Representa a tabela Defesa no banco de dados
 * @author giovanna
 */
public class Defesa {

    /**elementos da tabela Defesa no BD*/
    private String aluno;
    private String tipo_de_defesa;
    private String titulo_da_defesa;
    private String dia;
    private String lugar;
    private String orientador;
    private String nota_final;
    private String resultado;
    private String observacoes;
    
    
    /**
     * Cosntrutor da classe
     * @param aluno aluno que irá apresentar a sua defesa
     * @param dia data da defesa
     * @param lugar local da defesa
     * @param tipo_de_defesa tipo da defesa que será apresentada
     * @param titulo_de_defesa título da defesa que será apresentada
     * @param orientador professor orientador do aluno
     * @param nota_final nota final do aluno
     * @param resultado resultado de aprovação do aluno
     * @param observacoes observações dadas pela banca ao aluno
     */
    public Defesa(String aluno, String tipo_de_defesa, String titulo_da_defesa, String dia, String lugar, String orientador,
    		String nota_final, String resultado, String observacoes){
        this.aluno = aluno;
        this.dia = dia;
        this.lugar = lugar;
        this.tipo_de_defesa = tipo_de_defesa;
        this.titulo_da_defesa = titulo_da_defesa;
        this.orientador = orientador;
        this.nota_final = nota_final;
        this.resultado = resultado;
        this.observacoes = observacoes;
    }
    
    /**
     * Pega o aluno que apresentará a Defesa
     * @return String aluno
     */
    public String get_aluno(){ return aluno;}
    /**
     * Altera o valor do atributo aluno
     * @param aluno 
     */
    public void set_aluno(String aluno){
        this.aluno = aluno;
    }
    
    /**
     * Pega o professor orientador de determinado aluno
     * @return String orientador 
     */
    public String get_orientador(){ return orientador;}
    /**
     * Altera o valor do atributo orientador
     * @param orientador 
     */
    public void set_orientador(String orientador){
        this.orientador = orientador;
    }
    
    /**
     * Retorna o tipo da Defesa
     * @return String tipo_de_defesa
     */
    public String get_tipo_de_defesa(){ return tipo_de_defesa;}
    /**
     * Altera o valor do atributo tipo_de_defesa
     * @param tipo_de_defesa 
     */
    public void set_tipo_de_defesa(String tipo_de_defesa){
        this.tipo_de_defesa = tipo_de_defesa;
    }
    
    /**
     * Pega o título da Defesa
     * @return String titulo_de_defesa
     */
    public String get_titulo_da_defesa(){ return titulo_da_defesa;}
    /**
     * Aletra o valor do atributo titulo_da_defesa
     * @param titulo_da_defesa 
     */
    public void set_titulo_da_defesa(String titulo_da_defesa){
        this.titulo_da_defesa = titulo_da_defesa;
    }
    
    /**
     * Pega o dia que ocorrerá a Defesa
     * @return String dia
     */
    public String get_dia(){ return dia;}
    /**
     * ALtera o valor do atributo dia
     * @param dia 
     */
    public void set_dia(String dia){
        this.dia = dia;
    }
    
    /**
     * Pega o lugar onde ocorrerá a Defesa
     * @return String lugar
     */
    public String get_lugar(){ return lugar;}
    /**
     * Altera o valor do atributo lugar
     * @param lugar 
     */
    public void set_lugar(String lugar){
        this.lugar = lugar;
    }
    
    /**
     * Pega a nota final do aluno
     * @return String nota_final
     */
    public String get_nota_final(){ return nota_final;}
    /**
     * Altera o valor do atributo nota_final
     * @param nota_final 
     */
    public void set_nota_final(String nota_final){
        this.nota_final = nota_final;
    }
    
    /**
     * Pega o resultado atribuído ao aluno
     * @return String resultado
     */
    public String get_resultado(){ return resultado;}
    /**
     * Altera o valor do atributo resultado
     * @param resultado 
     */
    public void set_resultado(String resultado){
        this.resultado = resultado;
    }
    
    /**
     * Pega as observacoes atribuídas ao aluno
     * @return String observacoes
     */
    public String get_observacoes(){ return observacoes;}
    /**
     * Altera o valor do atributo observacoes
     * @param observacoes 
     */
    public void set_observacoes(String observacoes){
        this.observacoes = observacoes;
    }
    
   
    
}
