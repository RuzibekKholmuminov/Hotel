package org.example.repository;

import org.example.dto.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class RoomRepository {
    public int addRoom(Room room) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(room);
        transaction.commit();

        session.close();
        factory.close();
        return 0;
    }

    public List<Room> roomList() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Room> roomList = session.createQuery("from Room ", Room.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return roomList;
    }

    public int deleteRoom(Integer id) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Room> roomList = session.createQuery("delete from  Room where id = " + id + "", Room.class).getResultList();
        transaction.commit();

        session.close();
        factory.close();
        return 1;
    }

    public int updateRoom(Room room) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(room);
        transaction.commit();

        session.close();
        factory.close();
        return 1;
    }

    public Room find(Integer id) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Room roomList = session.createQuery("from Room where id = " + id + "", Room.class).getSingleResult();
        transaction.commit();

        session.close();
        factory.close();
        return roomList;
    }
}