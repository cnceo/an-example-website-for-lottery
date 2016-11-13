<div class="clear">
      <div class="module-sidebar module-sidebar-discount">
        <div class="discount-sticker">
          <div class="title">
            <h2>全部优惠</h2><h6>Discount</h6>
          </div>
          <div class="body">
            <ul class="anchor-jump">
             <#list plist as pd>
             	 <li><a id="promos-${pd.id}" onclick="goMd('discount-${pd.id}');" rel="#discount-${pd.id}">${pd.pmsTitle}</a></li>
              </#list> 
            </ul>
          </div>
        </div>
      </div>
      <div class="module-content module-discount">
        <div class="discount-group">
         <#list plist as pd>
          <div class="discount-section" id="discount-${pd.id}">
            <div class="discount-section-head">
              <div class="text clear">
                <h2>${pd.pmsTitle}</h2><h6>${pd.pmsSubTitle}</h6>
              </div>
              <div class="thumb">
                <img src="${pd.pmsSmallPic}" width="132" alt="">
              </div>
              <span class="time">${pd.pmsModel}</span>
            </div>
            <div class="discount-section-content">
	              <#if pd.pmsShowType=="pic">
	              	<img src="${pd.pmsBigPic}" alt="">
	              	<#else>
	              	${pd.pmsContent}
	              </#if>
	        </div>
          </div>
		</#list>
        </div>
      </div>
</div>
<script>
  $(function(){

$('.discount-group').accordion({
  active: false,
  collapsible: true,
  animate: 500,
  heightStyle: 'content',
  header: '.discount-section-head'
});
  })
  
  
function initPromos(){
	if(""!=promosId){
	 var rel = $("#promos-"+promosId).attr('rel');
	  var pos = $(rel).offset().top-100;
	  $('html, body').animate({scrollTop:pos}, 500);
	}
	promosId="";
}
initPromos();

function goMd(id){
  window.location.hash="";
  window.location.hash = id;
}
</script>
