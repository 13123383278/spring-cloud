package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysThirdLoginEntity;
import net.maku.system.vo.SysThirdLoginVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SysThirdLoginConvertImpl implements SysThirdLoginConvert {

    @Override
    public SysThirdLoginEntity convert(SysThirdLoginVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysThirdLoginEntity sysThirdLoginEntity = new SysThirdLoginEntity();

        sysThirdLoginEntity.setId( vo.getId() );
        sysThirdLoginEntity.setOpenType( vo.getOpenType() );
        sysThirdLoginEntity.setOpenId( vo.getOpenId() );
        sysThirdLoginEntity.setUsername( vo.getUsername() );
        sysThirdLoginEntity.setUserId( vo.getUserId() );
        sysThirdLoginEntity.setTenantId( vo.getTenantId() );
        sysThirdLoginEntity.setCreateTime( vo.getCreateTime() );

        return sysThirdLoginEntity;
    }

    @Override
    public SysThirdLoginVO convert(SysThirdLoginEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysThirdLoginVO sysThirdLoginVO = new SysThirdLoginVO();

        sysThirdLoginVO.setId( entity.getId() );
        sysThirdLoginVO.setOpenType( entity.getOpenType() );
        sysThirdLoginVO.setOpenId( entity.getOpenId() );
        sysThirdLoginVO.setUsername( entity.getUsername() );
        sysThirdLoginVO.setUserId( entity.getUserId() );
        sysThirdLoginVO.setTenantId( entity.getTenantId() );
        sysThirdLoginVO.setCreateTime( entity.getCreateTime() );

        return sysThirdLoginVO;
    }

    @Override
    public List<SysThirdLoginVO> convertList(List<SysThirdLoginEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysThirdLoginVO> list1 = new ArrayList<SysThirdLoginVO>( list.size() );
        for ( SysThirdLoginEntity sysThirdLoginEntity : list ) {
            list1.add( convert( sysThirdLoginEntity ) );
        }

        return list1;
    }
}
