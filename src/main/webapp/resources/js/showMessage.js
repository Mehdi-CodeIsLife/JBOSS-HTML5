
showMessage = function(message) {
    jQuery('<div />', {
        'class' : 'rf-p-hdr'
    }).prependTo('#newMemberMessages').text(message).fadeOut(20000, function() {
        $(this).remove();
    });
};
