//package com.verizon.walletapp.WalletApp;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//import java.util.Map;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TransactionJdbc {
//
//	DataSource dataSource;
//	JdbcTemplate jdbcTemplate;
//
//	@Autowired
//	public void setDataSource(DataSource dataSource) {
//		jdbcTemplate = new JdbcTemplate(dataSource);
//	}
//
//	int createTransaction(TransactionDetails transactiondetails) {
//	String query = "insert into transaction_details values(?,?,?,?,?)";
//		return jdbcTemplate.update(query, new Object[] {transactiondetails.transactionid(), transactiondetails.userid(), transactiondetails.transactiontype(), transactiondetails.transactionamount(), transactiondetails.date()});
//	}
//	
//	//print all transaction details
//	// print all transaction details
//	List<TransactionDetails> printTransactionDetails(Integer user_id) {
//	    String query = "select * from transaction_details where user_id = ?";
//	    return jdbcTemplate.query(query, new TransactionMapper(), user_id);
//	}
//
//	
//	class TransactionMapper implements RowMapper<TransactionDetails>{
//
//		@Override
//		public TransactionDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
//			TransactionDetails transactiondetails= new TransactionDetails(rs.getInt("transaction_id"), rs.getInt("user_id"), rs.getString("transaction_type"), rs.getFloat("amount"), rs.getDate("date"));
//			return transactiondetails;
//
//		}
//		
//	}
//}
