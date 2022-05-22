<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Gradle multi-project draft</h1>
    <details open>
        <summary><b>About this repository</b></summary>
        <ul>
            Draft of a multi-project (module) project with jib docker (+spring)
        </ul>
    </details>
    <details open>
        <summary><b>Command</b></summary>
        <ol>
            <li><b>Push img to remote registry:
                </b><br>./gradlew :draft-module:clean
                </b><br>./gradlew :draft-module:build
                </b><br>./gradlew :draft-module:jib
            </li>
            <br>
            <li><b>Build img localy:</b>
                <br>./gradlew :draft-module:jibDockerBuild
            </li>
            <br>
            <li>
                <b>Run variation:</b>
                <ul>
                    <li>
                        docker run --rm --name rest-service \
                        <br>-p 8080:8080 \
                        <br>registry.gitlab.com/makhlov/personal-registry/hello-docker-java:v1
                    </li>
                    <br>
                    <li>
                        docker run --rm --name rest-service \
                        <br>--memory=256m \
                        <br>--cpus 2 \
                        <br>-p 8080:8080 \
                        <br>-e JAVA_TOOL_OPTIONS="-XX:InitialRAMPercentage=80 -XX:MaxRAMPercentage=80 -XX:+UseSerialGC" \
                        <br>registry.gitlab.com/makhlov/personal-registry/hello-docker-java:v1
                    </li>
                </ul>
            </li>
        </ol>
    </details>
    <div class="main-content">
    </div>
</body>
</html>