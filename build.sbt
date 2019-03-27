lazy val root = (project in file(".")).settings(
  sbtPlugin := true,
  name := "sbt-diff-project",
  licenses += "MIT" -> url("https://raw.githubusercontent.com/opt-tech/sbt-diff-project/master/LICENSE"),
  addSbtPlugin("com.mayreh" % "sbt-reverse-dependency" % "0.2.0"),

  version := "0.2.3",
  organization := "com.m1finance",
  organizationName := "M1 Finance",
  startYear := Some(2019),
  publishTo := sonatypePublishTo.value,
)
