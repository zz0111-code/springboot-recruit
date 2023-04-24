package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * tk.mybatis 通用的 Mapper 接口
 *
 * @see tk.mybatis.mapper
 */

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
