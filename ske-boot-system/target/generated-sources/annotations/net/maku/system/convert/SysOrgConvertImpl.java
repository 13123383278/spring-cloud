package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysOrgEntity;
import net.maku.system.vo.SysOrgVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SysOrgConvertImpl implements SysOrgConvert {

    @Override
    public SysOrgEntity convert(SysOrgVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysOrgEntity sysOrgEntity = new SysOrgEntity();

        sysOrgEntity.setId( vo.getId() );
        sysOrgEntity.setCreateTime( vo.getCreateTime() );
        sysOrgEntity.setPid( vo.getPid() );
        sysOrgEntity.setName( vo.getName() );
        sysOrgEntity.setSort( vo.getSort() );
        sysOrgEntity.setLeaderId( vo.getLeaderId() );
        sysOrgEntity.setParentName( vo.getParentName() );

        return sysOrgEntity;
    }

    @Override
    public SysOrgVO convert(SysOrgEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysOrgVO sysOrgVO = new SysOrgVO();

        sysOrgVO.setId( entity.getId() );
        sysOrgVO.setPid( entity.getPid() );
        sysOrgVO.setName( entity.getName() );
        sysOrgVO.setSort( entity.getSort() );
        sysOrgVO.setLeaderId( entity.getLeaderId() );
        sysOrgVO.setCreateTime( entity.getCreateTime() );
        sysOrgVO.setParentName( entity.getParentName() );

        return sysOrgVO;
    }

    @Override
    public List<SysOrgVO> convertList(List<SysOrgEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysOrgVO> list1 = new ArrayList<SysOrgVO>( list.size() );
        for ( SysOrgEntity sysOrgEntity : list ) {
            list1.add( convert( sysOrgEntity ) );
        }

        return list1;
    }
}
