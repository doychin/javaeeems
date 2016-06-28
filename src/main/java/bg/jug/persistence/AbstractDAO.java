package bg.jug.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Dmitry Alexandrov on 28.06.16.
 */
public class AbstractDAO {

    @PersistenceContext
    protected EntityManager em;
}
