package com.example.SQL;

import java.util.List;

public class Source {
	
	/**
	 * Get Users from DB with given username
	 * @param req HTTPRequest containen the needed attribute sql_usernames
	 */
	public void getUsers(final javax.servlet.http.HttpServletRequest req) {
		final List<String> usernames = SQLInjection.getUserNames(req.getParameter("sql_usernames"));
		for (final String username : usernames) {
			System.out.println("We got username: " + username);
		}
	}

}