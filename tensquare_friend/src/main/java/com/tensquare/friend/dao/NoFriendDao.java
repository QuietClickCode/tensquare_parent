package com.tensquare.friend.dao;

import com.tensquare.friend.pojo.NoFriend;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 非好友数据访问层
 */
public interface NoFriendDao extends JpaRepository<NoFriend,String> {



}
