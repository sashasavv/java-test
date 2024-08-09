To run E2E tests: 

1. Download and put geckodriver into `/bin` directory in the root of the project.
2. Start the local server with QE-index.html page by running `mvn clean verify -P server-up`.
3. Open another terminal and run `mvn clean verify -P e2e`.