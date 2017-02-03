package ru.nyrk.database.service;

import org.neo4j.ogm.session.Session;
import ru.nyrk.database.entity.Entity;

/**
 * Реализация CRUD
 */
abstract public class GenericService<T extends Entity> implements Service<T> {

    private static final int DEPTH_LIST = 0;
    private static final int DEPTH_ENTITY = 1;

    protected final Session session;

    public GenericService(Session session) {
        this.session = session;
    }

    @Override
    public Iterable<T> findAll() {
        return session.loadAll(getEntityType(), DEPTH_LIST);
    }

    @Override
    public T find(Long id) {
        return session.load(getEntityType(), id, DEPTH_ENTITY);
    }

    @Override
    public void delete(Long id) {
        session.delete(session.load(getEntityType(), id));
    }

    @Override
    public T createOrUpdate(T object) {
        session.save(object, DEPTH_ENTITY);
        return find(object.getId());
    }

    abstract Class<T> getEntityType();
}
