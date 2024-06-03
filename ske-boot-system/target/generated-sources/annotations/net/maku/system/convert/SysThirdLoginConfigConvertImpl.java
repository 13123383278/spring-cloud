package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysThirdLoginConfigEntity;
import net.maku.system.vo.SysThirdLoginConfigVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SysThirdLoginConfigConvertImpl implements SysThirdLoginConfigConvert {

    @Override
    public SysThirdLoginConfigEntity convert(SysThirdLoginConfigVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysThirdLoginConfigEntity sysThirdLoginConfigEntity = new SysThirdLoginConfigEntity();

        sysThirdLoginConfigEntity.setId( vo.getId() );
        sysThirdLoginConfigEntity.setOpenType( vo.getOpenType() );
        sysThirdLoginConfigEntity.setClientId( vo.getClientId() );
        sysThirdLoginConfigEntity.setClientSecret( vo.getClientSecret() );
        sysThirdLoginConfigEntity.setRedirectUri( vo.getRedirectUri() );
        sysThirdLoginConfigEntity.setAgentId( vo.getAgentId() );
        sysThirdLoginConfigEntity.setCreateTime( vo.getCreateTime() );

        return sysThirdLoginConfigEntity;
    }

    @Override
    public SysThirdLoginConfigVO convert(SysThirdLoginConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysThirdLoginConfigVO sysThirdLoginConfigVO = new SysThirdLoginConfigVO();

        sysThirdLoginConfigVO.setId( entity.getId() );
        sysThirdLoginConfigVO.setOpenType( entity.getOpenType() );
        sysThirdLoginConfigVO.setClientId( entity.getClientId() );
        sysThirdLoginConfigVO.setClientSecret( entity.getClientSecret() );
        sysThirdLoginConfigVO.setRedirectUri( entity.getRedirectUri() );
        sysThirdLoginConfigVO.setAgentId( entity.getAgentId() );
        sysThirdLoginConfigVO.setCreateTime( entity.getCreateTime() );

        return sysThirdLoginConfigVO;
    }

    @Override
    public List<SysThirdLoginConfigVO> convertList(List<SysThirdLoginConfigEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysThirdLoginConfigVO> list1 = new ArrayList<SysThirdLoginConfigVO>( list.size() );
        for ( SysThirdLoginConfigEntity sysThirdLoginConfigEntity : list ) {
            list1.add( convert( sysThirdLoginConfigEntity ) );
        }

        return list1;
    }
}
