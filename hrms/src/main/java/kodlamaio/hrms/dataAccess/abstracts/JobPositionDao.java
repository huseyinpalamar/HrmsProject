package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}
