package order.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO extends JdbcDaoSupport{


        @Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	public void insertOrder(OrderParams orderParams) {
		String sql = "INSERT INTO Order" +
				"(customerName,orderDate,shippingAddress) VALUES (?, ?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				orderParams.getCustomerName(), orderParams.getOrderDate(),orderParams.getShippingAddress)
		});
             }
        public OrderParams retrieveOrder(CustomerName custName){
String sql = "SELECT * FROM order where customerName="+custName();
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		for(Map<String, Object> row:rows){
			OrderParams ord= new OrderParams();
			orderParams.setOrderDate((String)row.get("OrderDate"));
			orderParams.setShippingAddress((String)row.get("ShippingAddress"));
			result.add(ord);
		}
		
		return result;

}    
public void createNewOrderItem(OrderItems orderItems) {
		String sql = "INSERT INTO OrderItem" +
				"(productName,ProductCode,Quantity) VALUES (?, ?,?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				orderParams.getProductCode(), orderParams.getProductName(),orderParams.getProductCode)
		});
             }
        public OrderItems retrieveOrderItem(ProductCode prdCode){
String sql = "SELECT * FROM order where prdCode="+prdCode();
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		for(Map<String, Object> row:rows){
			OrderItem ord= new OrderItem();
			orderItem.setQuantity((String)row.get("Quantity"));
			orderItem.setProductName((String)row.get("ProductName"));
			result.add(ord);
		}
		
		return result;

}    
	}

























}