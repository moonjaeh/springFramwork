<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
ul, li {
	list-style: none;
}

a {
	text-decoration: none;
	color: black;
	'
}

a:hover {
	color: blue;
}

.main-nav li a {
	font-size: 1.125rem;
}

.user-nav {
	display: flex;
	fustify-content: space-between;
	align-items: center;
}

.user-nav li {
	margins-left: 10px;
}

.user-nav li a {
	font-size: 0.9rem;
}
</style>

</head>
<body>
	<header
		style="display: flex; justify-content: space-around; align-itmes: center; background: orange;">
		<h1>
			<a href="/index.jsp"> 홈 </a>
		</h1>
		<nav>
			<ul class="main-nav">
				<li><a href="#">게시글 목록</a>
			</ul>
		</nav>
		<nav>
			<ul class="user-nav">
				<li><a href="/user/login.do">로그인</a></li>
				<li><a href="/user/join.do">회원가입</a></li>
			</ul>
		</nav>
	</header>
</body>
</html>