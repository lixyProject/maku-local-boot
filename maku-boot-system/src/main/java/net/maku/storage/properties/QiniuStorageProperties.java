package net.maku.storage.properties;

import lombok.Data;

/**
 * 七牛云存储配置项
 *
 * @author flyfish 
 * <a href="https://maku.net">MAKU</a>
 */
@Data
public class QiniuStorageProperties {
    private String accessKey;
    private String secretKey;
    private String bucketName;
}
