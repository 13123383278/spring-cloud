package net.maku.maku.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.framework.mybatis.service.impl.BaseServiceImpl;
import net.maku.maku.convert.SkProjectCableModuleConvert;
import net.maku.maku.entity.SkProjectCableModuleEntity;
import net.maku.maku.query.SkProjectCableModuleQuery;
import net.maku.maku.vo.SkProjectCableModuleVO;
import net.maku.maku.dao.SkProjectCableModuleDao;
import net.maku.maku.service.SkProjectCableModuleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 电缆模块属性表
 *
 * @author lpd 1@126.com
 * @since 1.0.0 2024-05-28
 */
@Service
@AllArgsConstructor
public class SkProjectCableModuleServiceImpl extends BaseServiceImpl<SkProjectCableModuleDao, SkProjectCableModuleEntity> implements SkProjectCableModuleService {

    @Override
    public PageResult<SkProjectCableModuleVO> page(SkProjectCableModuleQuery query) {
        IPage<SkProjectCableModuleEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SkProjectCableModuleConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SkProjectCableModuleEntity> getWrapper(SkProjectCableModuleQuery query){
        LambdaQueryWrapper<SkProjectCableModuleEntity> wrapper = Wrappers.lambdaQuery();

        return wrapper;
    }

    @Override
    public void save(SkProjectCableModuleVO vo) {
        SkProjectCableModuleEntity entity = SkProjectCableModuleConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(SkProjectCableModuleVO vo) {
        SkProjectCableModuleEntity entity = SkProjectCableModuleConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}