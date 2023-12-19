package net.maku.storage.properties;

import lombok.Data;

/**
 * Minio存储配置项
 *
 * @author flyfish
 * <a href="https://maku.net">MAKU</a>
 */
@Data
public class MinioStorageProperties {
    private String endPoint;
    private String accessKey;
    private String secretKey;
    private String bucketName;
}
