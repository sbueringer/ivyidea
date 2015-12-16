## News ##


---


  * **ivyidea-1.0.10 released**. This release fixes a compatibility problem with IntelliJ IDEA 13.1. It can be installed through the plugin manager in IntelliJ.

  * **ivyidea-1.0.9 released**. This release contains Apache Ivy 2.4.0-RC1 and has improved source/javadoc handling. It can be installed through the plugin manager in IntelliJ.

  * **ivyidea-1.0.8 released**. This release fixes a compatibility problem with IntelliJ IDEA 13.0.2 EAP (build 133.609). It can be installed through the plugin manager in IntelliJ.

  * **ivyidea-1.0.6 released**. This is a bugfix release with improved compatibility with IntelliJ IDEA 13 beta1. It can be installed through the plugin manager in IntelliJ.

  * **ivyidea-1.0.3 released**. This release contains Apache Ivy 2.3.0-RC2. It can be installed through the plugin manager in IntelliJ.

  * **ivyidea-1.0.2 released**. This release contains Apache Ivy 2.3.0-RC1. It can be installed through the plugin manager in IntelliJ.

  * **ivyidea-1.0 released**. This release fixes some compatibility issues with IntelliJ IDEA 11. It can be installed through the plugin manager in IntelliJ.

  * **ivyidea-0.9-beta6 released**. This release fixes some bugs introduced in beta4 and can be installed through the plugin manager in IntelliJ IDEA. To install this new version manually, just delete the current IvyIDEA subfolder of your IntelliJ plugins folder, extract the [0.9-beta6 archive](http://ivyidea.googlecode.com/files/IvyIDEA-0.9-beta6.zip) and startup IntelliJ.

  * 0.9-beta4 release available in the [downloads section](http://code.google.com/p/ivyidea/downloads/list), to install just delete the current IvyIDEA subfolder of your IntelliJ plugins folder, extract the [0.9-beta4 archive](http://ivyidea.googlecode.com/files/IvyIDEA-0.9-beta4.zip) and startup IntelliJ. This release adds some new features ([features](ZeroDotNineBetaFourFeatures.md)). Known issue: exception when there are unresolved dependencies in some cases, compatibility with IntelliJ 8 broken - (will be fixed).

  * 0.9-beta2 release available in the [downloads section](http://code.google.com/p/ivyidea/downloads/list), to install just delete the current IvyIDEA subfolder of your IntelliJ plugins folder, extract the [0.9-beta2 archive](http://ivyidea.googlecode.com/files/IvyIDEA-0.9-beta2.zip) and startup IntelliJ. This release does not introduce much new functionality but should resolve a few annoying issues from 0.9-beta1 ([features](ZeroDotNineBetaOneFeatures.md))


## Info ##

  * Releases are available through the plugin manager in IntelliJ IDEA. Alternatively you can also grab it from the [IvyIDEA plugin page at JetBrains](http://plugins.intellij.net/plugin/?id=3612) (not recommended).

  * A [Getting Started guide](http://www.jetbrains.net/confluence/display/CONTEST/Getting+Started) is now available on the [IvyIDEA confluence space](http://www.jetbrains.net/confluence/display/CONTEST/IvyIDEA).


---


**Usage**

Configure the ivysettings file (usually called ivyconf.xml or ivysettings.xml) in the project settings. Add an IvyIDEA facet for every module you have that uses ivy (if it was not autodetected already) and point it to the ivy.xml file for that module.
You can now resolve your dependencies through the Tools > IvyIDEA Resolve menu or through the right click menu of the project explorer.

For a more detailed guide with screenshots, you can go to the GettingStarted page.


---


**Features:**
  * Apache Ivy integration (up to v2.3.0); no need for external ant build scripts to be called
  * Detection of intellij module dependencies; these are added as module references
  * Detect source/document/jar type artifacts of dependencies and add them as such to the module
  * Creation of module library with all resolved ivy dependencies
  * Facets for ivy modules containing ivy files
  * Allow setting the ivy configurations to resolve and add as a library [ide/default/provided/tools/test/...]
  * Compatibile with mac os (jdk 1.5)
  * Compatibile with IntelliJ 7 - 11
  * Show ivy resolve messages in a console (basic)

**Nice-to-haves:**
  * Show resolve report in Intellij (report xml transformed through the ivy xsl)
  * Respect the order of dependencies in the ivy.xml file if feasible (this means that a module library can't always be used -> module and jar dependencies might be interleaved)
  * ~~Auto re-resolve on changed ivy.xml file~~ (is this even useful?)

**Wild ideas for the future**
  * Intellisense in ivy files (known organisations, artifacts, ...)

Any remarks/suggestions of your own? [Just send an e-mail!](mailto:guy.mahieu@gmail.com)


---


**Links**

[IvyIDEA plugin page at JetBrains](http://plugins.intellij.net/plugin/?id=3612)

[Intellij IDEA](http://www.intellij.com)

[Apache Ant Ivy](http://ant.apache.org/ivy)
