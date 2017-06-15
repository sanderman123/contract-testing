#!/usr/bin/env bash

./mvnw surefire:test -Dtest=MockServerRunner -DrunMockServer
