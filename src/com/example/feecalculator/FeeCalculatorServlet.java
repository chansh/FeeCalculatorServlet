package com.example.feecalculator;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeeCalculatorServlet
 */
@WebServlet("/FeeCalculatorServlet")
public class FeeCalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeeCalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sum = 90000;
		int n = 11;
		response.setContentType("text/html; charset=Windows-31J");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>飲み会の割り勘計算プログラム</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>総計9万円、１１人の飲み会での１人当たりの料金を計算します</h1><br>");
		out.println(sum + "円を"+ n +"で割ると"+ sum/n + "円です。");
		out.println("</body>");
		out.println("</html>");
		out.close();	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
