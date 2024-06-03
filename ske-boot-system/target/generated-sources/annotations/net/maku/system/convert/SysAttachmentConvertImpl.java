package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysAttachmentEntity;
import net.maku.system.vo.SysAttachmentVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SysAttachmentConvertImpl implements SysAttachmentConvert {

    @Override
    public SysAttachmentEntity convert(SysAttachmentVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysAttachmentEntity sysAttachmentEntity = new SysAttachmentEntity();

        sysAttachmentEntity.setId( vo.getId() );
        sysAttachmentEntity.setCreateTime( vo.getCreateTime() );
        sysAttachmentEntity.setName( vo.getName() );
        sysAttachmentEntity.setUrl( vo.getUrl() );
        sysAttachmentEntity.setSize( vo.getSize() );
        sysAttachmentEntity.setPlatform( vo.getPlatform() );

        return sysAttachmentEntity;
    }

    @Override
    public SysAttachmentVO convert(SysAttachmentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysAttachmentVO sysAttachmentVO = new SysAttachmentVO();

        sysAttachmentVO.setId( entity.getId() );
        sysAttachmentVO.setName( entity.getName() );
        sysAttachmentVO.setUrl( entity.getUrl() );
        sysAttachmentVO.setSize( entity.getSize() );
        sysAttachmentVO.setPlatform( entity.getPlatform() );
        sysAttachmentVO.setCreateTime( entity.getCreateTime() );

        return sysAttachmentVO;
    }

    @Override
    public List<SysAttachmentVO> convertList(List<SysAttachmentEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysAttachmentVO> list1 = new ArrayList<SysAttachmentVO>( list.size() );
        for ( SysAttachmentEntity sysAttachmentEntity : list ) {
            list1.add( convert( sysAttachmentEntity ) );
        }

        return list1;
    }
}
