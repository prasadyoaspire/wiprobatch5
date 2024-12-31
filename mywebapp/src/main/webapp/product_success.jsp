<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="com.abc.model.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- Using Scripting Elements --%>
 <%
 Product product = (Product) request.getAttribute("myProduct");
%>
<h2>Product Details</h2>
<p>ProductId: <%= product.getProductId() %> </p>
<p>Name: <%= product.getProductName() %> </p>
<p>Price: <%= product.getProductPrice() %> </p>
<p>MFD: <%= product.getMfd() %> </p>
<p>Category: <%= product.getCategory() %> </p> --%>

<%-- Using Standard Actions --%>

<jsp:useBean id="myProduct" class="com.abc.model.Product" scope="request"/>

<h2>Product Details</h2>
<p>ProductId : <jsp:getProperty property="productId" name="myProduct"/> </p>
<p>Name : <jsp:getProperty property="productName" name="myProduct"/> </p>
<p>Price : <jsp:getProperty property="productPrice" name="myProduct"/> </p>
<p>MFD : <jsp:getProperty property="mfd" name="myProduct"/> </p>
<p>Category : <jsp:getProperty property="category" name="myProduct"/> </p>

<%-- Using Expression Language --%>
<p>ProductId : ${myProduct.productId } </p>
<p>Name : ${myProduct.productName } </p>
<p>Price : ${myProduct.productPrice } </p>
<p>MFD : ${myProduct.mfd }</p>
<p>Category : ${myProduct.category } </p> 

</body>
</html>