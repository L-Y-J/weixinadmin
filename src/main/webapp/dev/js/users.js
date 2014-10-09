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
    $row_selected:null,
    add:true,
    update:false,
    delete:false,
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

    $("#add").on('click', function(){
        data.add = true;
        data.update = false;
        data.delete = false;
    });

    $("#update").on('click', function(){
        data.update = true;
        data.add = false;
        data.delete = false;
        if (data.$row_selected!=null){
            var $children = data.$row_selected.children();
            $('#name1').val($children[1].innerHTML);
            $('#gender1').val($children[2].innerHTML);
            $('#department1').val($children[3].innerHTML);
            $('#position1').val($children[4].innerHTML);
            $('#mobile1').val($children[5].innerHTML);
            $('#tel1').val($children[6].innerHTML);
            $('#email1').val($children[7].innerHTML);
            $('#use1').val($children[9].innerHTML);
        }
    });

    $("#delete").on('click', function(){
        data.add = false;
        data.update = false;
        data.delete = true;
    });

    $("#confirm").on('click', function(){
        var basePath=$('#basePath').attr("value");
        if (data.add == true){
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
                success : data.CallBack
            });
        }

        if (data.update==true){
            if (data.$row_selected==null){
                alert('请点击选择需要更改的行');
                return;
            }
            var $children = data.$row_selected.children();
            var user = {
                id : $children[0].innerHTML,
                name : $("#name1").val(),
                gender : $("#gender1").val(),
                department : $("#department1").val(),
                position : $("#position1").val(),
                mobile : $("#mobile1").val(),
                tel : $("#tel1").val(),
                email : $("#email1").val(),
                use : $("#use1").val()
            };
            var json_data = $.toJSON(user);
            $.ajax({
                url : basePath+'/user',
                type : 'POST',
                contentType : 'application/json; charset=UTF-8',
                data : json_data,
                dataType : 'json',
                success : data.CallBack
            });
        }
        if (data.delete==true){
            if (data.$row_selected==null){
                alert('请点击选择需要删除的行');
                return;
            }
            var $children = data.$row_selected.children();
            var id = $children[0].innerHTML;
            $.ajax({
                url : basePath+'/user/'+id,
                type : 'DELETE',
                dataType : 'json',
                success : data.CallBack
            });
        }


    });

});
