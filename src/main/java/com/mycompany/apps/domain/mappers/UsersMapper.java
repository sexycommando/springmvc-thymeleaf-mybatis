package com.mycompany.apps.domain.mappers;

import com.mycompany.apps.domain.entities.Users;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table public.users
	 *
	 * @mbggenerated Tue Jun 17 18:24:33 JST 2014
	 */
	int deleteByPrimaryKey(@Param("id") Integer id, @Param("username") String username);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table public.users
	 *
	 * @mbggenerated Tue Jun 17 18:24:33 JST 2014
	 */
	int insert(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table public.users
	 *
	 * @mbggenerated Tue Jun 17 18:24:33 JST 2014
	 */
	int insertSelective(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table public.users
	 *
	 * @mbggenerated Tue Jun 17 18:24:33 JST 2014
	 */
	Users selectByPrimaryKey(@Param("id") Integer id, @Param("username") String username);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table public.users
	 *
	 * @mbggenerated Tue Jun 17 18:24:33 JST 2014
	 */
	int updateByPrimaryKeySelective(Users record);

	List<Users> findAllUsers();

	List<String> hasRoles(@Param("username") String username);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table public.users
	 *
	 * @mbggenerated Tue Jun 17 18:24:33 JST 2014
	 */
	int updateByPrimaryKey(Users record);
}
