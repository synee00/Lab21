package co.grandcircus.coffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.coffeeShop.User;

@Repository
public class ItemsDao {
	/*
	 * Data Access Object is basically an object or an interface that provides access to an underlying database
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<Items> findAll()
	{
		String sql = "SELECT * FROM items";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Items.class));
	}
	
	public Items findByName(String name)
	{
		String sql = "SELECT * FROM items WHERE name = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Items.class), name);
	}
	
}
