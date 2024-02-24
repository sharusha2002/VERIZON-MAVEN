package com.verizon.springstarter;

public class CivilEngineer {

	Address address;
	
		public CivilEngineer(Address address) {
		super();
		this.address = address;
	}
		
		public CivilEngineer() {
			
		}
		
		

		@Override
		public String toString() {
			return "CivilEngineer [address=" + address + "]";
		}

		void workForWages() {
			System.out.println("Civil engineers also work for wages...");
			System.out.println(this);
		}
}
