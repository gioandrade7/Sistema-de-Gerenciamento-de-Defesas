import java.sql.*;
public class BancoDeDados {
	private static String url = "jdbc:mysql://localhost:3306/db_tp1";
    private static String user = "root";
    private static String pass = "Fleurides123";
    protected static Connection conexao = null;
    
    public BancoDeDados() {
    if (conexao == null) conecta();
    }
   
    private static boolean conecta(){
      
      try {
        conexao = DriverManager.getConnection(url, user, pass);
        return true;
      } catch (SQLException e){
          System.out.println(e);
          return false;
      }
    }

    public static boolean desconecta() {
      try {
        conexao.close();
        return true;
      } catch (SQLException e) { return false; }
    }
}
