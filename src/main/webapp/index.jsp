<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1" session="true" />
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />
	<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Music to sign language lyrics</title>
<link rel="stylesheet" href="style.css" type="text/css" title="cse4413"
	media="screen, print" />
<script type="text/javascript" src="script/mc.js">;</script>
</head>
<body>
<form action="Sign" method="POST">
	<div class="container">
		<div class="navbar">
			<img src="media/logo.png" class="logo"></img>
			<ul>
				<li><a href="/SignLanguageTranslator/about.html">ABOUT</a></li>
				<li><a href="/SignLanguageTranslator/team.html">TEAM</a></li>
			</ul>
		</div>
		<div class="content">
			<div class="left-col">
				<h1>
					MUSIC<br />FOR<br />ALL
				</h1>
			</div>
			<div class="right-col">
				<p>Click here to listen</p>
				<img src="media/play.png" id="icon" onClick="location.href='main.html'"></img>
			</div>
		</div>
		<div id="result"></div>
	</div>

	<audio id="mySong">
		<source src="media/listen-beyonce.mp3" type="audio/mp3"></source>
	</audio>
</form>
</body>
	</html>
</jsp:root>