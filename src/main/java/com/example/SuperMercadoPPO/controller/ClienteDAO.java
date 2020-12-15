package com.example.SuperMercadoPPO.controller;

import com.example.SuperMercadoPPO.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ClienteDAO {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private Cliente cliente;

    public ClienteDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("Mercado-PU");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public List<Cliente> getClientes() {
        return entityManager.createQuery("FROM cliente", Cliente.class).getResultList();
    }

    public Cliente getClienteById( int id) throws Exception {
        Cliente c = entityManager.find(Cliente.class, id);
        if (c != null) {
            return  c;
        } else {
            throw new Exception("O usuário informado não foi encontrado " + id);
        }
    }

    public void insertCliente() throws Exception {
        if (this.cliente != null) {
            entityManager.getTransaction().begin();
            entityManager.persist(cliente);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
        } else {
            throw new Exception("Cliente não foi definido");
        }
    }

    public void alteraCliente() throws Exception {
        if (this.cliente != null) {
            entityManager.getTransaction().begin();
            entityManager.merge(cliente);
            entityManager.getTransaction().commit();

            entityManager.close();
            entityManagerFactory.close();
        }
    }

}
