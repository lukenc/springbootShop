<style>
    .slidebar_alo {
        bottom: 20px;
        position: fixed;
        right: 2px;
        z-index: 999
    }

    .slidebar_alo ul li {
        background: #FFF url(${StaticUrl}/images/share-s907de33a09.png) no-repeat center;
        border: 1px solid #DDD;
        display: block;
        height: 38px;
        line-height: 999;
        margin-top: -1px;
        overflow: hidden;
        -webkit-transition: background-color .2s;
        -o-transition: background-color .2s;
        transition: background-color .2s;
        width: 38px;
        cursor: pointer
    }

    .slidebar_alo ul li:hover {
        background: #848484;
        line-height: 14px
    }

    .slidebar_alo ul li:hover a {
        color: #FFF;
        display: block;
        font-style: normal;
        font-size: 12px;
        margin: 5px auto auto;
        text-align: center;
        width: 30px
    }

    .slidebar_alo ul li:hover .rtipscont {
        display: block
    }

    .slidebar_alo ul .re_cuso {
        background-position: 6px -263px
    }

    .slidebar_alo ul .re_wechat {
        background-position: 4px -400px
    }

    .slidebar_alo ul .re_wechat_dingyuehao {
        background-position: 4px -6px
    }


    .slidebar_alo ul .re_phone {
        background-position: 9px -333px
    }

    .slidebar_alo ul .re_top {
        background-position: 6px -367px;
        display: none
    }
    .rtipscont {
        background: #FFF;
        border: 1px solid #CCC;
        left: -210px;
        padding: 15px;
        position: absolute;
        text-align: center;
        top: -53px;
        width: 140px;
        display: none;
        left: 0;
        opacity: 0;
    }
    .rtipscont .arrowr, .rtipscont .arrowr-bg {
        border-top: 10px solid transparent;
        border-left: 14px solid #FFF;
        border-bottom: 10px solid transparent;
        height: 0;
        position: absolute;
        right: -14px;
        top: 103px;
        width: 0;
        z-index: 111;
    }
    .rstoretips .arrowr{
        top: 143px !important;
    }
    .rstoretips .arrowr-bg{
        top: 142px !important;
    }
    .rtipscont .arrowr-bg {
        border-top: 11px solid transparent;
        border-left: 15px solid #CCC;
        border-bottom: 11px solid transparent;
        right: -15px;
        top: 102px;
    }
    .rtipscont img {
        height: 130px;
        text-align: center;
        width: 130px;
    }
    .rtipscont .tiptext {
        font-size: 13px;
        padding-top: 10px;
        text-align: center;
    }
</style>



<div class="slidebar_alo">
    <ul>
        <li class="re_cuso">
            <a title="进入公众号，发送信息" >客服服务</a>
            <div class="rtipscont" style="">
                <span class="arrowr-bg"></span>
                <span class="arrowr"></span>
                <img src="http://imgd.aotubuy.com/Public/images/wxgzh.jpg" />
                <p class="tiptext" style="color: #934b4c">进入公众号发送信息<br>客服妹妹在等你哦～</p>
            </div>
        </li>
        <li class="re_wechat">
            <a   >微信关注</a>
            <div class="rtipscont" style="">
                <span class="arrowr-bg"></span>
                <span class="arrowr"></span>
                <img src="http://imgd.aotubuy.com/Public/images/wxgzh.jpg" />
                <p class="tiptext">扫码关注官方微信<br>先人一步知晓促销活动</p>
            </div>
        </li>
        <li class="re_phone">
            <a target="_blank" href="{:U('Mobile/Index/index')}" >手机商城</a>
            <div class="rtipscont rstoretips" style="">
                <span class="arrowr-bg"></span>
                <span class="arrowr"></span>
                <img src="http://imgd.aotubuy.com/Public/images/mobileshop.png" />
                <p class="tiptext">扫码浏览手机版商城<br>更多优惠等你拿</p>
            </div>
        </li>
        <li class="re_wechat_dingyuehao">
            <a  >情趣小文</a>
            <div class="rtipscont rstoretips" style="">
                <span class="arrowr-bg"></span>
                <span class="arrowr"></span>
                <img src="http://imgd.aotubuy.com/Public/images/dinguehao.jpg" />
                <p class="tiptext">关注北纬三十度<br>超多福利等着你</p>
            </div>
        </li>
        <li class="re_top"><a target="_blank" href="javascript:void(0);" >回到顶部</a></li>
    </ul>
</div>

<!--侧边栏-e-->