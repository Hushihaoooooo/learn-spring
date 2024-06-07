package cn.edu.zust.se.mapper;

import cn.edu.zust.se.model.vo.EquipmentVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EquipmentMapper {

    List<EquipmentVo> getEquipment(@Param("userName") String userName);

    List<EquipmentVo> getAllEquipment();

    void addEquipment(@Param("equipmentVo") EquipmentVo equipmentVo);
}
