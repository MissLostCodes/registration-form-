import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.* ;
public class registrationform extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String username = request.getParameter("username");
String password = request.getParameter("password");
String age = request.getParameter("age");
String dateOfBirth = request.getParameter("dateofbirth");
String gender = request.getParameter("gender");
String py = request.getParameter("python");
String jv = request.getParameter("java");
String cp = request.getParameter("cpp");
String c = request.getParameter("c");
response.setContentType("text/html");
PrintWriter out =  response.getWriter();
out.println("<!DOCTYPE html>");
out.println("<html lang=\"en\">");
out.println("<head>");
out.println("<meta charset=\"UTF-8\">");
out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
out.println("<title>Registration Form Response</title>");
out.println("<style>");
out.println("body {");
out.println("    padding: 5px;");
out.println("    font-family: Arial, sans-serif;");
out.println("    border: 3px solid black;");
out.println("    border-radius: 5px;");
out.println("    box-shadow: 0 0 10px rgba(90, 229, 122, 0.8);");
out.println("    height: 500px;");
out.println("    max-width: 500px;");
out.println("    text-align: center;"); out.println("}");
out.println("h2 {");
out.println("    color: black;"); out.println("    text-align: center;");  out.println("}");
out.println("p {"); out.println("    color: black;");
out.println("    text-align: center;");
out.println("}"); out.println("</style>");        out.println("</head>");
out.println("<body>");  out.println("<h2>-------------Registration Successful---------------</h2>");
out.println("<p>Your Username is : " + username + "</p>");                                                                out.println("<p>Your Password is : " + password + "</p>");
out.println("<p>Your  Age is     : " + age + "</p>");
out.println("<p>Your  Date of Birth is : " + dateOfBirth + "</p>");
out.println("<p>Your  Gender is    : " + gender + "</p>");
out.println("<p>Languages Selected   :</p>");
if ("on".equals(py)) {out.println("<p>-> Python</p>");}
if ("on".equals(jv)) {out.println("<p>-> JAVA</p>"); }
if ("on".equals(cp)) {out.println("<p>-> C++</p>");}
if ("on".equals(c)) {  out.println("<p>-> C</p>");}
out.println("</body>");
out.println("</html>");}}

