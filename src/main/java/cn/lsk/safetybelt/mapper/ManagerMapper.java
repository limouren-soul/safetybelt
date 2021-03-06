package cn.lsk.safetybelt.mapper;

import cn.lsk.safetybelt.po.Manager;
import cn.lsk.safetybelt.po.ManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbggenerated
     */
    int countByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbggenerated
     */
    int deleteByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbggenerated
     */
    int insert(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbggenerated
     */
    int insertSelective(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbggenerated
     */
    List<Manager> selectByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbggenerated
     */
    Manager selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Manager record);
}