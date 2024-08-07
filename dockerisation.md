### Dockerisation

        docker build -t hello_devops:0.0.1-SNAPSHOT .

        docker run -d -p 8090:8080 --name=hello_devops hello_devops:0.0.1-SNAPSHOT

        docker ps