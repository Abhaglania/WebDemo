JavaScript Android Binding
===================
This application is an example of how one can bind javascript and Android code.

**-Binding JavaScript code to Android code**

**-How to Handling Page Navigation**

**Html Code**
    
	<body>
		<input type="button" value="Say hello" onClick="showAndroidToast('Hello Android!')" />

		<script type="text/javascript">
		function showAndroidToast(toast) {
			Android.showToast(toast);
		}
		</script>
	</body>


Reference: https://developer.android.com/guide/webapps/webview.html






























































































































