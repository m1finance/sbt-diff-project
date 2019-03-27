publishMavenStyle := true

licenses := Seq("MIT" -> url("https://raw.githubusercontent.com/m1finance/sbt-diff-project/master/LICENSE"))

import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("m1finance", "sbt-diff-project", "j.symonds@m1finance.com"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/m1finance/sbt-diff-project"),
    "scm:git@github.com:m1finance/sbt-diff-project.git"
  )
)

homepage := Some(url("https://github.com/m1finance/sbt-diff-project"))
