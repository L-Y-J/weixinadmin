/**
 * Created by yongjie on 14-9-30.
 */

jQuery.extend({
    toJSON : function(object)
    {
        var type = typeof object;
        if ('object'==type)
        {
        if (Array==object.constructor)
            type = 'array';
        else if (RegExp==object.constructor)
            type = 'regexp';
        else
            type = 'object';
    }
        switch(type)
        {
        case 'undefined':
        case 'unknown':
            return;break;
        case 'function':
        case 'boolean':
        case 'regexp':
            return object.toString();break;
        case 'number':
            return isFinite(object) ? object.toString():'null';break;
        case 'string':
            return '"'+object.replace(/(\\|\")/g,"\\$1")
                .replace(/\n|\r|\t/g, function(){
                    var a = arguments[0];
                    return (a=='\n') ? '\\n':
                        (a=='\r') ? '\\r':
                            (a=='\t') ? '\\t':""
                })+'"';
            break;
        case 'object':
            if (object==null) return 'null';
            var results = [];
            for (var property in object)
            {
                var value = jQuery.toJSON(object[property]);
                if (value !== undefined)
                    results.push(jQuery.toJSON(property)+':'+value);
            }
            return '{' + results.join(',') + '}';
            break;
        case 'array':
            var results = [];
            for (var i=0; i<object.length; i++)
            {
                var value = jQuery.toJSON(object[i]);
                if (value !== undefined) results.push(value);
            }
            return '[' + results.join(',') + ']';
            break;
    }
    }
});

var data = {
    $row_selected:null
};

var tools = {
    Add : function() {
        var basePath=$('#basePath').attr("value");
        var user = {
                name : $("#name").val(),
                gender : $("#gender").val(),
                department : $("#department").val(),
                position : $("#position").val(),
                mobile : $("#mobile").val(),
                tel : $("#tel").val(),
                email : $("#email").val(),
                use : $("#use").val()
            };
            var json_data = $.toJSON(user);
            $.ajax({
                url : basePath+'/user',
                type : 'PUT',
                contentType : 'application/json; charset=UTF-8',
                data : json_data,
                dataType : 'json',
                success : tools.CallBack
            });
    },

    Update : function(user){
        var json_data = $.toJSON(user);
            $.ajax({
                url : basePath+'/user',
                type : 'POST',
                contentType : 'application/json; charset=UTF-8',
                data : json_data,
                dataType : 'json',
                success : tools.CallBack
            });
    },

    CallBack : function(result){
        if (result.status=='ok')
            alert('操作成功');
        else
            alert('操作失败');
    }
};

$(function(){
    $(".gradeA").on('click', function(){
        $(this).addClass('info');
        if (data.$row_selected!=null){
            data.$row_selected.removeClass('info');
        }
        data.$row_selected = $(this);
    });

    $('#test').on('click', function(){
        $("#detail").css(
        {
            position: "absolute",
            width : 400,
            height : $('#example').height(),
            top: $('#example').offset().top,
            left: 600,
            zIndex: 9999,
            backgroundColor: "#F8F8F8"
        }).hide();
        $('#detail').toggle();
    });
});
