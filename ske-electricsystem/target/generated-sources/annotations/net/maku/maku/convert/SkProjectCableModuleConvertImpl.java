package net.maku.maku.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.maku.entity.SkProjectCableModuleEntity;
import net.maku.maku.vo.SkProjectCableModuleVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:14+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SkProjectCableModuleConvertImpl implements SkProjectCableModuleConvert {

    @Override
    public SkProjectCableModuleEntity convert(SkProjectCableModuleVO vo) {
        if ( vo == null ) {
            return null;
        }

        SkProjectCableModuleEntity skProjectCableModuleEntity = new SkProjectCableModuleEntity();

        skProjectCableModuleEntity.setId( vo.getId() );
        skProjectCableModuleEntity.setModuleId( vo.getModuleId() );
        skProjectCableModuleEntity.setVoltageLevel( vo.getVoltageLevel() );
        skProjectCableModuleEntity.setCoreNumber( vo.getCoreNumber() );
        skProjectCableModuleEntity.setSection( vo.getSection() );
        skProjectCableModuleEntity.setCableOuterDiameter( vo.getCableOuterDiameter() );
        skProjectCableModuleEntity.setMinimumTurningRadius( vo.getMinimumTurningRadius() );
        skProjectCableModuleEntity.setCableCoilLength( vo.getCableCoilLength() );
        skProjectCableModuleEntity.setCableReelCoilQuantity( vo.getCableReelCoilQuantity() );
        skProjectCableModuleEntity.setVersion( vo.getVersion() );
        skProjectCableModuleEntity.setDeleted( vo.getDeleted() );
        skProjectCableModuleEntity.setCreator( vo.getCreator() );
        skProjectCableModuleEntity.setCreateTime( vo.getCreateTime() );
        skProjectCableModuleEntity.setUpdater( vo.getUpdater() );
        skProjectCableModuleEntity.setUpdateTime( vo.getUpdateTime() );

        return skProjectCableModuleEntity;
    }

    @Override
    public SkProjectCableModuleVO convert(SkProjectCableModuleEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SkProjectCableModuleVO skProjectCableModuleVO = new SkProjectCableModuleVO();

        skProjectCableModuleVO.setId( entity.getId() );
        skProjectCableModuleVO.setModuleId( entity.getModuleId() );
        skProjectCableModuleVO.setVoltageLevel( entity.getVoltageLevel() );
        skProjectCableModuleVO.setCoreNumber( entity.getCoreNumber() );
        skProjectCableModuleVO.setSection( entity.getSection() );
        skProjectCableModuleVO.setCableOuterDiameter( entity.getCableOuterDiameter() );
        skProjectCableModuleVO.setMinimumTurningRadius( entity.getMinimumTurningRadius() );
        skProjectCableModuleVO.setCableCoilLength( entity.getCableCoilLength() );
        skProjectCableModuleVO.setCableReelCoilQuantity( entity.getCableReelCoilQuantity() );
        skProjectCableModuleVO.setVersion( entity.getVersion() );
        skProjectCableModuleVO.setDeleted( entity.getDeleted() );
        skProjectCableModuleVO.setCreator( entity.getCreator() );
        skProjectCableModuleVO.setCreateTime( entity.getCreateTime() );
        skProjectCableModuleVO.setUpdater( entity.getUpdater() );
        skProjectCableModuleVO.setUpdateTime( entity.getUpdateTime() );

        return skProjectCableModuleVO;
    }

    @Override
    public List<SkProjectCableModuleVO> convertList(List<SkProjectCableModuleEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SkProjectCableModuleVO> list1 = new ArrayList<SkProjectCableModuleVO>( list.size() );
        for ( SkProjectCableModuleEntity skProjectCableModuleEntity : list ) {
            list1.add( convert( skProjectCableModuleEntity ) );
        }

        return list1;
    }
}
