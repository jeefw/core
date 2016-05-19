package core.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @框架唯一的升级和技术支持地址：http://www.web898.com
 */
public class JdbcBaseDao extends JdbcDaoSupport {

	@Resource(name = "dataSource")
	public void setDS(DataSource dataSource) {
		setDataSource(dataSource);
	}

}
