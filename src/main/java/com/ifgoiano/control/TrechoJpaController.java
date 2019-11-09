/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifgoiano.control;

import com.ifgoiano.control.exceptions.NonexistentEntityException;
import com.ifgoiano.model.Trecho;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Raphael Policena
 */
public class TrechoJpaController implements Serializable {

    public TrechoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Trecho trecho) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(trecho);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Trecho trecho) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            trecho = em.merge(trecho);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = trecho.getId();
                if (findTrecho(id) == null) {
                    throw new NonexistentEntityException("The trecho with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Trecho trecho;
            try {
                trecho = em.getReference(Trecho.class, id);
                trecho.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The trecho with id " + id + " no longer exists.", enfe);
            }
            em.remove(trecho);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Trecho> findTrechoEntities() {
        return findTrechoEntities(true, -1, -1);
    }

    public List<Trecho> findTrechoEntities(int maxResults, int firstResult) {
        return findTrechoEntities(false, maxResults, firstResult);
    }

    private List<Trecho> findTrechoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Trecho.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Trecho findTrecho(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Trecho.class, id);
        } finally {
            em.close();
        }
    }

    public int getTrechoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Trecho> rt = cq.from(Trecho.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
