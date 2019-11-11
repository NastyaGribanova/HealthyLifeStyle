package dao;

import models.User;

import java.sql.SQLException;

public interface UserCrudDAO {
    User create(User user);
    void read();
    void update();
    void delete();
}
