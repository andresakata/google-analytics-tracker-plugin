class GoogleAnalyticsTrackerGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "2.1 > *"
    def dependsOn = [:]
    def pluginExcludes = [
    ]

    def title = "Google Analytics Tracker Plugin"
    def author = "André Guimarães Sakata"
    def authorEmail = "andre.sakata@informant.com.br"
    def description = "This plugin provides a simple way to embed your web application with page view tracking and event tracking of Google Analytics."
    def documentation = "http://grails.org/plugin/google-analytics-tracker-plugin"

    // Details of company behind the plugin (if there is one)
    //def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

    // Any additional developers beyond the author specified above.
    //def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
    //def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
    //def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}