package net.maku.system.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.system.entity.SysLogOperateEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 操作日志
 *
 * @author flyfish
 * <a href="https://maku.net">MAKU</a>
 */
@Mapper
public interface SysLogOperateDao extends BaseDao<SysLogOperateEntity> {

}