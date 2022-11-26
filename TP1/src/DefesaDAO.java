import java.sql.*;

import java.util.ArrayList;
/**
 *Classe DefesaDAO - Sublasse da classe BancoDeDados que controlará a tabela defesa no banco de dados
 * @author giovanna
 */
public class DefesaDAO extends BancoDeDados{
	
	/**
     * Consulta de defesa de determinado aluno
     */
	public String consultarDefesas(String nome) {
		String r = "Nome não encontado.";
	    try {	
	       Statement st = conexao.createStatement();
	       ResultSet rs = st.executeQuery("SELECT * FROM defesa WHERE aluno = '"+nome+"';");
	       while(rs.next()) {
	    	   r = "Aluno: " + rs.getString(1)+"\n"+
	    			   			"Tipo de Defesa: "+rs.getString(2)+"\n"+
	    			   			"Título da Defesa: "+rs.getString(3)+"\n"+
	    			   			"Dia: "+rs.getString(4)+"\n"+
	    			   			"Lugar: "+rs.getString(5)+"\n"+
	    			   			"Orientador: "+rs.getString(6)+"\n"+
	    			   			"Nota Final: "+rs.getString(7)+"\n"+
	    			   			"Resultado: "+rs.getString(8)+"\n"+
	    			   			"Observações: "+rs.getString(9)+"\n";
	       }     
	      
	    }catch (SQLException e) { }
	    return r;
		
	  }
	/**
     * Adiciona uma defesa ao banco de dados
     */
	 public boolean adicionarDefesa(Defesa d) {
		    try {
		      Statement st = conexao.createStatement();
		      st.executeUpdate("INSERT INTO defesa VALUES ('"
		                       + d.get_aluno() + "', '"  + d.get_tipo_de_defesa()
		                       + "', '" + d.get_titulo_da_defesa() + "', '"+ d.get_dia() +
		                       "', '" + d.get_lugar() + "', '" + d.get_orientador() + "', '"
		                       + d.get_nota_final() + "', '" + d.get_resultado() + "', '" +
		                       d.get_observacoes()+"');");
		      
		      return true;
		    } catch (SQLException e) { return false; }
		  }
	 	/**
	     * Deleta uma defesa do banco de dados
	     */
	 public boolean deletarDefesa(String aluno) {
		    try {
		      Statement st = conexao.createStatement();
		      st.executeUpdate("DELETE FROM defesa WHERE aluno =  '" + aluno + "';");
		      return true;
		    } catch (SQLException e) { return false; }
		  }
	 
	 	/**
	     * Altera os dados de uma defesa do banco de dados
	     */
	 public boolean alterarDefesa(String coluna, String dado, String aluno) {
		    try {
		      Statement st = conexao.createStatement();
		      st.executeUpdate("UPDATE defesa SET " + coluna + " = '" + dado + "' WHERE aluno = '" + aluno + "';");
		      return true;
		    } catch (SQLException e) { return false; }
		  }


	  public static void main(String args[]) {
	    DefesaDAO defesaDAO = new DefesaDAO();
	    //defesaDAO.alterarDefesa("aluno", "10.0", "Giovanna Andrade Santos");
	    defesaDAO.consultarDefesas("Giovanna");
	  }
	  
	 
}
