package com.verizon.walletapp.WalletApp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class WalletOperations {

	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	Scanner sc = new Scanner(System.in);
	final float threshold = 1000;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void operations() {

		do {
			System.out.println("Enter 1 Deposit amount to self account");
			System.out.println("Enter 2 to check balance");

			System.out.println("Enter choice to perform operations");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter a 10 digit user account number");
				String accountnumber = sc.next();
				System.out.println("Enter user id");
				Integer userid = sc.nextInt();
				System.out.println("Enter amount to deposit");
				Float deposit = sc.nextFloat();
				sc.nextLine();
				this.createWallet(new WalletDetails(accountnumber, userid, deposit, threshold));
				break;
			case 2:
				System.out.println("Enter account number to check wallet balance");
				Integer accountno = sc.nextInt();
				System.out.println("Your account balance for your account number is: "+this.checkBalance(accountno));
				break;
				
			case 3:
				System.out.println("Enter user id to get transaction history:");
				Integer idToGetTransactionHistory =sc.nextInt();
				sc.next();
                List<TransactionDetails> transactions = this.getTransactions();
                System.out.println("Your transaction history:");
                for (TransactionDetails transaction : transactions) {
                    System.out.println(transaction);
                }
                break;

			}
			System.out.println("Do you want to perform another operation (Y/N)?");
		} while (sc.next().equalsIgnoreCase("Y"));
	}

	int createWallet(WalletDetails walletdetails) {
		String query = "insert into wallet_details (accountnumber,user_id,balance,threshold) values(?,?,?,?)";
		return jdbcTemplate.update(query, new Object[] { walletdetails.getAccountnumber(), walletdetails.getUserid(),
				walletdetails.getBalance(), walletdetails.getThreshold() });
	}
	
	Float checkBalance(Integer useraccountnumber) {
		String query = "select balance from wallet_details where accountnumber =?";
		return jdbcTemplate.queryForObject(query, new Object[] {useraccountnumber}, Float.class);
	}
	
	List<TransactionDetails> getTransactions() {
        String query = "SELECT * FROM transaction_details";
        return jdbcTemplate.query(query, new TransactionMapper());
    }

	
	
	class WalletMapper implements RowMapper<WalletDetails>{

        @Override
        public WalletDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
            WalletDetails wallet = new WalletDetails(rs.getString("accountnumber"),
                    rs.getInt("user_id"), rs.getFloat("balance"), rs.getFloat("threshold"));
            return wallet;
        }

		
	}

	public class TransactionMapper implements RowMapper<TransactionDetails> {

	    @Override
	    public TransactionDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
	        return new TransactionDetails(
	                rs.getInt("transactionid"),
	                rs.getInt("userid"),
	                rs.getString("transactiontype"),
	                rs.getFloat("transactionamount"),
	                rs.getDate("date"), 
	                rs.getInt("transactionparty")
	        );
	    }
	}
}
