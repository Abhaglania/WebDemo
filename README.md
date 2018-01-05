# WebDemo
Binding JavaScript Code to Android Code 

Html Code 

	<input type="button" value="Say hello" onClick="showAndroidToast('Hello Android!')" />
	<script type="text/javascript">
	function showAndroidToast(toast) {
		Android.showToast(toast);
	}
	</script>


