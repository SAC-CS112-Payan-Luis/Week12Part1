// Fig. 9.4: CommissionEmployee.java 
// CommissionEmployee class represents an employee paid a 
// percentage of gross sales. 
public class ComissionEmployee extends Object
{
	 private final String firstName;                        
	 private final String lastName;                         
	 private final String socialSecurityNumber;             
	 private double grossSales; // gross weekly sales       
	 private double commissionRate; // commission percentage
	 
	 // five-argument constructor                                
	 public CommissionEmployee(String firstName, String lastName, 
			 String socialSecurityNumber, double grossSales,      
			 double commissionRate) 
	 {
		// implicit call to Object's default constructor occurs here   
	
		 // if grossSales is invalid throw exception 
		 if (grossSales < 0.0) 
			 throw new IllegalArgumentException( 
					 "Gross sales must be >= 0.0"); 
		 
		 // if commissionRate is invalid throw exception 
		 if (commissionRate <= 0.0 || commissionRate >= 1.0) 
			 throw new IllegalArgumentException( 
					 "Commission rate must be > 0.0 and < 1.0"); 
		 
		 this.firstName = firstName;                                    
		 this.lastName = lastName;                                    
		 this.socialSecurityNumber = socialSecurityNumber;         
		 this.grossSales = grossSales; 
		 this.commissionRate = commissionRate; 
	 } // end constructor

	// return first name 
	 public String getFirstName() 
	 { 
		 return firstName;    
		 }
	 
	 // return last name 
	 public String getLastName() 
	 { 
		 return lastName; 
		 }

	 // return social security number
	 public String getSocialSecurityNumber() 
	 { 
		 return socialSecurityNumber; 
		 }
	 // set gross sales amount 
	 public void setGrossSales(double grossSales)    { 
		 if (grossSales < 0.0) 
			 throw new IllegalArgumentException( 
					 "Gross sales must be >= 0.0");
		 this.grossSales = grossSales;    } 
	 
	 // return gross sales amount 
	 public double getGrossSales()    { 
		 return grossSales;    
		 } 
   
	 // set commission rate 
	 public void setCommissionRate(double commissionRate)
	 {
		 if (commissionRate <= 0.0 || commissionRate >= 1.0) 
			 throw new IllegalArgumentException( 
					 "Commission rate must be > 0.0 and < 1.0");
		 this.commissionRate = commissionRate;    }
	 
	 // return commission rate
	 public double getCommissionRate() 
	 { 
		 return commissionRate; 
		 } 
	 
	    // calculate earning 
	    public double earnings(){
	        return commissionRate * GrossSales;
	    }
	    
	    //return string representaion of commissionemployee object 
	    @Override // indicates that this method overrides a super method 
	    public String toString(){
	        return String.format("%s %s%n%s: %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
	                "commission employee", firstName, lastName, "social security number", socialSecurityNumber, 
	                "gross sales", grossSales, "commission rate", commissionRate);
	    } 
	} // end class CommissionEmployee 


//Fig. 9.5: CommissionEmployeeTest.java 
// CommissionEmployee class test program.
public class CommissionEmployeeTest  { 
	public static void main(String[] args) 
	{ 
		  //instantiate CommissionEmployee object 
        CommissionEmployee employee = new CommissionEmployee(
        "Sue", "Jones", "222-22-222", 10000, .06);
        
        // get commission employee data 
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last Name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social Security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        
        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);
        
        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);
    }  // end main
}   // end class CommissionEmployee Test 


//Fig. 9.6: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class represents an employee who receives 
// a base salary in addition to commission. 
public class BasePlusCommissionEmployee 
{ 
	private final String firstName; 
	private final String lastName; 
	private final String socialSecurityNumber; 
	private double grossSales; // gross weekly sales 
	private double commissionRate; // commission percentage
	private double baseSalary; //base salary per week
	
