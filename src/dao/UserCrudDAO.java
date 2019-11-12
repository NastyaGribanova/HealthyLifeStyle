package dao;

import models.User;

import java.sql.SQLException;

public interface UserCrudDAO {
    User create(User user, int role);
    User read(String login);
    User update(User user);
    void delete();
}
