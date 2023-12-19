package net.maku.message.service;

import net.maku.framework.common.utils.PageResult;
import net.maku.framework.mybatis.service.BaseService;
import net.maku.message.entity.SmsLogEntity;
import net.maku.message.query.SmsLogQuery;
import net.maku.message.vo.SmsLogVO;

/**
 * 短信日志
 *
 * @author flyfish
 * <a href="https://maku.net">MAKU</a>
 */
public interface SmsLogService extends BaseService<SmsLogEntity> {

    PageResult<SmsLogVO> page(SmsLogQuery query);

}