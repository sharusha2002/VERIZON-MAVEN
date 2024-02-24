package records;

record Shirts(Integer shirtid, String shirtname, Integer shirtsize) {
	public boolean equals(Object obj) {
		if(obj instanceof Shirts) {
			return this.shirtname().equals(((Shirts)obj).shirtname());
		}
		else {
		return false;
		}
	}
}

