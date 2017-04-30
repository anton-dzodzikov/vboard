# Vacation Board

## Run project

### Run with Gradle (wrapper)
<pre>gradlew clean bootRun
        -PdbUrl=DATABASE_URL
        -PdbUser=DATABASE_USER
        -PdbPassword=DATABASE_PASSWORD</pre>

## Migration

### Clean database schema
<pre>gradlew clean flywayClean
        -Pflyway.url=DATABASE_URL
        -Pflyway.user=DATABASE_USER
        -Pflyway.password=DATABASE_PASSWORD</pre>

### Migrate database schema
<pre>gradlew clean flywayMigrate
        -Pflyway.url=DATABASE_URL
        -Pflyway.user=DATABASE_USER
        -Pflyway.password=DATABASE_PASSWORD</pre>