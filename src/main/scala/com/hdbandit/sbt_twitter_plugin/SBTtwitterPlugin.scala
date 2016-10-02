package com.hdbandit.sbt_twitter_plugin

import sbt._
import sbt.complete.Parsers._
import sbt.AutoPlugin

object SBTtwitterPlugin extends AutoPlugin {

  // val twitterUser = SettingKey[String]("Twitter user", "User used to publish a tweet")
  // val twitterUserPassword = SettingKey[String]("Twitter user password", "Twitter account password")

  val tweet = inputKey[Unit]("Publish a tweet task")

  tweet := {
    val args: Seq[String] = spaceDelimited("<arg>").parsed
    args foreach updateStatus
  }

  def updateStatus(msg: String): Unit = println(msg)

}
