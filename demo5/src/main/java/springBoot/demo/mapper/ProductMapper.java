/*
    CreateUser:fus
    CreateDate:2018年7月2日 22:26:00
    my learning spring boot
*/

package springBoot.demo.mapper;

import org.apache.ibatis.annotations.*;
import springBoot.demo.entity.ProductEntity;
import springBoot.demo.mappersql.ProductSql;
import springBoot.demo.param.ProductParam;

import java.util.List;

public interface ProductMapper {

    @Insert("")
    int save(ProductEntity productEntity);

    @Delete("")
    int delete(Long id);

    @Update("")
    int update(ProductEntity productEntity);

    @Select("")
    ProductEntity getOne(Long id);

    @SelectProvider(type = ProductSql.class, method = "getList")
    default List<ProductEntity> getList(ProductParam productParam) {
        return null;
    }

    @SelectProvider(type = ProductSql.class, method = "getCount")
    Long getCount(ProductParam productParam);


}
