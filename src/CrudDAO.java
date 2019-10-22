import java.sql.SQLException;

public interface CrudDAO {
    boolean create(User user) throws SQLException;
    void read() throws SQLException;
    void update() throws SQLException;
    void delete() throws SQLException;
}
