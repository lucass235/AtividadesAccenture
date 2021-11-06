package acc.br.student.Repository;

import org.springframework.data.repository.CrudRepository;

import acc.br.student.Model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{
}
