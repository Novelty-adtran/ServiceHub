
package com.adtran.servicehub.db.util;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QueryBuilder {

	

	public static PreparedStatement getBvsByUsIdPs(int userStoryId) {
		String sql = "select * from us_bv where usid = ?";

		PreparedStatement ps = null;
		try {
			ps = DBConnectionUtil.getconnection().prepareStatement(sql);
			ps.setInt(1, userStoryId);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("getBvsByUsIdPs query : " + ps.toString());
		return ps;
	}
}
