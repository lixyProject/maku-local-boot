package net.maku.message.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.message.entity.SmsLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 短信日志
*
* @author flyfish
*/
@Mapper
public interface SmsLogDao extends BaseDao<SmsLogEntity> {
	
}