package boot.hei.demo.dao;

import boot.hei.demo.entity.Client;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "clients",path="clients")
public interface ClientDao extends PagingAndSortingRepository<Client,Long> {

    public List<Client> findBylastname(@Param("lastname")String lastname);

}
