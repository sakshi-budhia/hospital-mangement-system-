/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignemt_8;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author admin
 */
class Operations {
    private static final String url = "jdbc:mysql://localhost:3306/doctor_register";
    private static final String username = "root";
    private static final String password = "sakshi.budhia";
    private static final String className = "com.mysql.jdbc.Driver";
    private static String query;
    
    public boolean addEmployee(int empno, String ename, String department, 
                        String job, double salary) {
        try {
            Class.forName(className);
            Connection con = DriverManager.getConnection(url, username, password);
            query = "insert into Employee values("+ empno +", '"+ ename +"', '"+ 
                    department +"', '"+ job + "', "+ salary +");";
            PreparedStatement prep = con.prepareStatement(query);
            prep.execute();
            con.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void viewEmployees() {
        try {
            Class.forName(className);
            Connection con = DriverManager.getConnection(url, username, password);
            query = "select * from Employee ;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.print("------------------------------------------------------------------");
            System.out.println("\nempno \t ename \t department \t job \t     Salary");
            System.out.println("------------------------------------------------------------------");
            while (rs.next()) {
                System.out.format("%-9s%-11s%-12s%-13s%-8s%n", rs.getString(1), rs.getString(2),
                                rs.getString(3), rs.getString(4), rs.getString(5));
            }
            System.out.println("------------------------------------------------------------------");
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean searchEmployee(String name) {
        try {
            Class.forName(className);
            Connection con = DriverManager.getConnection(url, username, password);
            query = "select * from Employee where ename='"+ name +"';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.print("------------------------------------------------------------------");
            System.out.println("\nempno \t ename \t department \t job \t     Salary");
            System.out.println("------------------------------------------------------------------");
            while (rs.next()) {
                System.out.format("%-9s%-11s%-12s%-13s%-8s%n", rs.getString(1), rs.getString(2),
                                rs.getString(3), rs.getString(4), rs.getString(5));
            }
            System.out.println("------------------------------------------------------------------");
            con.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean updateEmployee(int empno, String ename, String department,
                        String job, double salary) {
        try {
            Class.forName(className);
            Connection con = DriverManager.getConnection(url, username, password);
            query = "update Employee set empno="+ empno +", ename='"+ ename +"', "+
                "department='"+department +"', job='"+ job +"', salary="+
                salary +" where empno="+ empno +";";
            PreparedStatement prep = con.prepareStatement(query);
            prep.execute();
            con.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean removeEmployee(int empno) {
        try {
            Class.forName(className);
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            query = "delete from Employee where empno="+ empno +";";
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static Operations op = new Operations();

	public static void printActions() {
		System.out.print("\n1. Add employee details"+
							"\n2. View the employee table"+
							"\n3. Edit employee details"+
							"\n4. Remove employee"+
							"\n5. Search employee"+
							"\n6. Exit"+
							"\nEnter your choice: ");
	}

    public static void main(String[] args) {
        boolean exit = false;
        int choice;
        while (!exit) {
        	printActions();
        	choice = Integer.parseInt(sc.nextLine());
        	switch(choice) {
	        	case 1:
	        		insert();
	        		break;
	        	case 2:
	        		op.viewEmployees();
	        		break;
	        	case 3:
	        		edit();
	        		break;
	        	case 4:
	        		remove();
	        		break;
	        	case 5:
	        		search();
	        		break;
	        	case 6:
	        		exit = true;
	        		break;
	        }
        }
    }

    private static void insert() {
    	String name, department, job;
    	int no;
    	double salary;
    	System.out.print("\nEnter employee no: ");
    	no = Integer.parseInt(sc.nextLine());
    	System.out.print("\nEnter name: ");
    	name = sc.nextLine();
    	System.out.print("\nEnter department: ");
    	department = sc.nextLine();
    	System.out.print("\nEnter job: ");
    	job = sc.nextLine();
    	System.out.print("\nEnter salary: ");
    	salary = Double.parseDouble(sc.nextLine());
    	if (op.addEmployee(no, name, department, job, salary))
    		System.out.println("\nInsertion successful");
    	else
    		System.out.println("\nError inserting employee");
    }

    private static void edit() {
    	String name, department, job;
    	int no;
    	double salary;
    	System.out.print("\nEnter employee no: ");
    	no = Integer.parseInt(sc.nextLine());
    	System.out.print("\nEnter name: ");
    	name = sc.nextLine();
    	System.out.print("\nEnter department: ");
    	department = sc.nextLine();
    	System.out.print("\nEnter job: ");
    	job = sc.nextLine();
    	System.out.print("\nEnter salary: ");
    	salary = Double.parseDouble(sc.nextLine());
    	if (op.updateEmployee(no, name, department, job, salary))
    		System.out.println("\nUpdated successfully");
    	else
    		System.out.println("\nError updating employee");	
    }

    private static void remove() {
    	int no;
    	System.out.print("\nEnter employee no: ");
    	no = Integer.parseInt(sc.nextLine());
    	if (op.removeEmployee(no))
    		System.out.println("\nSuccessfully removed employee");
    	else
    		System.out.println("\nError removing employee");		
    }

    private static void search() {
    	String name;
    	System.out.print("\nEnter name: ");
    	name = sc.nextLine();
    	if (!op.searchEmployee(name))
    		System.out.println("\nEmployee not found");
    }
}
