class GoogleAnalyticsTrackerTagLib {
    def googleAnalyticsTracker = { attrs, body ->
        out << render(template: "/googleAnalyticsTracker/googleAnalyticsTracker", plugin: "google-analytics-tracker")
    }
}