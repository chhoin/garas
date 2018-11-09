/*Form advanced Init*/
$(document).ready(function() {
"use strict";

/* Select2 Init*/
$(".select2").select2();

$('#deselect-all').click(function(){
$('#public-methods').multiSelect('deselect_all');
return false;
});
$('#refresh').on('click', function(){
$('#public-methods').multiSelect('refresh');
return false;
});
$('#add-option').on('click', function(){
$('#public-methods').multiSelect('addOption', { value: 42, text: 'test 42', index: 0 });
return false;
});
});