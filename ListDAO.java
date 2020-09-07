package employee_list;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ListDAO {

	public List<EmployeesDTO> getList() {
		String sql = "SELECT * FROM employees";
		List<EmployeesDTO> list = new ArrayList<EmployeesDTO>();
		Connection con = null;
		Statement smt = null;
		ResultSet rs = null;
		try {
			con = ConnectionManager.getConnection();
			smt = con.createStatement();
			rs = smt.executeQuery(sql);
			while (rs.next()) {
				EmployeesDTO ldto = new EmployeesDTO();
				ldto.setId(rs.getInt("id"));
				ldto.setName(rs.getString("name"));
				ldto.setDepartment(rs.getString("department"));
				ldto.setStart_date(rs.getString("start_date"));
				list.add(ldto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception ignore) {
				}
			}
			if (smt != null) {
				try {
					smt.close();
				} catch (Exception ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception ignore) {
				}
			}
		}
		return list;
	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ListDAO ldao = new ListDAO();
		List<EmployeesDTO> list = new ArrayList<EmployeesDTO>();
		list = ldao.getList();
		System.out.println(ldao.getList());

		for (int i = 0; i < list.size(); i++) {
			EmployeesDTO data = list.get(i);
			// JSON変換用のクラス
	        ObjectMapper mapper = new ObjectMapper();

	        try {
	            //JSON文字列に変換
	            String json = mapper.writeValueAsString(data);
	            System.out.println(json);
	        } catch (JsonProcessingException e) {
	            e.printStackTrace();
	        }
		}

	}

}
