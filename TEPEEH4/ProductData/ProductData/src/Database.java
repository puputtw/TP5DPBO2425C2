import java.sql.*;

public class Database {
    private Connection connection;
    private  Statement statement;

    //contructor
    public Database() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/product",
                    "root",
                    "");
            statement = connection.createStatement();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //digunakan untukm SELECT
    public  ResultSet selectQuery(String sql) {
        try {
            statement.executeQuery(sql);
            return statement.getResultSet();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //digunakan untuk UPDATE, INSERT, DELETE
    public int insertUpdateDeleteQuery(String sql) {
        try {
            return statement.executeUpdate(sql);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //getter
    public  Statement getSstatement() {
        return  statement;
    }

}