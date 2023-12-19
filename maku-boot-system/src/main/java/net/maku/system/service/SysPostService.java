package net.maku.system.service;

import net.maku.framework.common.utils.PageResult;
import net.maku.framework.mybatis.service.BaseService;
import net.maku.system.entity.SysPostEntity;
import net.maku.system.query.SysPostQuery;
import net.maku.system.vo.SysPostVO;

import java.util.List;

/**
 * 岗位管理
 *
 * @author flyfish
 * <a href="https://maku.net">MAKU</a>
 */
public interface SysPostService extends BaseService<SysPostEntity> {

    PageResult<SysPostVO> page(SysPostQuery query);

    List<SysPostVO> getList();

    void save(SysPostVO vo);

    void update(SysPostVO vo);

    void delete(List<Long> idList);
}