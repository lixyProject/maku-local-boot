package net.maku.quartz.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.quartz.entity.ScheduleJobEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 定时任务
*
* @author flyfish
*/
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
}