package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysDictTypeEntity;
import net.maku.system.vo.SysDictTypeVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SysDictTypeConvertImpl implements SysDictTypeConvert {

    @Override
    public SysDictTypeVO convert(SysDictTypeEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysDictTypeVO sysDictTypeVO = new SysDictTypeVO();

        sysDictTypeVO.setId( entity.getId() );
        sysDictTypeVO.setDictType( entity.getDictType() );
        sysDictTypeVO.setDictName( entity.getDictName() );
        sysDictTypeVO.setRemark( entity.getRemark() );
        sysDictTypeVO.setSort( entity.getSort() );
        sysDictTypeVO.setCreateTime( entity.getCreateTime() );
        sysDictTypeVO.setUpdateTime( entity.getUpdateTime() );
        sysDictTypeVO.setDictSource( entity.getDictSource() );
        sysDictTypeVO.setDictSql( entity.getDictSql() );

        return sysDictTypeVO;
    }

    @Override
    public SysDictTypeEntity convert(SysDictTypeVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysDictTypeEntity sysDictTypeEntity = new SysDictTypeEntity();

        sysDictTypeEntity.setId( vo.getId() );
        sysDictTypeEntity.setCreateTime( vo.getCreateTime() );
        sysDictTypeEntity.setUpdateTime( vo.getUpdateTime() );
        sysDictTypeEntity.setDictType( vo.getDictType() );
        sysDictTypeEntity.setDictName( vo.getDictName() );
        sysDictTypeEntity.setRemark( vo.getRemark() );
        sysDictTypeEntity.setSort( vo.getSort() );
        sysDictTypeEntity.setDictSource( vo.getDictSource() );
        sysDictTypeEntity.setDictSql( vo.getDictSql() );

        return sysDictTypeEntity;
    }

    @Override
    public List<SysDictTypeVO> convertList(List<SysDictTypeEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysDictTypeVO> list1 = new ArrayList<SysDictTypeVO>( list.size() );
        for ( SysDictTypeEntity sysDictTypeEntity : list ) {
            list1.add( convert( sysDictTypeEntity ) );
        }

        return list1;
    }
}
