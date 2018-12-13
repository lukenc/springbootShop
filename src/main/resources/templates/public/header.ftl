<script src="${StaticUrl}/js/jquery-1.10.2.min.js"></script>
<script src="${publicSource}/js/global.js"></script>
<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.js"></script>
<!--最顶部-->
<#include "siteTopBar.ftl">
<!--------在线客服-------------->
<#include "alo_slider.ftl">
<!--------在线客服end-------------->

<!--顶部banner开始-->
<div class="top-banner" id="top-banner-block" style="display: none">
    <div class="top-banner-max">
        <!---广告 select * from __PREFIX__ad where position_id = 1 limit 1-->
            <a href="${topBannerAd.adLink}" <#if topBannerAd.target==true>target="_blank"</#if>> <img src="http://imgd.aotubuy.com${topBannerAd.adCode}"  title="${topBannerAd.adName}" style="${topBannerAd.adPosition.positionStyle}; height:${topBannerAd.adPosition.adHeight};width:${topBannerAd.adPosition.adWidth}  "/></a>
            <a class="button-top-banner-close" href="javascript:;" title="关闭" id="top-banner-min-close" onClick="javascript:$('#top-banner-block').hide();">－</a>
    </div>
</div>
<!--顶部banner结束-->



<header>

    <div class="layout">

        <!--logo开始-->
        <div class="logo"><a href="/" title="aotubuy"><img src="${publicDomain}${store_logo}" alt="AotuBuy"></a></div>
        <!--logo结束-->

        <!-- 搜索开始-->
        <div class="searchBar">
            <div class="searchBar-form">
                <form name="sourch_form" id="sourch_form" method="post" action="{:U("/Home/Goods/search")}">
                <input type="text" class="text" name="q" id="q"  placeholder="  搜索关键字"/>
                <input type="button" class="button" value="搜索" onclick="if($.trim($('#q').val()) != '') $('#sourch_form').submit();"/>
                </form>
            </div>
            <div class="searchBar-hot">
                <b>热门搜索</b>
                <#--<foreach name="tpshop_config.hot_keywords" item="wd" key="k">-->
<#list keywords as keyword>
    <a target="_blank" href="Home/Goods/search?q=${keyword}" <#if keyword_index==0> class="ht"</#if>>${keyword}</a>
</#list>
<#--</foreach>-->
            </div>
        </div>
        <!-- 搜索结束-->

        <div class="ri-mall">
            <div class="my-mall">
                <!---我的商城-开始 -->
                <div class="mall">
                    <div class="le"><a href="/Home/User" >我的商城</a></div>
                </div>
                <!---我的商城-结束 -->
            </div>
            <div class="my-mall" id="header_cart_list">
                <!---购物车-开始 -->
                <div class="micart">
                    <div class="le les">
                        <a href="Home/Cart/cart" >我的购物车
                            <span class="shopping-num"><em id="cart_quantity"></em><b></b></span>
                        </a>
                    </div>

                    <div class="ri ris" style="display:">
                        <if condition="count($cartList) eq 0">
                            <div class="micart-about">
                                <span class="micart-xg">您的购物车是空的，赶紧选购吧！</span>
                            </div>
                        </if>
                        <div class="commod">
                            <ul>
                                <foreach name="cartList" item="v"  key="k">
                                    <li class="goods">
                                        <div>
                                            <div class="p-img">
                                                <a href="">
                                                    <img src="{$v.goods_id|goods_thum_images=428,428}" alt="">
                                                </a>
                                            </div>
                                            <div class="p-name">
                                                <a href="">
                                                    <span class="p-slogan">{$v[goods_name]}</span>
                                                    <span class="p-promotions hide"></span>
                                                </a>
                                            </div>
                                            <div class="p-status">
                                                <div class="p-price">
                                                    <b>¥&nbsp;{$v[goods_price]}</b>
                                                    <em>x</em>
                                                    <span>{$v[goods_num]}</span>
                                                </div>
                                                <div class="p-tags"></div>
                                            </div>
                                            <!--
                                            <a href="" class="icon-minicart-del" title="删除">删除</a>
                                              -->
                                        </div>
                                    </li>
                                </foreach>
                            </ul>
                        </div>
                        <div class="settle">
                            <p>共<em>{$cart_total_price[anum]}</em>件商品，金额合计<b>¥&nbsp;{$cart_total_price[total_fee]}</b></p>
                            <a class="js-button" href="{:U('Home/Cart/cart')}">去结算</a>
                        </div>
                    </div>
                </div>
                <!---购物车-结束 -->

            </div>
        </div>
        <div class="qr-code">
            <img src="http://imgd.aotubuy.com{$tpshop_config[shop_info_wxqun_qrcode]}" alt="二维码" />
            <p>扫一扫</p>
        </div>
    </div>
