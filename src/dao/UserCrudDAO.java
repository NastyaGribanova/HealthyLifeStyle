package dao;

import models.User;

import java.sql.SQLException;

public interface UserCrudDAO {
    boolean create(User user);
    void read();
    void update();
    void delete();
}
