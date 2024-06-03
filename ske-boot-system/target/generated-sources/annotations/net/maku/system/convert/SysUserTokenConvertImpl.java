package net.maku.system.convert;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysUserTokenEntity;
import net.maku.system.vo.SysUserTokenVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-29T16:12:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class SysUserTokenConvertImpl implements SysUserTokenConvert {

    @Override
    public SysUserTokenEntity convert(SysUserTokenVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysUserTokenEntity sysUserTokenEntity = new SysUserTokenEntity();

        sysUserTokenEntity.setAccessToken( vo.getAccessToken() );
        sysUserTokenEntity.setAccessTokenExpire( vo.getAccessTokenExpire() );
        sysUserTokenEntity.setRefreshToken( vo.getRefreshToken() );
        sysUserTokenEntity.setRefreshTokenExpire( vo.getRefreshTokenExpire() );

        return sysUserTokenEntity;
    }

    @Override
    public SysUserTokenVO convert(SysUserTokenEntity entity) {
        if ( entity == null ) {
            return null;
        }

        String accessToken = null;
        String refreshToken = null;
        LocalDateTime accessTokenExpire = null;
        LocalDateTime refreshTokenExpire = null;

        accessToken = entity.getAccessToken();
        refreshToken = entity.getRefreshToken();
        accessTokenExpire = entity.getAccessTokenExpire();
        refreshTokenExpire = entity.getRefreshTokenExpire();

        SysUserTokenVO sysUserTokenVO = new SysUserTokenVO( accessToken, refreshToken, accessTokenExpire, refreshTokenExpire );

        return sysUserTokenVO;
    }
}