</header>


<!-- 导航-开始-->
<div class="navigation">
    <div class="layout">
        <!--全部商品-开始-->
        <div class="allgoods">
            <div class="goods_num"><h2>全部商品</h2><i class="trinagle"></i></div>
            <div class="list" style="">
            <ul class="list_ul">
                <#list cats as cat>
                <#if cat_index<6>
                <li class="list-li">
                <div class="list_a">
                <h3><a href="Home/Goods/goodsList?id=${cat.id}"><span>${cat.category.name}</span></a></h3>
                <p>
                <#list cat.childCategoryList as catlv2>
                    <#if catlv2_index<3>
                <a href="Home/Goods/goodsList?id=${catlv2.id}">${catlv2.category.name}</a>
                    </#if>
                </#list>
                </p>
                </div>
                <div class="list_b">
                <div class="list_bigfl">
                    <#list cat.childCategoryList as catlv2>
                <#if catlv2_index<6>
                <a class="list_big_o ma-le-30" href="Home/Goods/goodsList?id=${catlv2.id}">${catlv2.category.name}<i>＞</i></a>
                </#if>
                    </#list>
                </div>
                <div class="subitems">
                    <#list cat.childCategoryList as catlv2>
                <dl class="ma-to-20 cl-bo">
                <dt class="bigheader wh-sp"><a href="Home/Goods/goodsList?id=${catlv2.id}">${catlv2.category.name}</a><i>＞</i></dt>
                <dd class="ma-le-100">
                <#list catlv2.childCategoryList as catlv3>
                <a class="hover-r ma-le-10 ma-bo-10 pa-le-10 bo-le-hui fl wh-sp" href="{:U('Home/Goods/goodsList?id=${catlv3.id}">${catlv3.category.name}</a>
                </#list>
                </dd>
                </dl>
                </#list>
                </div>
                </div>
                <i class="list_img"></i>
                </li>
                </#if>
                </#list>
            </ul>
        </div>
    </div>
    <!--全部商品-结束-->
        <script>
            var pathName = window.location.pathname;
            console.log(pathName);
            if (pathName == "/index") {
                if ($.cookie("atg-top-banner") == null) {
                    var exp=new Date();
                    exp.setTime(exp.getTime()+(1*60*1000));
                    $("#top-banner-block").css("display", "");
                    $.cookie("atg-top-banner", new Date(), {expires: exp})
                }
                /*调整首页商品分类（全部商品）的样式*/
//                $(".allgoods.list").style("display:block;");
                console.log($(".allgoods.list"));
                $(".allgoods .list").css("display","block");
console.log($(".allgoods .list").css("display"));
            }
            console.log($.cookie("atg-top-banner"));
        </script>
    <div class="ongoods">
        <ul class="navlist">
            <li class="homepage"><a href="/"><span>首页</span></a></li>
            <#if navs?exists>
            <#list navs as nav>
                <li class="page"><a href="${nav.url}" <#if nav.isNew> target="_blank" </#if><span>${nav.name}</span></a></li>
            </#list>
            </#if>
        </ul>
    </div>
</div>
</div>

<script>
    $(function(){
//        var active_li = '{$active}';
//        if(active_li){
//            $('li').remove('curr-res');
//            $('#'+active_li).addClass('curr-res');
//        }

        var uname= getCookie('uname');
        if(uname == ''){
            $('.islogin').remove();
            $('.nologin').show();
        }else{
            $('.nologin').remove();
            $('.islogin').show();
            $('.userinfo').html(decodeURIComponent(uname));
        }
        get_cart_num();
    })



    function get_cart_num(){
        var cart_cn = getCookie('cn');
        if(cart_cn == ''){
            $.ajax({
                type : "GET",
                url:"/index.php?m=Home&c=Cart&a=header_cart_list",//+tab,
                success: function(data){
                    cart_cn = getCookie('cn');
                    $('#cart_quantity').html(cart_cn);
                }
            });
        }
        $('#cart_quantity').html(cart_cn);
    }
    /**
     * 鼠标移动端到头部购物车上面 就ajax 加载
     */
// 鼠标是否移动到了上方
    var header_cart_list_over = 0;
    $("#header_cart_list > .micart > .les").hover(function(){
        if(header_cart_list_over == 1)
            return false;
        header_cart_list_over = 1;
        $.ajax({
            type : "GET",
            url:"/index.php?m=Home&c=Cart&a=header_cart_list",//+tab,
            success: function(data){
                $("#header_cart_list > .micart > .ris").html(data);
                get_cart_num();
            }
        });
    }).mouseout(function(){

        (typeof(t) == "undefined") || clearTimeout(t);
        t = setTimeout(function () {
            header_cart_list_over = 0; /// 标识鼠标已经离开
        }, 1000);
    });
</script>