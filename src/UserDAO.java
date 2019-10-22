import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO implements CrudDAO{

    Connection connection = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/good?serverTimezone=Europe/Moscow",
                    "root", "1029384756aA");
    Statement statement = connection.createStatement();

    public UserDAO() throws SQLException {
    }

    @Override
    public boolean create(User user) throws SQLException {
        if (!isExist(user.getLogin(), user.getPassword())) {
            try {
                int something = statement.executeUpdate("INSERT INTO user (login, password) VALUES" +
                        "(\"" + user.getLogin() + "\",\"" + user.getPassword() + "\")");
            } catch (SQLException e) {
                System.out.println("Exception during method saveLogin");
                throw new IllegalArgumentException();
            }
            return true;
        } else return false;
    }

    @Override
    public void read() throws SQLException {

    }

    @Override
    public void update() throws SQLException {

    }

    @Override
    public void delete() throws SQLException {

    }

    //проверка на существование логина и пароля в бд
    public boolean isExist(String login, String password){
        try {
            if(statement.executeQuery("SELECT * FROM user WHERE login = \"" + login +
                    "\" AND password = \"" + password + "\"").next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Exception during method isExist");
            throw new IllegalArgumentException();
        }
        return false;
    }

}
