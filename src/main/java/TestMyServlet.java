import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 웹에서의 요청을 처리할 수 있는 서블릿 클래스 정의
// => 클래스 정의 시 javax.servlet.http.HttpServlet 클래스를 상속받아 정의
// => 단, 서블릿 기능을 제공하는 라이브러리는 servlet-api.jar 파일 필수!
//    (톰캣 라이브러리 내에 이미 내장되어 있음)
// => 서블릿 클래스에서 특정 서블릿 주소에 대한 요청을 처리하려면 서블릿 주소 매핑 필수!
//    1) web.xml(배포서술자) 파일을 통해 매핑을 수행하는 방법
//    2) 서블릿 클래스 선언부 상단에 @WebServlet 어노테이션을 사용하여 매핑을 수행하는 방법
//       => @WebServlet("/서블릿주소")
@WebServlet("/myServlet")
public class TestMyServlet extends HttpServlet {

	// 서블릿 클래스 내에는 GET & POST 방식 요청에 대한 처리를 위해 doGet(), doPost() 메서드를 정의
	// => HttpServlet 클래스로부터 상속받아 오버라이딩
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// GET 방식의 요청이 발생할 경우 자동으로 호출되는 메서드
		System.out.println("GET 방식 요청에 대한 doGet() 메서드 호출됨!");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// POST 방식의 요청이 발생할 경우 자동으로 호출되는 메서드
		System.out.println("POST 방식 요청에 대한 doPost() 메서드 호출됨!");
	}
	
}








