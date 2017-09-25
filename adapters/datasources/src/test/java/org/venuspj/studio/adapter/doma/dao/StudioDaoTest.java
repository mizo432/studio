package org.venuspj.studio.adapter.doma.dao;

import junit.framework.TestCase;
import org.seasar.doma.jdbc.NoCacheSqlFileRepository;
import org.seasar.doma.jdbc.SqlFile;
import org.seasar.doma.jdbc.SqlFileRepository;
import org.seasar.doma.jdbc.dialect.Dialect;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 */
public class StudioDaoTest extends TestCase {

    /** */
    protected SqlFileRepository repository;

    /** */
    protected Dialect dialect;

    /** */
    protected Driver driver;

    /** */
    protected String url;

    /** */
    protected String user;

    /** */
    protected String password;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        repository = new NoCacheSqlFileRepository();
        dialect = new org.seasar.doma.jdbc.dialect.MysqlDialect();
        @SuppressWarnings("unchecked")
        Class<Driver> driverClass = (Class<Driver>) Class.forName("com.mysql.jdbc.Driver");
        driver = driverClass.newInstance();
        DriverManager.registerDriver(driver);
        url = "jdbc:mysql://localhost:3306/studiout";
        user = "studio";
        password = "Shishi1231";
    }

    @Override
    protected void tearDown() throws Exception {
        DriverManager.deregisterDriver(driver);
        super.tearDown();
    }

    /**
     * @param sqlFile
     * @throws Exception
     */
    protected void execute(SqlFile sqlFile) throws Exception {
        Connection connection = getConnection();
        try {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            try {
                statement.execute(sqlFile.getSql());
            } finally {
                statement.close();
            }
        } finally {
            try {
                connection.rollback();
            } finally {
                connection.close();
            }
        }
    }

    /**
     * @return
     * @throws Exception
     */
    protected Connection getConnection() throws Exception {
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * @return method
     * @throws Exception
     */
    protected Method getMethod() throws Exception {
        return getClass().getMethod(getName(), new Class[]{});
    }

    /**
     * @throws Exception
     */
    public void testSelectById() throws Exception {
        SqlFile sqlFile = repository.getSqlFile(getMethod(), "META-INF/org/venuspj/studio/adapter/doma/dao/StudioDao/selectById.sql", dialect);
        execute(sqlFile);
    }

}