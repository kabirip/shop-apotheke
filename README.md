### Shop Apotheke Coding Challenge

This service supports the following features:

• A list of the most popular repositories, sorted by number of stars.

• An option to be able to view the top 10, 50, 100 repositories should be available.

• Given a date, the most popular repositories created from this date onwards should be
returned.

• A filter for the programming language would be a great addition to have.

### How to run the app

1. Build the project using maven: `mvn package`
2. Build the docker image `docker build -t shop-apotheke`
3. Run the docker container as follows: `docker run -d -p 80:8080 -t shop-apotheke`



