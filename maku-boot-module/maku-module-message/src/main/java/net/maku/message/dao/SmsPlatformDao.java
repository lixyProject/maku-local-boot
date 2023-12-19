package net.maku.message.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.message.entity.SmsPlatformEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 短信平台
*
* @author flyfish
*/
@Mapper
public interface SmsPlatformDao extends BaseDao<SmsPlatformEntity> {
	
}