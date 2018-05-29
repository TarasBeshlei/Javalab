package ua.lviv.iot.persistance.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public abstract class AbstractDao<T> implements IDao<T> {

    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected abstract Class<T> getEntityClass();

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public T findById(final Integer id) {
        T result = (T) entityManager.find(getEntityClass(), id);
        return result;
    }

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public T persist(T object) {
        entityManager.persist(object);
        return object;
    }

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public void remove(final Integer id) {
        T result = (T) entityManager.find(getEntityClass(), id);
        entityManager.remove(result);
    }

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public T update(T object) {
        entityManager.merge(object);
        return object;
    }

}