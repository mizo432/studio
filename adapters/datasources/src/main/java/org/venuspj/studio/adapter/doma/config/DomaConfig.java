package org.venuspj.studio.adapter.doma.config;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.GreedyCacheSqlFileRepository;
import org.seasar.doma.jdbc.NoCacheSqlFileRepository;
import org.seasar.doma.jdbc.SqlFileRepository;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import static org.venuspj.util.objects2.Objects2.*;

@Component
public class DomaConfig implements Config {
    private DataSource dataSource;

    private Dialect dialect;

    private SqlFileRepository sqlFileRepository;

    public DomaConfig() {
    }

    @Override
    public DataSource getDataSource() {
        return this.dataSource;
    }

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = new TransactionAwareDataSourceProxy(dataSource);
    }

    @Override
    public Dialect getDialect() {
        return this.dialect;
    }

    @Autowired
    public void setDialect(@Value("${doma.dialect}") String domaDialect)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        this.dialect = (Dialect) Class.forName(domaDialect).newInstance();
    }

    @Override
    public SqlFileRepository getSqlFileRepository() {
        return this.sqlFileRepository;
    }

    @Autowired
    public void setSqlFileRepository(@Value("${spring.profiles.active}") String springProfilesActive) {
        // develop モードの時は SQL ファイルがキャッシュされないようにする
        if (equal(springProfilesActive, "develop")) {
            this.sqlFileRepository = new NoCacheSqlFileRepository();
        } else {
            this.sqlFileRepository = new GreedyCacheSqlFileRepository();
        }
    }
}
