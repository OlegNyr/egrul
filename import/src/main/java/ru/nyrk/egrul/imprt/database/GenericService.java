package ru.nyrk.egrul.imprt.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.nyrk.egrul.database.entity.EntityAbstract;
import ru.nyrk.egrul.prop.ServiceDatabase;

/**
 * Реализация CRUD
 */
@Transactional(readOnly = true)
abstract public class GenericService<T extends EntityAbstract, R extends JpaRepository<T, Long>> implements ServiceDatabase<T> {

    protected final R repository;

    public GenericService(R repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T find(Long id) {
        return repository.findOne(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Transactional
    @Override
    public T createOrUpdate(T object) {
        return repository.save(object);
    }

    @Override
    @Transactional
    public T createOrUpdate(T object, Integer dept) {
        return createOrUpdate(object);
    }
}
