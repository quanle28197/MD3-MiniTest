package service.Classes;

import model.Classes;
import model.Student;
import service.IService;

import java.util.List;

public interface IClassesService extends IService {
    List<Classes> selectAllByClassesId (int id_classes);
}
