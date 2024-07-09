/**
 * 
 */


function commonViewFnc(tempArr) {
	var commonViewObj = document.getElementById('commonView');
	var htmlStr = '';

	for (var i = 0; i < tempArr.length; i++) {
		htmlStr += '<div style="border: 1px solid black;">'
			+ tempArr[i] + '</div>';
	}

	commonViewObj.innerHTML = htmlStr;
}