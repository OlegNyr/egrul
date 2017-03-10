package ru.nyrk.egrul.database;

interface ServiceDatabase<T> {

    Iterable<T> findAll();

    T find(Long id);

    void delete(Long id);

    T createOrUpdate(T object);

    T createOrUpdate(T object, Integer dept);

}