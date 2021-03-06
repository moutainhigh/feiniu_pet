
<!-- 搜索框区域\\ -->
<div data-city-name="${fromPlaceName}" data-city-id="${fromPlaceId}" data-source="home" class="search-box wrap">
         <div class="incity switch-city">
                        <p class="city">
                            <a class="switch-info">切换城市</a>
                            <i class="icon-local"></i>
                            <span>您现在
                            <b>${stationName}</b>
                            </span>
                        </p>
                        <div class="citylist LISTFIRST">
                            <#include "/WEB-INF/pages/www/channel/stationDiv.ftl" />
                        </div>
            </div>     
    <div class="from-city switch-city"><p class="city"><span class="css-arrow"><i></i></span>
        <i ></i><span id="cityId"><@s.if test="stationName!=fromPlaceName">请选择出发点</@s.if><@s.else>${fromPlaceName}</@s.else></span></p>
        <div class="citylist LISTSECOND">
            <h5>热门出发城市</h5>
                 <dl>
                    <dd>
                        <a data-name="北京" data-id="1" data-code="BJ" href="#">北京</a>
                        <a data-name="上海" data-id="79"  data-code="SH"  href="#">上海</a>
                        <a data-name="南京" data-id="82"  data-code="NJ" href="#">南京</a>
                        <a data-name="杭州" data-id="100"  data-code="HZ" href="#">杭州</a>
                        <a data-name="成都" data-id="279"  data-code="CD" href="#">成都</a>
                        <a data-name="广州" data-id="229"  data-code="GZ" href="#">广州</a>
                        <a data-name="三亚" data-id="272" data-code="SY" href="#">三亚</a>
                      </dd>
                </dl>
                
              <div class="pa_line"></div>
                    <h5>其他出发城市</h5>
                    <dl> <dd>
                        <a data-name="上海" data-id="79" href="#">上海</a>
                        <a data-name="苏州" data-id="87" href="#">苏州</a> 
                        <a data-name="无锡" data-id="83" href="#">无锡</a> 
                        <a data-name="杭州" data-id="100" href="#">杭州</a>
                        <a data-name="宁波" data-id="104" href="#">宁波</a> 
                        <a data-name="常州" data-id="86" href="#">常州</a> 
                        <a data-name="南京" data-id="82" href="#">南京</a>
                        <a data-name="嘉兴" data-id="108" href="#">嘉兴</a>  
                        <a data-name="温州" data-id="107" href="#">温州</a>  
                        <a data-name="南通" data-id="88" href="#">南通 </a>   
                        <a data-name="扬州" data-id="92" href="#">扬州</a>  
                        <a data-name="镇江" data-id="93" href="#">镇江</a>  
                        <a data-name="北京" data-id="1" href="#">北京</a>
                        <a data-name="绍兴" data-id="111" href="#">绍兴</a>  
                        <a data-name="福州" data-id="136" href="#">福州</a>  
                        <a data-name="金华" data-id="112" href="#">金华</a>  
                        <a data-name="湖州" data-id="109" href="#">湖州</a>   
                        <a data-name="台州" data-id="115" href="#">台州</a>  
                        <a data-name="武汉" data-id="199" href="#">武汉</a>  
                        <a data-name="青岛" data-id="161" href="#">青岛</a>  
                        <a data-name="盐城" data-id="91" href="#">盐城</a>  
                        <a data-name="广州" data-id="229" href="#">广州</a>   
                     </dd>
                    <dl>
                 
        </div>
    </div>
            <form class="form-search">
                <input type="text" x-webkit-speech placeholder="目的地/景点/酒店/主题"  class="input-search"><button type="button" class="btn-search xicon">搜索</button>
            </form>
            <span class="hot-travel">
                <@s.iterator value="(map.get('recommendInfoMainList')).get('${channelPage}_TOPRECOMMEND')" status="st">
                 <a target="_blank"   href="${url?if_exists}" hidefocus="false">${title?if_exists}</a>
                </@s.iterator>
            </span>
</div> <!-- //搜索框区域 -->