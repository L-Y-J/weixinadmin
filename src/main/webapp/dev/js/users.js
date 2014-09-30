/**
 * Created by yongjie on 14-9-30.
 */

var data = null;

function DataHolder(){
    var $row_selected = null;
}

function GetDataHolderInstance(){
    if (data==null){
        data = new DataHolder();
    }
    return data;
}

$(function(){

    $(".gradeA").on('click', function(){
        $(this).addClass('info');
        if (GetDataHolderInstance().$row_selected!=null){
            GetDataHolderInstance().$row_selected.removeClass('info');
        }
        GetDataHolderInstance().$row_selected = $(this);
    });

    $("#update").on('click', function(){
        if (GetDataHolderInstance().$row_selected!=null){
            var $children = GetDataHolderInstance().$row_selected.children();
            $('#name1').val($children[1].innerHTML);
            $('#gender1').val($children[2].innerHTML);
            $('#department1').val($children[3].innerHTML);
            $('#position1').val($children[4].innerHTML);
            $('#mobile1').val($children[5].innerHTML);
            $('#tel1').val($children[6].innerHTML);
            $('#email1').val($children[7].innerHTML);
        }
    });

});
