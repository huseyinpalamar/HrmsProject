package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
