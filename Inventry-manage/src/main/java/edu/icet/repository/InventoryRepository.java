package edu.icet.repository;

import edu.icet.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<ItemEntity,Long>{

}
