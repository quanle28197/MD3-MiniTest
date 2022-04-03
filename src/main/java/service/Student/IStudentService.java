package service.Student;

import model.Student;
import service.IService;

public interface IStudentService  extends IService {
    void insertStudentToManyClasses (Student student, int[] classes);
}
