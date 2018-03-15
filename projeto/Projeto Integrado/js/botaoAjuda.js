$(document).ready(function() {

	var flag = 0;

	
    $("#btnForm").click(
		function() {
			var msg;
			if (flag == 0) {
				msg  = "Digite a sua dúvida";
				flag = 1;
			}
			else {
				msg  = "Problemas?? Fale com a Cris!";
				flag = 0;
			}
			$("#form").slideToggle();
			$(this).html(msg);
		}
	);
});