#!/usr/bin/env bash

java -classpath "lib/kotlinx-cli.jar:lib/h2-1.4.200.jar:lib/log4j-api-2.13.1.jar:lib/log4j-api-kotlin-1.0.0.jar:lib/log4j-core-2.13.1.jar:out/app.jar" xyz.sashenka.modelauthapp.MainKt "$@"
