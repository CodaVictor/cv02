package cz.upce.fei.cv02.repository;

import cz.upce.fei.cv02.domain.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
}
