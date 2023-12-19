package net.maku.system.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.system.entity.SysAttachmentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 附件管理
 *
 * @author flyfish 
 * <a href="https://maku.net">MAKU</a>
 */
@Mapper
public interface SysAttachmentDao extends BaseDao<SysAttachmentEntity> {

}