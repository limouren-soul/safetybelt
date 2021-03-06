package cn.lsk.safetybelt.mapper;

import cn.lsk.safetybelt.po.Device;
import cn.lsk.safetybelt.po.DeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    int countByExample(DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    int deleteByExample(DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    int insert(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    int insertSelective(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    List<Device> selectByExample(DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    Device selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Device record);
}