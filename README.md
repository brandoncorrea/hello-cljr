# Hello Clojure CLR

A simple "Hello World" program in Clojure CLR

### Install Clojure CLR

    # Clojure.Main
    dotnet tool install --global Clojure.Main --version 1.12.0-alpha10

    # Clojure.Cljr
    dotnet tool install --global Clojure.Cljr --version 0.1.0-alpha4

### Run

    cljr -M:run

### Test

    # once
    cljr -M:test:spec

    # auto
    cljr -M:test:spec -a

### TODO

- [X] run
- [x] add dependencies
- [x] deps.edn
- [x] aliases
- [x] tests
- [x] rename clj to cljr
- [ ] add cljs
- [ ] share cljc
- [ ] add and use local .NET class
