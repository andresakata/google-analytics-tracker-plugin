# Google Analytics Tracker Plugin

This plugin provides a simple way to embed your web application with page view tracking and event tracking of Google Analytics.

## Configuration

First of all, you need to set your analytics account id in Config.groovy.

	google.analytics.account="UA-YOURACCOUNT-ID"

You can also set a debug flag to print messages in browser console everytime a _gaq.push occur.

	google.analytics.debug=true

## Usage