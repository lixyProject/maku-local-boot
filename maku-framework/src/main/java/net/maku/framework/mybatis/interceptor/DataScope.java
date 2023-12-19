package net.maku.framework.mybatis.interceptor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 数据范围
 *
 * @author flyfish
 * <a href="https://maku.net">MAKU</a>
 */
@Data
@AllArgsConstructor
public class DataScope {
    private String sqlFilter;

}