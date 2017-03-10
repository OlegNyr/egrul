package ru.nyrk.egrul.database;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.nyrk.egrul.database.entity.Entity;

/**
 * Реализация CRUD
 */
@Transactional(readOnly = true)
abstract public class GenericService<T extends Entity> implements ServiceDatabase<T> {

    private static final int DEPTH_LIST = 0;
    private static final int DEPTH_ENTITY = 1;


    private final GraphRepository<T> graphRepository;

    public GenericService(GraphRepository<T> graphRepository) {
        this.graphRepository = graphRepository;
    }

    @Override
    public Iterable<T> findAll() {
        return graphRepository.findAll(DEPTH_LIST);
    }

    @Override
    public T find(Long id) {
        return graphRepository.findOne(id, DEPTH_ENTITY);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        graphRepository.delete(id);
    }

    @Transactional
    @Override
    public T createOrUpdate(T object) {
        return createOrUpdate(object, DEPTH_ENTITY);
    }

    @Transactional
    @Override
    public T createOrUpdate(T object, Integer dept) {
        return graphRepository.save(object, dept);
    }

    protected GraphRepository<T> getGraphRepository() {
        return graphRepository;
    }
}
