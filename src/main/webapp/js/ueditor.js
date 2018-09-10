$(function () {
    $(".sure").click(function () {
        var editor=$(".editor").text();
        $.post("ueditorController/getUeditorImg",{editorContent:editor},function (result) {


        })
    })
})