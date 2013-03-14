# Google Analytics Tracker Plugin

This plugin provides a simple way to embed your web application with page view tracking and event tracking of Google Analytics.

## Configuration

First of all, you need to set your analytics account id in `Config.groovy`.

	google.analytics.account="UA-YOURACCOUNT-ID"

You can also set a debug flag to print messages in browser console everytime a _gaq.push occur.

	google.analytics.debug=true

## Usage

Put the following tag in the end of the pages you want to track:

    <g:googleAnalyticsTracker/>

### Tracking Events

To track a click event, you simply add a `ga-tracked` class in the element, and declare the attributes `data-ga-category`, `data-ga-action` and `data-ga-label`.

For example:

    <a href="/about" class="ga-tracked" data-ga-category="home" data-ga-action="about" data-ga-label="label">About</a>

If you have elements that are loaded by Javascript, after the page is already loaded, and you want to track these elements, you must to use the `GoogleAnalyticsTracker.bindTrackEvent` function, passing the selector to these new elements.

For example:

    GoogleAnalyticsTracker.bindTrackEvent(".new-elements.ga-tracked");

You can also call directly `GoogleAnalyticsTracker.trackEvent`, that will make a push to Google Analytics with the values you passed:

    GoogleAnalyticsTracker.trackEvent("category", "action", "label");