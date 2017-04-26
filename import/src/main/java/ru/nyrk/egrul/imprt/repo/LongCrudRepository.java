package ru.nyrk.egrul.imprt.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * todo:java doc
 */
@NoRepositoryBean
public interface LongCrudRepository<T> extends CrudRepository<T, Long> {
}
