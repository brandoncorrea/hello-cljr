# Hello Clojure CLR

A simple "Hello World" program in Clojure CLR

[![Tests](https://github.com/brandoncorrea/hello-cljr/actions/workflows/test.yml/badge.svg)](https://github.com/brandoncorrea/hello-cljr/actions/workflows/test.yml)

### Install Clojure CLR

    # Clojure.Main
    dotnet tool install --global Clojure.Main --version 1.12.0-alpha10

    # Clojure.Cljr
    dotnet tool install --global Clojure.Cljr --version 0.1.0-alpha5

### Build Dotnet

    cd src/dotnet/Hello
    dotnet build

### Run

    cljr -M:run

### Test

    # once
    cljr -M:test:spec

    # auto
    cljr -M:test:spec -a

### TODO

- [x] run
- [x] add dependencies
- [x] deps.edn
- [x] aliases
- [x] tests
- [x] rename clj to cljr
- [ ] add cljs
- [ ] share cljc
- [x] add and use local .NET class
