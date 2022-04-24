package az.iktlab.project.dao.repository;

import az.iktlab.project.dao.entity.WatchListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchListRepo extends JpaRepository<WatchListEntity,Long> {
}
