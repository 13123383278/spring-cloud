package net.maku.maku.convert;

import net.maku.maku.entity.SkProjectCableModuleEntity;
import net.maku.maku.vo.SkProjectCableModuleVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
* 电缆模块属性表
*
* @author lpd 1@126.com
* @since 1.0.0 2024-05-28
*/
@Mapper
public interface SkProjectCableModuleConvert {
    SkProjectCableModuleConvert INSTANCE = Mappers.getMapper(SkProjectCableModuleConvert.class);

    SkProjectCableModuleEntity convert(SkProjectCableModuleVO vo);

    SkProjectCableModuleVO convert(SkProjectCableModuleEntity entity);

    List<SkProjectCableModuleVO> convertList(List<SkProjectCableModuleEntity> list);

}