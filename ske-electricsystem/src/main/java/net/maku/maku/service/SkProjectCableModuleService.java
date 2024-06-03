package net.maku.maku.service;

import net.maku.framework.common.utils.PageResult;
import net.maku.framework.mybatis.service.BaseService;
import net.maku.maku.vo.SkProjectCableModuleVO;
import net.maku.maku.query.SkProjectCableModuleQuery;
import net.maku.maku.entity.SkProjectCableModuleEntity;

import java.util.List;

/**
 * 电缆模块属性表
 *
 * @author lpd 1@126.com
 * @since 1.0.0 2024-05-28
 */
public interface SkProjectCableModuleService extends BaseService<SkProjectCableModuleEntity> {

    PageResult<SkProjectCableModuleVO> page(SkProjectCableModuleQuery query);

    void save(SkProjectCableModuleVO vo);

    void update(SkProjectCableModuleVO vo);

    void delete(List<Long> idList);
}