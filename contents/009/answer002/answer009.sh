#!/bin/bash

function errorcheck() {
  local _retcode=${1:?}
  if [[ ${_retcode} -ne 0 ]]; then
    exit ${_retcode}
  fi
}

# 絎
if [[ ! -f ./Answer009.java ]]; then
  echo "scriptの配置ディレクトリに移動してから実行してください。" >&2
  exit 1
fi

javac Answer009.java
errorcheck $?

java Answer009 sample.properties
errorcheck $?

native2ascii -encoding UTF-8 sample.properties sample2.properties
errorcheck $?

java Answer009 sample2.properties
errorcheck $?

rm ./sample2.properties
errorcheck $?
