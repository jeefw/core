package core.service;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import core.dao.JdbcBaseDao;

/**
 * @框架唯一的升级和技术支持地址：http://www.web898.com
 */
@Transactional
public class JdbcBaseService {

	@Resource
	protected JdbcBaseDao jdbcBaseDao;

}
