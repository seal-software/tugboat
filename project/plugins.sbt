addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.3.2")

//Uncomment for bintray settings
//addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.2")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.3")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += "releases" at "http://nexus.seal-software.net/content/groups/plublic/"
