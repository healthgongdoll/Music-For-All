
function report(address){
	
	var request = new XMLHttpRequest();
	var data = '';
	
	data+= "report=true";
	
	request.open("GET", (address + "?" + data), true);
	request.onreadystatechange = function() {
		handler(request);
	};
	request.send(null);
}

function handler(request){
	if((request.readyState==4) && (request.status)==200){
		var target = document.getElementById("result"); 
		target.innerHTML = request.responseText;
	}
}

