// File : isrDBHandler.js

	function isrDBHandler(){

	this.dbName = "";

		isrDBHandler.prototype.updateDB = function(targetDiv,source,SQL){

			var XMLHttpRequestObject = false;
			if(window.XMLHttpRequest) {
				XMLHttpRequestObject = new XMLHttpRequest();

			} else if (window.ActiveXObject) {
					XMLHttpRequestObject = new ActiveXObject("Microsoft.XMLHTTP");
			}

			if(XMLHttpRequestObject) {
				var obj = document.getElementById(targetDiv);
				XMLHttpRequestObject.open("POST", source);
				XMLHttpRequestObject.setRequestHeader('Content-type','application/x-www-form-urlencoded');

				XMLHttpRequestObject.onreadystatechange = function()
				{
					if (XMLHttpRequestObject.readyState != 4 || XMLHttpRequestObject.status != 200){
						obj.innerHTML = XMLHttpRequestObject.responseText;
					}
				
					if (XMLHttpRequestObject.readyState == 4 && XMLHttpRequestObject.status == 200) {
						//obj.innerHTML += XMLHttpRequestObject.responseText;
						delete XMLHttpRequestObject;
						XMLHttpRequestObject=null;
					}
				}
				XMLHttpRequestObject.send(SQL);
			}
		}



		isrDBHandler.prototype.getDataFromDB = function(callBackFunction,source,SQL){

			var XMLHttpRequestObject = false;
			if(window.XMLHttpRequest) {
				XMLHttpRequestObject = new XMLHttpRequest();

			} else if (window.ActiveXObject) {
					XMLHttpRequestObject = new ActiveXObject("Microsoft.XMLHTTP");
			}
			
			if(XMLHttpRequestObject) {
				//var obj = document.getElementById('workingDiv');
				XMLHttpRequestObject.open("POST", source, false);
				XMLHttpRequestObject.setRequestHeader('Content-type','application/x-www-form-urlencoded');

				XMLHttpRequestObject.onreadystatechange = function()
				{

					if (XMLHttpRequestObject.readyState == 4 && XMLHttpRequestObject.status == 200) {

						callBackFunction(XMLHttpRequestObject.responseXML);

						//obj.innerHTML = XMLHttpRequestObject.responseText;
						delete XMLHttpRequestObject;
						XMLHttpRequestObject=null;
					}
				}
				XMLHttpRequestObject.send(SQL);

			}
		}

	}