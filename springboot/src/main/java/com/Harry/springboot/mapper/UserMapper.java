package com.Harry.springboot.mapper;

import com.Harry.springboot.config.vo.UserVo;
import com.Harry.springboot.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * User数据访问层接口
 * @author Harry
 * 2018年7月16日下午5:01:17
 */
@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User> {


    public List<UserVo> getUserList(User user, UserVo userVo);

//	/**
//	 * 通过userid查询
//	 * @param userid
//	 * @return
//	 */
//	public User queryUserByUserid(String userid);
//
//	/**
//	 * 通过userid更新username
//	 * @param map
//	 */
//	public void updateByUserid(HashMap<String,String> map);
}
