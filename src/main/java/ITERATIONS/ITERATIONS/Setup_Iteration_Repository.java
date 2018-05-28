package ITERATIONS.ITERATIONS;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "setup_iteration", path = "setup_iteration")
public interface Setup_Iteration_Repository extends MongoRepository<Setup_Iteration,String> {

}
