<script type="text/javascript">

<%
    def debugAccount = ""
    def debugTrackEvent = ""
    if (grailsApplication.config.google.analytics.debug == true) {
        debugAccount = '"'+grailsApplication.config.google.analytics.account+'"'
        debugTrackEvent = 'category + " " + action + " " + label'
    }
%>

console.debug(<%= debugAccount %>);

var _gaq = _gaq || [];
_gaq.push(['_setAccount', '${grailsApplication.config.google.analytics.account}']);
_gaq.push(['_trackPageview']);

(function() {
var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
})();

var GoogleAnalyticsTracker = {
    trackEvent: function(category, action, label) {
        console.debug(<%= debugTrackEvent %>);
        _gaq.push(['_trackEvent', category, action, label]);
    },

    trackEventByCustomData: function(reference) {
        var category = reference.data("ga-category");
        var action = reference.data("ga-action");
        var label = reference.data("ga-label");
        GoogleAnalyticsTracker.trackEvent(category, action, label);
    },

    bindTrackEvent: function(select){
        $(select).click(function(){
            GoogleAnalyticsTracker.trackEventByCustomData($(this));
        });
    }
}

$(".ga-tracked").click(function(){
    GoogleAnalyticsTracker.trackEventByCustomData($(this));
});

</script>