import java.sql.*;
/**
 *Classe BancaDAO - Sublasse da classe BancoDeDados que controlará a tabela banca no banco de dados
 * @author giovanna
 */
public class BancaDAO extends BancoDeDados{
	/**
     * Consulta de banca de determinado professor
     */
	public String consultarProfessores(String professor) {
		String a = "Professor não encontrado !";
		String b = "";
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM banca WHERE professor = '"+professor+"';");
			while(rs.next()) {
				a = "Aluno: "+rs.getString(1)+"\n"+
					"Tipo de Defesa: "+rs.getString(2)+"\n"+"\n";
				b += a;
			}
		
		}
		
		catch (SQLException e) {}
		return b;
	}
	/**
     * Adiciona um professor à tabela banca
     */
	public boolean adicionarProfessor(Banca b) {
	    try {
	      Statement st = conexao.createStatement();
	      st.executeUpdate("INSERT INTO banca VALUES ('"
	                       + b.get_aluno_banca()+"', '"+b.get_banca_tipo_defesa() + "', '" + b.get_professor() +"');");
	      return true;
	    } catch (SQLException e) { return false; }
	  }
	/**
     * Deleta um professor da tabela banca do banco de dados
     */
	public boolean deletarProfessor(String professor) {
	    try {
	      Statement st = conexao.createStatement();
	      st.executeUpdate("DELETE FROM banca WHERE professor =  '" + professor + "';");
	      return true;
	    } catch (SQLException e) { return false; }
	  }
	/**
     * Altera os dados de um professor da banca
     */
	public boolean alterarProfessor(String coluna, String dado, String professor) {
	    try {
	      Statement st = conexao.createStatement();
	      st.executeUpdate("UPDATE banca SET " + coluna + " = '" + dado + "' WHERE professor = '" + professor + "';");
	      return true;
	    } catch (SQLException e) { return false; }
	  }

	
	
	public static void main(String args[]) {
	    BancaDAO bancaDAO = new BancaDAO();
	    String professor = "Edleno";
	    String coluna = "professor";
	    String dado = "Horácio";
	    //Banca b = new Banca("Matheus Palheta", "Defesa de TCC","Edleno");
	    //bancaDAO.adicionarProfessor(b);
	   // bancaDAO.deletarProfessor("Defesa de artigo");
	    //bancaDAO.deletarProfessor("Horácio");
	    //bancaDAO.alterarProfessor("banca_tipo_defesa", "Defesa de Doutorado", "Horácio");
	    //bancaDAO.alterarProfessor("professor", "Horácio", "Eduardo Nakamura");
	    
	  }

}
