package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concrete.JobPosition;

public interface JobPositionService {

	void add(JobPosition jobPosition);
	
	List<JobPosition> getAll();
}
