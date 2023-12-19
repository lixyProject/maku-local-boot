package net.maku.quartz.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.quartz.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 定时任务日志
*
* @author flyfish 
*/
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}