/**
 * Created by yongjie on 14-9-17.
 */

var dataHolder = null;

function DataHolder(){
    var $currentNode = null;    //当前操作的节点
    var addClass = null;       //添加还是删除类别
    var addChild = null;       //添加子节点还是兄弟节点
    var className = null;      //分类名称
}

function getDataHolder(){
    if (dataHolder==null){
        dataHolder = new DataHolder();
    }
    return dataHolder;
}

function CurrentNode(){
    var $node = $(this).parent('li');
    getDataHolder().$currentNode = $node;
}

function ChangeConfirm(){
    var addClass = $("#addtab").attr('class');
    var delClass = $("#deltab").attr('class');

    if (addClass.length > delClass.length){
        getDataHolder().addClass = true;
    } else{
        getDataHolder().addClass = false;
    }

    var a = $('input:radio:checked').val();
    if (a=='option1'){
        getDataHolder().addChild = false;
    }
    else if(a=='option2'){
        getDataHolder().addChild = true;
    }
    else{
        getDataHolder().addChild = null;
    }

    var className = $('#className').val();
    getDataHolder().className = className;
    AddOrDelClass();
}

function AddOrDelClass(){
    if (getDataHolder().addClass==true){
        AddClass();
    }
    if (getDataHolder().addClass==false){
        DelClass();
    }
}

function AddClass(){
    var $currentNode = getDataHolder().$currentNode;
    var className = getDataHolder().className;
    if (getDataHolder().addChild==false){
        var $li = $('<li><span><i class="icon-leaf"></i>'+className+'</span><a href="#myModal" data-toggle="modal">添加/删除</a></li>');
        $currentNode.parent().append($li);
    }
    if (getDataHolder().addChild==true){

    }
}

function DelClass(){

}

$(function(){
    $('a').on('click',CurrentNode);
});
