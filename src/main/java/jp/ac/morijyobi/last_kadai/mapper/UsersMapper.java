package jp.ac.morijyobi.last_kadai.mapper;

import jp.ac.morijyobi.last_kadai.bean.dto.LoginUserDto;
import jp.ac.morijyobi.last_kadai.bean.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersMapper {

    @Select("SELECT u.id, u.username, u.password, u.name, u.authority_id " +
            "FROM users AS u " +
            "INNER JOIN authorities AS a ON a.id = u.authority_id " +
            "WHERE u.username = #{username}")
    LoginUserDto selectUserByUserName(String username);

    @Insert("INSERT INTO users VALUES (default, #{username}, #{password}, #{name}, #{authorityId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertUser(User user);
}
