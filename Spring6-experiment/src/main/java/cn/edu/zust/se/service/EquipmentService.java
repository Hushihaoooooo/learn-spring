package cn.edu.zust.se.service;

import cn.edu.zust.se.mapper.EquipmentMapper;
import cn.edu.zust.se.mapper.UserMapper;
import cn.edu.zust.se.model.vo.EquipmentVo;
import cn.edu.zust.se.model.vo.UserVo;
import cn.edu.zust.se.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author ShiHaoHu
 * @date 2024/6/7 21:43
 * @description
 */
public class EquipmentService {


    public List<EquipmentVo> getEquipment(String userName) {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
        EquipmentMapper equipmentMapper = sqlSession.getMapper(EquipmentMapper.class);
        List<EquipmentVo> equipmentVos = equipmentMapper.getEquipment(userName);
        sqlSession.commit();
        sqlSession.close();

        return equipmentVos;
    }

    public List<EquipmentVo> getAllEquipment() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
        EquipmentMapper equipmentMapper = sqlSession.getMapper(EquipmentMapper.class);
        List<EquipmentVo> equipmentVos = equipmentMapper.getAllEquipment();
        sqlSession.commit();
        sqlSession.close();

        return equipmentVos;
    }

    public void addEquipment(EquipmentVo equipmentVo) {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
        EquipmentMapper equipmentMapper = sqlSession.getMapper(EquipmentMapper.class);
        equipmentMapper.addEquipment(equipmentVo);
        sqlSession.commit();
        sqlSession.close();

    }
}
