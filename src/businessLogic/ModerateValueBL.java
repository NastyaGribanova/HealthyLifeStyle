package businessLogic;

import dao.ModerateValueDAO;
import models.ModerateValue;

import java.util.List;

public class ModerateValueBL {

    ModerateValueDAO moderateValueDAO = new ModerateValueDAO();

    public void createModerateValue(ModerateValue moderateValue){
        moderateValueDAO.create(moderateValue);
    }

    public List<ModerateValue> readModerateValues(){
        return moderateValueDAO.readAll();
    }
}
