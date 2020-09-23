$(document).ready(function() {
            $(window).scroll(function() {
                if ($(this).scrollTop() > 100) {
                    $('.scrollup').fadeIn();
                } else {
                    $('.scrollup').fadeOut();
                }
            });
            $('.scrollup').click(function() {
                $('html, body').animate({
                    scrollTop: 0
                }, 800);
                return false;
            });
			
			$("#toggleSwitch_1").hover(

			function() {
				$("#expand1").slideDown(500);
			}, function() {
				$("#expand1").slideUp(500);
			});
			$("#toggleSwitch_2").hover(

			function() {
				$("#expand2").slideDown(500);
			}, function() {
				$("#expand2").slideUp(500);
			});
			$("#toggleSwitch_3").hover(

			function() {
				$("#expand3").slideDown(500);
			}, function() {
				$("#expand3").slideUp(500);
			});
			
        });	