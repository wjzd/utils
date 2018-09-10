<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath%>"/>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>富文本编辑器</title>

    <script type="text/javascript" src="js/jquery-3.0.0.min.js" ></script>
    <script type="text/javascript" src="ueditor/ueditor.config.js"></script>
    <script type="text/javascript" src="ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript" charset="UTF-8" src="ueditor/lang/zh-cn/zh-cn.js"></script>
    <script type="text/javascript" src="js/ueditor.js"></script>
    <script type="text/javascript">
        //实例化编辑器

        //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下   引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例

        /*
        * ['anchor', //锚点'undo', //撤销'redo', //重做'bold', //加粗'indent', //首行缩进'snapscreen', //截图'italic', //斜体'underline', //下划线'strikethrough',

//删除线'subscript', //下标'fontborder', //字符边框'superscript', //上标'formatmatch', //格式刷'source', //源代码'blockquote', //引用'pasteplain', //纯文本粘贴模式'selectall',

//全选'print', //打印'preview', //预览'horizontal', //分隔线'removeformat', //清除格式'time', //时间'date', //日期'unlink', //取消链接'insertrow', //前插入行'insertcol',

            //前插入列'mergeright', //右合并单元格'mergedown', //下合并单元格'deleterow', //删除行'deletecol', //删除列'splittorows', //拆分成行'splittocols', //拆分成列'splittocells',

//完全拆分单元格'deletecaption', //删除表格标题'inserttitle', //插入标题'mergecells', //合并多个单元格'deletetable', //删除表格'cleardoc', //清空文档'insertparagraphbeforetable',

//"表格前插入行"'insertcode', //代码语言'fontfamily', //字体'fontsize', //字号'paragraph', //段落格式'simpleupload', //单图上传'insertimage', //多图上传'edittable', //表格属性'edittd',

//单元格属性'link', //超链接'emotion', //表情'spechars', //特殊字符'searchreplace', //查询替换'map', //Baidu地图'gmap', //Google地图'insertvideo', //视频'help', //帮助'justifyleft',

//居左对齐'justifyright', //居右对齐'justifycenter', //居中对齐'justifyjustify', //两端对齐'forecolor', //字体颜色'backcolor', //背景色'insertorderedlist', //有序列表'insertunorderedlist',

            //无序列表'fullscreen', //全屏'directionalityltr', //从左向右输入'directionalityrtl', //从右向左输入'rowspacingtop', //段前距'rowspacingbottom', //段后距'pagebreak', //分页'insertframe',

            //插入Iframe'imagenone', //默认'imageleft', //左浮动'imageright', //右浮动'attachment', //附件'imagecenter', //居中'wordimage', //图片转存'lineheight', //行间距'edittip ', //编辑提示'customstyle',

//自定义标题'autotypeset', //自动排版'webapp', //百度应用'touppercase', //字母大写'tolowercase', //字母小写'background', //背景'template', //模板'scrawl', //涂鸦'music', //音乐'inserttable',

            //插入表格'drafts', // 从草稿箱加载'charts', // 图表
                    ]
        * */

        var ue = UE.getEditor('editor',{toolbars:[
                ['anchor', 'undo', 'redo', 'bold', 'indent', 'snapscreen', 'italic', 'underline', 'strikethrough',

                    'subscript', 'fontborder', 'superscript', 'formatmatch', 'source', 'blockquote', 'pasteplain', 'selectall',

                    'print', 'preview', 'horizontal', 'removeformat', 'time', 'date', 'unlink', 'insertrow','insertcol',

                    'mergeright', 'mergedown', 'deleterow', 'deletecol', 'splittorows', 'splittocols', 'splittocells',

                    'deletecaption', 'inserttitle', 'mergecells', 'deletetable', 'cleardoc', 'insertparagraphbeforetable',

                    'insertcode', 'fontfamily', 'fontsize', 'paragraph', 'simpleupload', 'insertimage', 'edittable', 'edittd',

                    'link', 'emotion', 'spechars', 'searchreplace', 'map', 'gmap', 'insertvideo', 'help', 'justifyleft',

                    'justifyright', 'justifycenter', 'justifyjustify', 'forecolor', 'backcolor', 'insertorderedlist', 'insertunorderedlist',

                    'fullscreen', 'directionalityltr', 'directionalityrtl', 'rowspacingtop', 'rowspacingbottom', 'pagebreak','insertframe',

                    'imagenone', 'imageleft', 'imageright','attachment', 'imagecenter', 'wordimage', 'lineheight', 'edittip ', 'customstyle',

                    'autotypeset', 'webapp', 'touppercase', 'tolowercase', 'background', 'template', 'scrawl', 'music', 'inserttable',

                    'drafts', 'charts',
                ]
            ]});

    </script>
    <style>
        .editor{
            width: 80%;
            margin-left: 10%;
            height: 20em;
        }
    </style>
    <head>
        <title>Title</title>
    </head>
<body>
<form action="/ueditorController/getUeditorImg" method="post">
    <textarea class="editor" id="editor" name="editorContent">开始编辑你的文本</textarea>

    <%--<button class="sure">提交</button>--%>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
