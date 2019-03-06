# ext-lib-amazon-mws-subscriptions
Mavenized version of Amazon MWS Subscription API

![Release](https://jitpack.io/v/ChameleonTartu/ext-lib-amazon-mws-subscriptions.svg)

# How to use into Maven (pom.xml)

At the moment, this library is not available at Maven Central.
Therefore, you need to add additional repository to fetch it from.

```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Dependency itself:
```
<dependency>
    <groupId>com.github.chameleontartu</groupId>
    <artifactId>ext-lib-amazon-mws-subscriptions</artifactId>
    <version>v1.0.0</version>
</dependency>
```

In case you want to have the latest updates you can specify `version` as `master-SNAPSHOT`.
```
<dependency>
    <groupId>com.github.chameleontartu</groupId>
    <artifactId>ext-lib-amazon-mws-subscriptions</artifactId>
    <version>master-SNAPSHOT</version>
</dependency>
```
