package net.maku.storage.properties;

import lombok.Data;

/**
 * 阿里云存储配置项
 *
 * @author flyfish
 * <a href="https://maku.net">MAKU</a>
 */
@Data
public class AliyunStorageProperties {
    private String endPoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
}
