# akkaGrpcGradlePluginIssue
How to reproduce:
1. Run `./gradlew jar` on a clean project, then we'll get a broken jar which only includes SomeServiceImpl.class.
2. Running the jar task again can finally produce the correct jar file.
