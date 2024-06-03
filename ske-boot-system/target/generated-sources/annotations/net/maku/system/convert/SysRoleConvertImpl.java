package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysRoleEntity;
import net.maku.system.vo.SysRoleVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SysRoleConvertImpl implements SysRoleConvert {

    @Override
    public SysRoleVO convert(SysRoleEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysRoleVO sysRoleVO = new SysRoleVO();

        sysRoleVO.setId( entity.getId() );
        sysRoleVO.setName( entity.getName() );
        sysRoleVO.setRoleCode( entity.getRoleCode() );
        sysRoleVO.setRemark( entity.getRemark() );
        sysRoleVO.setDataScope( entity.getDataScope() );
        sysRoleVO.setCreateTime( entity.getCreateTime() );

        return sysRoleVO;
    }

    @Override
    public SysRoleEntity convert(SysRoleVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysRoleEntity sysRoleEntity = new SysRoleEntity();

        sysRoleEntity.setId( vo.getId() );
        sysRoleEntity.setCreateTime( vo.getCreateTime() );
        sysRoleEntity.setName( vo.getName() );
        sysRoleEntity.setRoleCode( vo.getRoleCode() );
        sysRoleEntity.setRemark( vo.getRemark() );
        sysRoleEntity.setDataScope( vo.getDataScope() );

        return sysRoleEntity;
    }

    @Override
    public List<SysRoleVO> convertList(List<SysRoleEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysRoleVO> list1 = new ArrayList<SysRoleVO>( list.size() );
        for ( SysRoleEntity sysRoleEntity : list ) {
            list1.add( convert( sysRoleEntity ) );
        }

        return list1;
    }
}
