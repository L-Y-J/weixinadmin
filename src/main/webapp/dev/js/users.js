/**
 * Created by yongjie on 14-9-30.
 */

var tools = {
    ShowFormData : function($button){
        var $td_list = $button.parent().parent().children();
        var $input_name = $("input[name='name']");
        var $select_gender = $('#gender');
        var $input_weixinId = $("input[name='weixinId']");
        var $input_mobile = $("input[name='mobile']");
        var $input_tel = $("input[name='tel']");
        var $input_email = $("input[name='email']");
        var $input_account = $("input[name='account']");
        var $input_personNumbers = $("input[name='personNumbers']");
        var $input_policeNumber = $("input[name='policeNumber']");
        var $input_dateofbirth = $("input[name='dateofbirth']");
        var $select_position = $('#position');
        var $select_rank = $('#rank');
        var $checkbox_use = $("input[type='checkbox']");
        var $input_department = $('#citySel');
        $("input[name='id']").val($td_list[0].innerHTML);
        $input_name.val($td_list[1].innerHTML);
        $input_weixinId.val($td_list[5].innerHTML);
        $input_mobile.val($td_list[8].innerHTML);
        $input_tel.val($td_list[9].innerHTML);
        $input_email.val($td_list[10].innerHTML);
        $input_account.val($td_list[11].innerHTML);
        $input_personNumbers.val($td_list[12].innerHTML);
        $input_policeNumber.val($td_list[14].innerHTML);
        $input_dateofbirth.val($td_list[13].innerHTML);
        $input_department.val($td_list[3].innerHTML);
        var td_gender = $td_list[2].innerHTML;
        var td_position = $td_list[4].innerHTML;
        var td_rank = $td_list[7].innerHTML;
        var td_use = $td_list[16].innerHTML;
        $select_gender.children().each(function(index, td){
            if (td_gender==td.innerHTML){
                $select_gender.get(0).selectedIndex = index;
                return false;
            }
        });
        $select_position.children().each(function(index, td){
            if (td_position==td.innerHTML){
                $select_position.get(0).selectedIndex = index;
                return false;
            }
        });
        $select_rank.children().each(function(index, td){
            if (td_rank==td.innerHTML){
                $select_rank.get(0).selectedIndex = index;
                return false;
            }
        });
        if (td_use=='禁用'){
            $checkbox_use.prop({
                checked:true
            });
        } else{
            $checkbox_use.prop({
                checked:false
            });
        }
    }
};

function ShowDetail(obj){
    tools.ShowFormData($(obj));
    $("input[name='name']").attr('disabled','disabled');
    $("input[name='gender']").attr('disabled','disabled');
    $("input[name='weixinId']").attr('disabled','disabled');
    $("input[name='mobile']").attr('disabled','disabled');
    $("input[name='tel']").attr('disabled','disabled');
    $("input[name='email']").attr('disabled','disabled');
    $("input[name='account']").attr('disabled','disabled');
    $("input[name='personNumbers']").attr('disabled','disabled');
    $("input[name='policeNumber']").attr('disabled','disabled');
    $("input[name='dateofbirth']").attr('disabled','disabled');
    $("input[type='checkbox']").attr('disabled','disabled');
    $('#citySel').attr('disabled', 'disabled');
    $('#gender').attr('disabled', 'disabled');
    $('#position').attr('disabled', 'disabled');
    $('#rank').attr('disabled', 'disabled');

    $('div .form-actions').hide();
    $('#myModal').modal('show');
}

function ShowUpdate(obj){
    tools.ShowFormData($(obj));
    $("input[name='name']").removeAttr('disabled');
    $("input[name='gender']").removeAttr('disabled');
    $("input[name='weixinId']").removeAttr('disabled');
    $("input[name='mobile']").removeAttr('disabled');
    $("input[name='tel']").removeAttr('disabled');
    $("input[name='email']").removeAttr('disabled');
    $("input[name='account']").removeAttr('disabled');
    $("input[name='personNumbers']").removeAttr('disabled');
    $("input[name='policeNumber']").removeAttr('disabled');
    $("input[name='dateofbirth']").removeAttr('disabled');
    $("input[type='checkbox']").removeAttr('disabled');
    $('#citySel').removeAttr('disabled');
    $('#gender').removeAttr('disabled');
    $('#position').removeAttr('disabled');
    $('#rank').removeAttr('disabled');

    $('div .form-actions').show();
    $('#myModal').modal('show');
}

function Delete(obj){
    $('#myModal_1').modal('show');
}

function DeleteAction(obj){
    var $td_list = $(obj).parent().parent().children();
    var id = $td_list[0].innerHTML;
    var basePath = $('basePath').attr('value');
    $.ajax({
        url:basePath+'/user/'+id,
        type:'DELETE',
        dataType:'json',
        success:function(result){
            alert(result.status);
        }
    });
}