	 // six-argument constructor 
	public BasePlusCommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, 
			double commissionRate, double baseSalary)
	 { 
		// implicit call to Object's default constructor occurs here
		// if grossSales is invalid throw exception 
		if (grossSales < 0.0) 
			throw new IllegalArgumentException( 
					"Gross sales must be >= 0.0");
		// if commissionRate is invalid throw exception 
		if (commissionRate <= 0.0 || commissionRate >= 1.0) 
			throw new IllegalArgumentException( 
					"Commission rate must be > 0.0 and < 1.0"); 
		
		// if base salary is invalid throw exception 
        if (baseSalary < 0.0)
                throw new IllegalArgumentException(
                "Base salary must be >= 0.0");
        
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.socialSecurityNumber = socialSecurityNumber; 
        this.grossSales = grossSales; 
        this.commissionRate = commissionRate; 
        this.baseSalary = baseSalary;
	 } // end constructor
	// return first name 
	public String getFirstName() 
	{ 
		return firstName; 
		}
	// return last name 
	public String getLastName() 
	{ 
		return lastName; 
		} 
	// return social security number 
	public String getSocialSecurityNumber() 
	{ 
		return socialSecurityNumber; 
		} 
	// set gross sales amount 
	public void setGrossSales(double grossSales) 
	{ 
		if (grossSales < 0.0) 
			throw new IllegalArgumentException( 
					"Gross sales must be >= 0.0"); 
		this.grossSales = grossSales; 
		} 
	// return gross sales amount 
	public double getGrossSales()   
	{ 
		return grossSales; 
		} 
	// set commission rate 
	public void setCommissionRate(double commissionRate) 
	{ 
		if (commissionRate <= 0.0 || commissionRate >= 1.0) 
			throw new IllegalArgumentException( 
					"Commission rate must be > 0.0 and < 1.0");
		this.commissionRate = commissionRate; 
		} 
	
	// return commission rate 
	public double getCommissionRate() 
	{ 
		return commissionRate; 
		}
	
	// set base salary 
    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
            "Base Salary must be >= 0.0");
        this.baseSalary = baseSalary;
        // return base salary 
        public double getBaseSalary(){
            return baseSalary;
        }
        // calculate earnings 
        public double earnings(){
            return baseSalary + (commissionRate * grossSales);
        }
        // return string representaion of basePlusCommissionEmployee 
        @Override
        public String toString(){
            return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
                    " base-salaried commission employee", firstName, lastName, 
                    "social security number", socialSecurityNumber, 
                    "gross sales", grossSales, "commission rate", commissionRate,
                    "base salary", baseSalary);
        }
    } // end class BasePlusCommissionEmployee

    
 // Fig. 9.7: BasePlusCommissionEmployeeTest.java 
    // BasePlusCommissionEmployee test program. 
    public static void main(String[] args) {
        // instantiates BasePlusCommissionEmployee object 
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
        "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        
        // get based salaried commision employee data 
        System.out.printf("Employee information obrained by get methods:%n");
        System.out.printf("%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social Secuirty Number", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());
        
        employee.setBaseSalary(1000);
        
        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee.toString());
    } // end main    
} // end class BasePlusCommissionEmployeeTest 





//Fig. 9.8: BasePlusCommissionEmployee.java 
// private superclass members cannot be accessed in a subclass. 
public class BasePlusCommissionEmployee extends CommissionEmployee 
{
  private double baseSalary;
  
  // six-argument constructor 
  public BasePlusCommissionEmployee(String firstName, String lastName, 
    String socialSecurityNumber, double grossSales, 
    double commissionRate, double baseSalary)
    {
      super(firstName, lastName, socialSecurityNumber, 
        grossSales, commissionRate);
        
        if (baseSalary < 0.0)
          throw new IllegalArgumentExpection(
            "Base salary must be >= 0.0");
            
            this.baseSalary = baseSalary;
      }
      
      public void setBaseSalary(double baseSalary)
      {
        if(baseSalary < 0.0)
        throw new IllegalArgumentExpection(
            "Base salary must be >= 0.0");
            this.baseSalary = baseSalary;
        }
        
        public double getBaseSalary()
        {
          return baseSalary;
         }
         
         @Override
         public double earnings()
         {
          return baseSalary() + super.earnings();
         }
         
         @Override 
         public String toString()
         {
          return String format("%s: %s %s%n%s: %s%n%s: %.2f%n%s, 
                " base-salaried", super.toString(), "base salary", getBaseSalary());
           }
           
        } //end class BasePlusCommissionEmployee 

// Received
