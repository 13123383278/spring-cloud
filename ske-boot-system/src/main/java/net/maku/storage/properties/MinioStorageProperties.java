package net.maku.storage.properties;

import lombok.Data;

/**
 * Minio存储配置项
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://fjshanke.cn">MAKU</a>
 */
@Data
public class MinioStorageProperties {
    private String endPoint;
    private String accessKey;
    private String secretKey;
    private String bucketName;
}
