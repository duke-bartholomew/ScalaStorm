name := "scala-storm"

scalaVersion := "2.11.4"

val stormVersion = "0.9.3"

crossScalaVersions := Seq("2.10.4", "2.11.4")

organization := "com.github.velvia"

libraryDependencies += "org.apache.storm" % "storm-core" % (stormVersion) % "provided" exclude("junit", "junit")

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "org.apache.storm" % "storm-core" % (stormVersion) % "test" exclude("junit", "junit")

scalacOptions ++= Seq("-feature", "-deprecation", "-Yresolve-term-conflict:package")

// When doing sbt run, fork a separate process.  This is apparently needed by storm.
fork := true

resolvers += "clojars" at "https://clojars.org/repo"
