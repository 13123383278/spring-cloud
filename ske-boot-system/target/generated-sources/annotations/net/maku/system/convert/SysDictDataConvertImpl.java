package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysDictDataEntity;
import net.maku.system.vo.SysDictDataVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SysDictDataConvertImpl implements SysDictDataConvert {

    @Override
    public SysDictDataVO convert(SysDictDataEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysDictDataVO sysDictDataVO = new SysDictDataVO();

        sysDictDataVO.setId( entity.getId() );
        sysDictDataVO.setDictTypeId( entity.getDictTypeId() );
        sysDictDataVO.setDictLabel( entity.getDictLabel() );
        sysDictDataVO.setLabelClass( entity.getLabelClass() );
        sysDictDataVO.setDictValue( entity.getDictValue() );
        sysDictDataVO.setRemark( entity.getRemark() );
        sysDictDataVO.setSort( entity.getSort() );
        sysDictDataVO.setCreateTime( entity.getCreateTime() );
        sysDictDataVO.setUpdateTime( entity.getUpdateTime() );

        return sysDictDataVO;
    }

    @Override
    public SysDictDataEntity convert(SysDictDataVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysDictDataEntity sysDictDataEntity = new SysDictDataEntity();

        sysDictDataEntity.setId( vo.getId() );
        sysDictDataEntity.setCreateTime( vo.getCreateTime() );
        sysDictDataEntity.setUpdateTime( vo.getUpdateTime() );
        sysDictDataEntity.setDictTypeId( vo.getDictTypeId() );
        sysDictDataEntity.setDictLabel( vo.getDictLabel() );
        sysDictDataEntity.setDictValue( vo.getDictValue() );
        sysDictDataEntity.setLabelClass( vo.getLabelClass() );
        sysDictDataEntity.setRemark( vo.getRemark() );
        sysDictDataEntity.setSort( vo.getSort() );

        return sysDictDataEntity;
    }

    @Override
    public List<SysDictDataVO> convertList(List<SysDictDataEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysDictDataVO> list1 = new ArrayList<SysDictDataVO>( list.size() );
        for ( SysDictDataEntity sysDictDataEntity : list ) {
            list1.add( convert( sysDictDataEntity ) );
        }

        return list1;
    }
}
