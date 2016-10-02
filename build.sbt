import bintray.Keys._

scalaVersion := "2.11.8"

resolvers += Resolver.jcenterRepo

lazy val commonSettings = Seq(
  version in ThisBuild := "1.0",
  organization in ThisBuild := "com.hdbandit"
)

lazy val root = (project in file(".")).
  settings(commonSettings ++ bintrayPublishSettings: _*).
  settings(
    sbtPlugin := true,
    name := "sbt_twitter_plugin",
    description := "Plugin to integrate tweet publications",
    licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html")),
    publishMavenStyle := false,
    repository in bintray := "sbt-plugins",
    bintrayOrganization in bintray := None,
    vcsUrl in bintray := None,
    libraryDependencies ++= Seq(
      "org.twitter4j" % "twitter4j" % "4.0.5"
    )
  )