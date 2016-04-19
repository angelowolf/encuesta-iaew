/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.ORM.DAOImplementacion;

import Persistencia.ORM.DAOInterface.IEncuesta;
import Persistencia.ORM.Util.GenericDAO;
import com.iaew.encuesta.model.Encuesta;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;

/**
 *
 * @author ang_2
 */
public class EncuestaDAO extends GenericDAO<Encuesta, Integer> implements IEncuesta {

    private static final Logger LOG = Logger.getLogger(EncuestaDAO.class);

    @Override
    public Encuesta buscar(String email) {
        Session session = getHibernateTemplate();
        List<Encuesta> objetos = new ArrayList<>();
        try {
            String sql = "from Encuesta where email = :email";
            objetos = session.createQuery(sql).setParameter("email", email).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar Encuesta", e);
        }
        if (!objetos.isEmpty()) {
            return objetos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<Encuesta> listar() {
        Session session = getHibernateTemplate();
        List<Encuesta> objetos = new ArrayList<>();
        try {
            String sql = "from Encuesta";
            objetos = session.createQuery(sql).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las Encuestas.", e);
        }
        return objetos;
    }

}
