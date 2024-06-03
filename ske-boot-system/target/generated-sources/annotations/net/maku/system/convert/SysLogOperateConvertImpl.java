package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysLogOperateEntity;
import net.maku.system.vo.SysLogOperateVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SysLogOperateConvertImpl implements SysLogOperateConvert {

    @Override
    public SysLogOperateEntity convert(SysLogOperateVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysLogOperateEntity sysLogOperateEntity = new SysLogOperateEntity();

        sysLogOperateEntity.setId( vo.getId() );
        sysLogOperateEntity.setUserId( vo.getUserId() );
        sysLogOperateEntity.setRealName( vo.getRealName() );
        sysLogOperateEntity.setModule( vo.getModule() );
        sysLogOperateEntity.setName( vo.getName() );
        sysLogOperateEntity.setReqUri( vo.getReqUri() );
        sysLogOperateEntity.setReqMethod( vo.getReqMethod() );
        sysLogOperateEntity.setReqParams( vo.getReqParams() );
        sysLogOperateEntity.setIp( vo.getIp() );
        sysLogOperateEntity.setAddress( vo.getAddress() );
        sysLogOperateEntity.setUserAgent( vo.getUserAgent() );
        sysLogOperateEntity.setOperateType( vo.getOperateType() );
        sysLogOperateEntity.setDuration( vo.getDuration() );
        sysLogOperateEntity.setStatus( vo.getStatus() );
        sysLogOperateEntity.setResultMsg( vo.getResultMsg() );
        sysLogOperateEntity.setCreateTime( vo.getCreateTime() );

        return sysLogOperateEntity;
    }

    @Override
    public SysLogOperateVO convert(SysLogOperateEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysLogOperateVO sysLogOperateVO = new SysLogOperateVO();

        sysLogOperateVO.setId( entity.getId() );
        sysLogOperateVO.setUserId( entity.getUserId() );
        sysLogOperateVO.setRealName( entity.getRealName() );
        sysLogOperateVO.setModule( entity.getModule() );
        sysLogOperateVO.setName( entity.getName() );
        sysLogOperateVO.setReqUri( entity.getReqUri() );
        sysLogOperateVO.setReqMethod( entity.getReqMethod() );
        sysLogOperateVO.setReqParams( entity.getReqParams() );
        sysLogOperateVO.setIp( entity.getIp() );
        sysLogOperateVO.setAddress( entity.getAddress() );
        sysLogOperateVO.setUserAgent( entity.getUserAgent() );
        sysLogOperateVO.setOperateType( entity.getOperateType() );
        sysLogOperateVO.setDuration( entity.getDuration() );
        sysLogOperateVO.setStatus( entity.getStatus() );
        sysLogOperateVO.setResultMsg( entity.getResultMsg() );
        sysLogOperateVO.setCreateTime( entity.getCreateTime() );

        return sysLogOperateVO;
    }

    @Override
    public List<SysLogOperateVO> convertList(List<SysLogOperateEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysLogOperateVO> list1 = new ArrayList<SysLogOperateVO>( list.size() );
        for ( SysLogOperateEntity sysLogOperateEntity : list ) {
            list1.add( convert( sysLogOperateEntity ) );
        }

        return list1;
    }
}
