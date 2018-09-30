/**
 *
 */
function slideSwitch() {
	var $active = $('#slideshow p.active');

	var $next = $active.next().length ? $active.next()
			: $('#slideshow p:first');

	$active.addClass('last-active');

	$next.css({
		opacity : 0.0
	}).addClass('active').animate({
		opacity : 1.0
	}, 1000, function() {
		$active.removeClass('active last-active');
	});
}

$(function() {
	setInterval("slideSwitch()", 4000);
});