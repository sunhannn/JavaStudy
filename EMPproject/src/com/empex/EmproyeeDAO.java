package com.empex;
import java.sql.*;
import java.util.*;

/*
 * DAO(Data Access Object)
 *  - 데이터의 처리를 하는 단계
 *  - 자료를 입력받아 데이터베이스에 입력과 조회작업을 함
 *  
 * 
 * 
 */
public class EmproyeeDAO {
	
	// 신규 사용자 등록
	public EmployeeVO getEmployeeresiste(EmployeeVO evo) throws Exception{
		
		String dml = "insert into employee(no, name, jobGrade,department, email) values(employee_seq.nextval, ?, ?, ?, ? )";
		
		String dml = "select "
		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO reval = null;
		ResultSet rs = null;
		
		try {
			// 데이터베이스와 연결
			con = DBUtil.getConnection();
			// 입력받은 사용자 정보를 처리하기위한 sql문 생성
			pstmt = con.prepareStatement(dml);
			
			pstmt.setInt(1,no);
			pstmt.setString(0, dml);
			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobGrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());
			
			// 쿼리문을 수행후 처리 결과를 얻어옴
			int i = pstmt.executeUpdate();
			
			retval = new EmployeeVO();
			
			// 쿼리문의 결과를 EmployeeVO에 저장함
			retval.setStatus(i+" ");
			
			
		}catch(SQLException e) {
			System.out.println("e : ["+e+"]");
		}finally {
			
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException s) {
				System.out.println("s : ["+s+"]");
			}
			
			
		}
		
		return retval;
	}
	
	// 사원들의 번호, 이름을 입력받아 사원 정보를 조회하는 기능구현
	public EmployeeVO getEmployeeCheck(int no, String name) throws Exception{
		
		
		
		
	}
	
	// 사원들의 번호를 입력받아 사원 정보를 조회
public EmployeeVO getEmployeeNo(int no) throws Exception{
		
	}
//사원의 이름을 입력받아 사원 정보를 조회
public EmployeeVO getEmployeeName( String name) throws Exception{
	
}

	 // 전체 사원 목록 조회
public  ArrayList<Employee> getEmployeetotal(){
	
	
}
	
public  ArrayList<String> getColumnName(){
	
	
}


}
