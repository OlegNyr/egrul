package ru.nyrk.egrul.database;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.nyrk.egrul.database.entity.Entity;
import ru.nyrk.egrul.prop.ServiceDatabase;

/**
 * Реализация CRUD
 */
@Transactional(readOnly = true)
abstract public class GenericService<T extends Entity, R extends GraphRepository<T>> implements ServiceDatabase<T> {

    protected static final int DEPTH_LIST = 0;
    protected static final int DEPTH_ENTITY = 1;


    protected final R repository;

    public GenericService(R repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<T> findAll() {
        return repository.findAll(DEPTH_LIST);
    }

    @Override
    public T find(Long id) {
        return repository.findOne(id, 0);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Transactional
    @Override
    public T createOrUpdate(T object) {
        return createOrUpdate(object, DEPTH_ENTITY);
    }

    @Transactional
    @Override
    public T createOrUpdate(T object, Integer dept) {
        return repository.save(object, dept);
    }

}
