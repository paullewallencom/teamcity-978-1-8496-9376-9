<%@ page import="com.packtpub.Calculator" %><%
    Calculator calculator = new Calculator();
    int sum = calculator.sum(1, 2);
    out.print("1 + 2 = " + sum);
%>