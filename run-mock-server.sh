#!/usr/bin/env bash

mvn surefire:test -Dtest=MockServerRunner -DrunMockServer
