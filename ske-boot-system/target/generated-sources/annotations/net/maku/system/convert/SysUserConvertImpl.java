package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import net.maku.framework.security.user.UserDetail;
import net.maku.system.entity.SysUserEntity;
import net.maku.system.vo.SysUserBaseVO;
import net.maku.system.vo.SysUserExcelVO;
import net.maku.system.vo.SysUserVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SysUserConvertImpl implements SysUserConvert {

    @Override
    public SysUserVO convert(SysUserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysUserVO sysUserVO = new SysUserVO();

        sysUserVO.setId( entity.getId() );
        sysUserVO.setUsername( entity.getUsername() );
        sysUserVO.setPassword( entity.getPassword() );
        sysUserVO.setRealName( entity.getRealName() );
        sysUserVO.setAvatar( entity.getAvatar() );
        sysUserVO.setGender( entity.getGender() );
        sysUserVO.setEmail( entity.getEmail() );
        sysUserVO.setMobile( entity.getMobile() );
        sysUserVO.setOrgId( entity.getOrgId() );
        sysUserVO.setStatus( entity.getStatus() );
        sysUserVO.setSuperAdmin( entity.getSuperAdmin() );
        sysUserVO.setOrgName( entity.getOrgName() );
        sysUserVO.setCreateTime( entity.getCreateTime() );
        if ( sysUserVO.getTransMap() != null ) {
            Map<String, Object> map = entity.getTransMap();
            if ( map != null ) {
                sysUserVO.getTransMap().putAll( map );
            }
        }

        return sysUserVO;
    }

    @Override
    public SysUserEntity convert(SysUserVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysUserEntity sysUserEntity = new SysUserEntity();

        sysUserEntity.setId( vo.getId() );
        sysUserEntity.setCreateTime( vo.getCreateTime() );
        sysUserEntity.setUsername( vo.getUsername() );
        sysUserEntity.setPassword( vo.getPassword() );
        sysUserEntity.setRealName( vo.getRealName() );
        sysUserEntity.setAvatar( vo.getAvatar() );
        sysUserEntity.setGender( vo.getGender() );
        sysUserEntity.setEmail( vo.getEmail() );
        sysUserEntity.setMobile( vo.getMobile() );
        sysUserEntity.setOrgId( vo.getOrgId() );
        sysUserEntity.setSuperAdmin( vo.getSuperAdmin() );
        sysUserEntity.setStatus( vo.getStatus() );
        sysUserEntity.setOrgName( vo.getOrgName() );
        if ( sysUserEntity.getTransMap() != null ) {
            Map<String, Object> map = vo.getTransMap();
            if ( map != null ) {
                sysUserEntity.getTransMap().putAll( map );
            }
        }

        return sysUserEntity;
    }

    @Override
    public SysUserEntity convert(SysUserBaseVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysUserEntity sysUserEntity = new SysUserEntity();

        sysUserEntity.setRealName( vo.getRealName() );
        sysUserEntity.setAvatar( vo.getAvatar() );
        sysUserEntity.setGender( vo.getGender() );
        sysUserEntity.setEmail( vo.getEmail() );
        sysUserEntity.setMobile( vo.getMobile() );

        return sysUserEntity;
    }

    @Override
    public SysUserVO convert(UserDetail userDetail) {
        if ( userDetail == null ) {
            return null;
        }

        SysUserVO sysUserVO = new SysUserVO();

        sysUserVO.setId( userDetail.getId() );
        sysUserVO.setUsername( userDetail.getUsername() );
        sysUserVO.setPassword( userDetail.getPassword() );
        sysUserVO.setRealName( userDetail.getRealName() );
        sysUserVO.setAvatar( userDetail.getAvatar() );
        sysUserVO.setGender( userDetail.getGender() );
        sysUserVO.setEmail( userDetail.getEmail() );
        sysUserVO.setMobile( userDetail.getMobile() );
        sysUserVO.setOrgId( userDetail.getOrgId() );
        sysUserVO.setStatus( userDetail.getStatus() );
        sysUserVO.setSuperAdmin( userDetail.getSuperAdmin() );
        sysUserVO.setCreateTime( userDetail.getCreateTime() );

        return sysUserVO;
    }

    @Override
    public UserDetail convertDetail(SysUserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UserDetail userDetail = new UserDetail();

        userDetail.setId( entity.getId() );
        userDetail.setUsername( entity.getUsername() );
        userDetail.setPassword( entity.getPassword() );
        userDetail.setRealName( entity.getRealName() );
        userDetail.setAvatar( entity.getAvatar() );
        userDetail.setGender( entity.getGender() );
        userDetail.setEmail( entity.getEmail() );
        userDetail.setMobile( entity.getMobile() );
        userDetail.setOrgId( entity.getOrgId() );
        userDetail.setStatus( entity.getStatus() );
        userDetail.setSuperAdmin( entity.getSuperAdmin() );
        userDetail.setTenantId( entity.getTenantId() );
        userDetail.setCreateTime( entity.getCreateTime() );

        return userDetail;
    }

    @Override
    public List<SysUserVO> convertList(List<SysUserEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysUserVO> list1 = new ArrayList<SysUserVO>( list.size() );
        for ( SysUserEntity sysUserEntity : list ) {
            list1.add( convert( sysUserEntity ) );
        }

        return list1;
    }

    @Override
    public List<SysUserExcelVO> convert2List(List<SysUserEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysUserExcelVO> list1 = new ArrayList<SysUserExcelVO>( list.size() );
        for ( SysUserEntity sysUserEntity : list ) {
            list1.add( sysUserEntityToSysUserExcelVO( sysUserEntity ) );
        }

        return list1;
    }

    @Override
    public List<SysUserEntity> convertListEntity(List<SysUserExcelVO> list) {
        if ( list == null ) {
            return null;
        }

        List<SysUserEntity> list1 = new ArrayList<SysUserEntity>( list.size() );
        for ( SysUserExcelVO sysUserExcelVO : list ) {
            list1.add( sysUserExcelVOToSysUserEntity( sysUserExcelVO ) );
        }

        return list1;
    }

    protected SysUserExcelVO sysUserEntityToSysUserExcelVO(SysUserEntity sysUserEntity) {
        if ( sysUserEntity == null ) {
            return null;
        }

        SysUserExcelVO sysUserExcelVO = new SysUserExcelVO();

        sysUserExcelVO.setId( sysUserEntity.getId() );
        sysUserExcelVO.setUsername( sysUserEntity.getUsername() );
        sysUserExcelVO.setRealName( sysUserEntity.getRealName() );
        sysUserExcelVO.setGender( sysUserEntity.getGender() );
        sysUserExcelVO.setEmail( sysUserEntity.getEmail() );
        sysUserExcelVO.setMobile( sysUserEntity.getMobile() );
        sysUserExcelVO.setOrgId( sysUserEntity.getOrgId() );
        sysUserExcelVO.setStatus( sysUserEntity.getStatus() );
        sysUserExcelVO.setSuperAdmin( sysUserEntity.getSuperAdmin() );
        sysUserExcelVO.setCreateTime( sysUserEntity.getCreateTime() );
        if ( sysUserExcelVO.getTransMap() != null ) {
            Map<String, Object> map = sysUserEntity.getTransMap();
            if ( map != null ) {
                sysUserExcelVO.getTransMap().putAll( map );
            }
        }

        return sysUserExcelVO;
    }

    protected SysUserEntity sysUserExcelVOToSysUserEntity(SysUserExcelVO sysUserExcelVO) {
        if ( sysUserExcelVO == null ) {
            return null;
        }

        SysUserEntity sysUserEntity = new SysUserEntity();

        sysUserEntity.setId( sysUserExcelVO.getId() );
        sysUserEntity.setCreateTime( sysUserExcelVO.getCreateTime() );
        sysUserEntity.setUsername( sysUserExcelVO.getUsername() );
        sysUserEntity.setRealName( sysUserExcelVO.getRealName() );
        sysUserEntity.setGender( sysUserExcelVO.getGender() );
        sysUserEntity.setEmail( sysUserExcelVO.getEmail() );
        sysUserEntity.setMobile( sysUserExcelVO.getMobile() );
        sysUserEntity.setOrgId( sysUserExcelVO.getOrgId() );
        sysUserEntity.setSuperAdmin( sysUserExcelVO.getSuperAdmin() );
        sysUserEntity.setStatus( sysUserExcelVO.getStatus() );
        if ( sysUserEntity.getTransMap() != null ) {
            Map<String, Object> map = sysUserExcelVO.getTransMap();
            if ( map != null ) {
                sysUserEntity.getTransMap().putAll( map );
            }
        }

        return sysUserEntity;
    }
}
