package ru.nyrk.database;

interface ServiceDatabase<T> {

    Iterable<T> findAll();

    T find(Long id);

    void delete(Long id);

    T createOrUpdate(T object);

}