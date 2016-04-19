/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.ORM.DAOInterface;

import Persistencia.ORM.Util.IGenericDAO;
import com.iaew.encuesta.model.Encuesta;
import java.util.List;

/**
 *
 * @author ang_2
 */
public interface IEncuesta extends IGenericDAO<Encuesta, Integer> {

    /**
     * Una lista con todos las Encuestas registradas.
     *
     * @return List
     */
    public List<Encuesta> listar();

    /**
     * Busca una encuesta por su mail
     *
     * @param email
     * @return Encuesta
     */
    public Encuesta buscar(String email);
}
