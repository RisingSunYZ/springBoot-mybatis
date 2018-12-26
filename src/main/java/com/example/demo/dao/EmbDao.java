package com.example.demo.dao;

import com.example.demo.model.Emc;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmbDao {

    @Select("select * from emb_t_dictBusType")
    public List<Emc> query();

    @Select("select * from emb_t_dictBusType where emb_c_busTypeID = #{id}")
    public Emc getById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into emb_t_dictBusType (emb_c_busTypeEnName,emb_c_busTypeZhName) values(#{embCBusTypeEnName},#{embCBusTypeZhName})")
    public void insert(Emc emc);

    @Update("update emb_t_dictBusType set emb_c_busTypeEnName =#{embCBusTypeEnName} where emb_c_busTypeID = #{embCBusTypeId}")
    public void update(Emc emc);

}
