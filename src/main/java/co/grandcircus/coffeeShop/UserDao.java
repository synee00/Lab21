package co.grandcircus.coffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.coffeeShop.User;

@Repository
public class UserDao {
	
	/*
	 * Data Access Object is basically an object or an interface that provides access to an underlying database
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<User> findAll()
	{
		String sql = "SELECT * FROM users";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
	}
	
	public User findByName(String name)
	{
		String sql = "SELECT * FROM users WHERE name = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), name);
	}
	
	public void create(User user)
	{
		String sql = "INSERT INTO users (fname, lname, email, number, password) VALUES (?,?,?,?,?)";
		jdbcTemplate.update(sql, user.getFname(), user.getLname(), user.getEmail(), user.getNumber(), user.getPassword());

	}
	
	public void delete(Long id)
	{
		String sql = "DELETE FROM users WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

}
