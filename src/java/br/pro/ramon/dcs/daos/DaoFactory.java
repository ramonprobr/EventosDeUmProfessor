package br.pro.ramon.dcs.daos;

import br.pro.ramon.dcs.daos.jdbc.EventoDaoJdbc;
import br.pro.ramon.dcs.daos.jdbc.ProfessorDaoJdbc;

public abstract class DaoFactory {

    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://XXX.database.windows.net;database=XXX";
    private static final String USER = "XXX";
    private static final String PASS = "XXX";

    public static ProfessorDao getProfessorDao() throws DaoException {
        return new ProfessorDaoJdbc(DRIVER, URL, USER, PASS);
    }

    public static EventoDao getEventoDao() throws DaoException {
        return new EventoDaoJdbc(DRIVER, URL, USER, PASS);
    }

}
