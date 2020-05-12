
package generics;

import javax.persistence.EntityManager;

/**
 *
 * @author Gary Roberts 20152131 Lauriann Comrie 20161630
 */
public class Generics<T> {

    public Boolean saveEntity(T entity, EntityManager em) {
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            em.close();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return false;
        }
        
    }

}
