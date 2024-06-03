package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysLogLoginEntity;
import net.maku.system.vo.SysLogLoginVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SysLogLoginConvertImpl implements SysLogLoginConvert {

    @Override
    public SysLogLoginEntity convert(SysLogLoginVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysLogLoginEntity sysLogLoginEntity = new SysLogLoginEntity();

        sysLogLoginEntity.setId( vo.getId() );
        sysLogLoginEntity.setUsername( vo.getUsername() );
        sysLogLoginEntity.setIp( vo.getIp() );
        sysLogLoginEntity.setAddress( vo.getAddress() );
        sysLogLoginEntity.setUserAgent( vo.getUserAgent() );
        sysLogLoginEntity.setStatus( vo.getStatus() );
        sysLogLoginEntity.setOperation( vo.getOperation() );
        sysLogLoginEntity.setCreateTime( vo.getCreateTime() );

        return sysLogLoginEntity;
    }

    @Override
    public SysLogLoginVO convert(SysLogLoginEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysLogLoginVO sysLogLoginVO = new SysLogLoginVO();

        sysLogLoginVO.setId( entity.getId() );
        sysLogLoginVO.setUsername( entity.getUsername() );
        sysLogLoginVO.setIp( entity.getIp() );
        sysLogLoginVO.setAddress( entity.getAddress() );
        sysLogLoginVO.setUserAgent( entity.getUserAgent() );
        sysLogLoginVO.setStatus( entity.getStatus() );
        sysLogLoginVO.setOperation( entity.getOperation() );
        sysLogLoginVO.setCreateTime( entity.getCreateTime() );

        return sysLogLoginVO;
    }

    @Override
    public List<SysLogLoginVO> convertList(List<SysLogLoginEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysLogLoginVO> list1 = new ArrayList<SysLogLoginVO>( list.size() );
        for ( SysLogLoginEntity sysLogLoginEntity : list ) {
            list1.add( convert( sysLogLoginEntity ) );
        }

        return list1;
    }
}
