import java.sql.*;

public class Questao6 {
    public static void main(String[] args) throws SQLException, Exception {
        String query = "select nome, cpf from clientes";
        String urlDB = "jdbc:mysql://localhost:3306/testbd";

        try (Connection con = DriverManager.getConnection(urlDB, "user", "user");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query);) {
            Class.forName("com.mysql.jdbc.Driver");

            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                System.out.printf("Nome:%s\t Cpf:%s %n", nome, cpf);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc driver não encontrado");
        } catch (SQLException e) {
            System.out.println("erro em operação sql");
        } catch (Exception e) {
            System.out.println("erro inesperado");
        }
    }
}