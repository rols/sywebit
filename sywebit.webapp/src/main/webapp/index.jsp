<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript" src="assets/js/ajax.js"></script>
<link rel="stylesheet" type="text/css" href="assets/css/default.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SYWEBIT - A syntax driven web editor</title>
</head>
<body>
	<h3>Editor</h3>
	<textarea name="entry" id="entry_text_area"></textarea>
	<br>
	<button id="push" type="submit">submit</button>
	<h3>Validation Message</h3>
	<div id="server_message"></div>
</body>
</html>