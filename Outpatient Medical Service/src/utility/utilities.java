package utility;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Gary Roberts
 */
public class utilities {

    public EntityManager getEntityManager() {
        try {
            Map properties = new HashMap();
            properties.put("javax.persistence.jdbc.url", this);
            properties.put("javax.persistence.jdbc.user", this);
            properties.put("javax.persistence.jdbc.password", this);
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(" ", properties);
            EntityManager em = emf.createEntityManager();
            return em;

        } catch (Exception ex) {

        }
        return null;
    }
}
