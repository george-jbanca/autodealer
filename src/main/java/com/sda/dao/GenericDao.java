package com.sda.dao;

import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GenericDao<T> {

    public void createEntity(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(entity);
        transaction.commit();
        session.close();
    }

    public T getEntityById(int id, Class<T> cls) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        T t = session.get(cls, id);
        transaction.commit();
        session.close();
        return t;
    }

    public T updateEntityById(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        return entity;
    }

    public void deleteEntity(int id, Class<T> cls) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(getEntityById(id,cls));
        transaction.commit();
        session.close();
    }

}
