package servletdemo;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetApp extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>");
		out.println("����application��������");
		out.println("</title></head><body>");
		//ÿ��webӦ��ֻ��һ��ServletContext,��JSPҳ���ÿ���ͨ��application���ʸ�ʵ��
		ServletContext sc = getServletConfig().getServletContext();
		out.println(sc.getAttribute("nickname"));
		out.println("</body></html>");
		
		System.out.println(req.getParameter("username"));
		System.out.println(req.getParameter("password"));
		
	}

}