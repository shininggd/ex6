<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn").click(function() {
			var path = '';
			$(".g").each(function() {
				if ($(this).prop("checked")) {
					path = $(this).val() + "Join";
				}
				$("#frm").attr("action", path);
				$("#frm").submit();
			});
		});

	});
</script>

</head>
<body>
	<form action="" method="post" id="frm" enctype="multipart/form-data">
		<div>
			학생<input type="radio" class="g" name="grade" checked="checked"value="student"> 
			선생<input type="radio" class="g"name="grade" value="teacher">
		</div>
		<!-- 공통 입력 사항  -->
		<div>
			아이디: <input type="text" name="id"><br> 
			비 번: <input type="text" name="pw"><br> 
			이 름: <input type="text" name="name"><br> 
			나 이: <input type="number" name="age"><br>
			파일네임: <input type="file" name="f1">
			<!-- <br> 오리네임: <input
				type="text" name="oriname"><br> -->


		</div>

		<!-- 학생 전용  -->
		<br> <br> <br>학생
		<div id="studentForm">
		sid: <input type="text" name="sid"><br> 
		티아이디: <input type="text" name="tid"><br> 
		뽄: <input type="text"name="phone"><br>

		</div>

		<!-- 선생 전용  -->
		<br> <br> <br>선생
		<div id="teacherForm">
			sid: <input type="text" name="tid"><br> 
			과목: <input type="text" name="subject"><br> 
			부임일: <input type="date" name="hiredate"><br>

		</div>
		<input type="button" value="join" id="btn">
	</form>





</body>
</html>